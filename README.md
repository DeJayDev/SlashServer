SlashServer-Velocity
===========
![Velocity 2.0.0-SNAPSHOT](https://img.shields.io/badge/Velocity%20-2.0.0--SNAPSHOT-blue.svg)
![Java 11](https://img.shields.io/badge/Java%20-11-blue.svg)

A fork of Willsr71/SlashServer, this plugin adds /server command aliases for Velocity 2.0.0-SNAPSHOT servers.

Running BungeeCord/Waterfall? Check out DeJayDev/SlashServer-Bungee.

For example:
* /server lobby can now be used as /lobby
* /server survival can now be used as /survival

Server commands require the permission nodes of server.\<name\>

**Note: Server commands and permission nodes are the lowercase form of the server name**

`/reloadss` reloads the plugin and requires the permission node `slashserver.reload`

##### "Why fork"?

Sometimes users want certain features these plugins don't support, or these plugins' APIs have long
progressed past the way these plugins implement them. SlashServer-Bungee and SlashServer-Velocity
will try their hardests to stay up to date for their respective platforms.

Feel free to open an issue for feature requests or to notify me of any API changes.
