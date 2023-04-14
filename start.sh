#!/bin/bash

DIR=$(dirname "$(readlink -f "$0")")
echo "$DIR"

cd "$DIR"/protege-desktop/target/protege-5.6.1-platform-independent/Protege-5.6.12/ || exit

./run.sh