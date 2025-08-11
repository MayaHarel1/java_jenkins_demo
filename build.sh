#!/bin/bash
set -e

# Parameters from Jenkins
NAME=${1:-World}
ENVIRONMENT=${2:-DEV}

# Compile Java code
javac HelloWorld.java

# Run Java app
java -cp src HelloWorld "$NAME" "$ENVIRONMENT"
