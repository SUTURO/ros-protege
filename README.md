# ros-protege

Following improvements have been made to the original Protege Desktop application:

* Ability to automatically resolve ontology imports from other sourced ROS packages via `rospack find` if they have the
  following format: `<owl:imports rdf:resource="package://knowrob/owl/URDF.owl"/>`
* Changed default view mode to `Show all loaded ontolgies`  
  _(This fixes a bug of the OWL API not properly merging loaded ontologies from ROS packages, which led to missing
  classes in the class tree view)_

## Requirements

* Unix System with ROS installed
* Java 11 or higher
* `JAVA_HOME` environment variable must be set to the JDK installation directory

## Usage

1. Make sure you have installed the [requirements](#requirements)
2. Clone and download this repository to your desired location
3. Build the project using the build script
    ```bash
    sh build.sh
    ```
4. Run ros-protege using the start script
    ```bash
    sh start.sh
    ```

## Contributing

### Recommend Code Editor

We recommend using [IntelliJ IDEA](https://www.jetbrains.com/idea/) as code editor for this project.

### Getting Started

1. Open the project in IntelliJ IDEA
2. Make your changes 
3. Execute the Run-Configuration `Launcher` to start the application

# Protege Desktop

[Protege](http://protege.stanford.edu) is a free, open-source ontology editor that supports the
latest [OWL 2.0 standard](http://www.w3.org/TR/owl2-overview/). Protege has a pluggable architecture, and
many [plugins](http://protegewiki.stanford.edu/wiki/Protege_Plugin_Library) for different functionalities are available.

To read more about **Protege's features**, please visit the Protege [home page](http://protege.stanford.edu).

The latest version of Protege can be [downloaded](http://protege.stanford.edu/products.php#desktop-protege) from the
Protege website, or from [github](https://github.com/protegeproject/protege-distribution/releases).

If you would like to contribute to the Protege Project please see
our [contributing guide](https://github.com/protegeproject/protege/blob/master/CONTRIBUTING.md)

The [Developer Documentation](https://github.com/protegeproject/protege/wiki/Developer-Documentation) may be found on
the wiki.

**Looking for support?** Please ask questions on the [protege-user](http://protege.stanford.edu/support.php)
or [protege-dev](http://protege.stanford.edu/support.php) mailing lists. If you found a bug or would like to request a
feature, you may also use [this issue tracker](https://github.com/protegeproject/protege/issues).

Protege is released under
the [BSD 2-clause license](https://raw.githubusercontent.com/protegeproject/protege/master/license.txt).

Instructions for [building from source](https://github.com/protegeproject/protege/wiki/Building-from-Source) are
available on the the wiki.
