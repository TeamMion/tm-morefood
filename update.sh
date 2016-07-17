#!/usr/bin/env bash

# Get version
modid="$(node <<< "console.log(require(\"./package.json\").name);")"
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
sed -i "/group/c\group = \"io.teammion.morefood\"" build.gradle
sed -i "/archivesBaseName/c\archivesBaseName = \"$modid\"" build.gradle

# Update MoreFood.java
echo "Updating MoreFood.java..."
sed -i "/@Mod(/c\@Mod(modid = \"$modid\")" src/main/java/io/teammion/morefood/MoreFood.java

# Update mcmod.info
echo "Updating mcmod.info..."
sed -i "/modid/c\        \"modid\": \"$modid\"," src/main/resources/mcmod.info
