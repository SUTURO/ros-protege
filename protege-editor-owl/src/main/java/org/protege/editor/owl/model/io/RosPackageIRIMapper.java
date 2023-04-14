package org.protege.editor.owl.model.io;

import java.io.BufferedReader;
import java.io.File;
import java.io.InputStreamReader;
import java.util.Optional;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;

import org.semanticweb.owlapi.model.IRI;
import org.semanticweb.owlapi.model.OWLOntologyIRIMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * This custom mapper tries to resolve ontology imports from other sourced ROS packages via {@code rospack find} if they have the following format:
 * <br>
 * {@code <owl:imports rdf:resource="package://knowrob/owl/URDF.owl"/>}
 */
public class RosPackageIRIMapper implements OWLOntologyIRIMapper {

    private static final Logger logger = LoggerFactory.getLogger(RosPackageIRIMapper.class);

    @Nullable
    @Override
    public IRI getDocumentIRI(@Nonnull IRI iri) {

        Optional<IRI> rosIRI = resolveRosPackageImport(iri);

        return rosIRI.orElse(null);
    }

    /**
     * Tries to get the system path based on a ROS package reference.
     * It will use the system call {@code rospack find} which will not work on non-Unix systems. But you shouldn't be opening ROS documents
     * there anyway.
     *
     * @param ontologyIRI the IRI containing the relative path.
     * @return The IRI of the specific file path
     */
    private Optional<IRI> resolveRosPackageImport(IRI ontologyIRI) {

        if (ontologyIRI.toString().startsWith("package://")) {

            String givenUri = ontologyIRI.toString();
            givenUri = givenUri.replaceFirst("package://", "");
            int firstSlash = givenUri.indexOf("/");
            String rosPackageName = givenUri.substring(0, firstSlash);
            String filePath = givenUri.substring(firstSlash);

            try {

                Runtime r = Runtime.getRuntime();
                Process p = r.exec("rospack find " + rosPackageName);
                p.waitFor();

                try (BufferedReader b = new BufferedReader(new InputStreamReader(p.getInputStream()))) {

                    String packagePath = b.readLine();

                    if (packagePath != null)
                        return Optional.of(IRI.create(new File(packagePath, filePath)));
                    else
                        return Optional.empty();
                }

            } catch (Exception e) {
                logger.error("Failed to find ROS Package {} to resolve import with IRI {}", rosPackageName, givenUri);
            }
        }
        return Optional.empty();
    }
}
