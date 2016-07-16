#!/usr/bin/env bash

# Get version
version="$(node <<< "console.log(require(\"./package.json\").version);")"
echo "Version: $version"

# Update build.gradle
echo "Updating build.gradle..."
while IFS="" read line
do
    if [ "${line:0:10}" == "version = " ]
    then
        old_version="$line"
    fi
done < build.gradle
sed -i "/$old_version/c\version = \"$version\"" build.gradle
