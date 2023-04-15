# ros-protege

ros-protege adds the ability to automatically resolve ontology imports from other sourced ROS packages
via `rospack find` if they have the following format: `<owl:imports rdf:resource="package://knowrob/owl/URDF.owl"/>`

## Requirements

Tested to run on Ubuntu 20.04 with Java 11 or Java 17

## Usage

1. Make sure you have installed the [requirements](#requirements)
2. Build the project using the build script
    ```bash
    sh build.sh
    ```
3. Run ros-protege using the start script
    ```bash
    sh start.sh
    ```

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
