# DiscordWebhook

If you are looking for the binary version of the plugin, just head over
to https://www.spigotmc.org/resources/discord-webhook.51537/


## How to Install

Assuming you are installing from a build:

You will first need to have a [Spigot](https://www.spigotmc.org/)
Minecraft server running. Then copy the following JAR to the Spigot
build folder:

DiscordWebhook-Spigot-1.0.1-jar-with-dependencies.jar

## How to Configure

On first launch the server will complain that the "The Webhook URL is empty!".
At this point modify the new `DiscordWebhook/config.yml` that was created
in the plugin folder.

Set the URL to the one given to you by Discord and then restart the server.
At this point you should see your first message in the Discord channel you
created the webhook for.

## How to Build

If you are looking to make changes, then you'll need to get both the JDK
(Java Development Kit) and Maven installed on your computer.

These may be available via your system's package manager (apt, chocolatey, brew, MacPorts) or directly from the source sites:

  - https://www.oracle.com/java/technologies/javase-downloads.html
  - https://maven.apache.org/

Once you have them set up you'll need to run Maven:

```
mvn package
```