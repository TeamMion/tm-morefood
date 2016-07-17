#!/usr/bin/env bash

# Update
npm run update

# IDE to configure for
read -p "IDE to configure for: [idea|eclipse] " ide
if [ ! "${ide,,}" == "idea" ] && [ ! "${ide,,}" == "eclipse" ]
then
    ide=""
    echo "No valid IDE! No IDE will be configured."
fi

# Executing gradlew
echo "Executing gradlew..."
JAVA_OPTS="-Xmx2g" ./gradlew setupDecompWorkspace $ide
