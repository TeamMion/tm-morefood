#!/usr/bin/env bash

# Update
npm run update

# Executing gradlew
echo "Executing gradlew..."
./gradlew clean build
