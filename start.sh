#!/bin/bash

PROTEGE_VERSION=5.6.2
DIR=$(dirname "$(readlink -f "$0")")
echo "$DIR"

cd "$DIR/protege-desktop/target/protege-$PROTEGE_VERSION-platform-independent/Protege-$PROTEGE_VERSION/" || exit

./run.sh