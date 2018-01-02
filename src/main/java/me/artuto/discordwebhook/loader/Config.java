/*
 * Copyright (C) 2018 Artu
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package me.artuto.discordwebhook.loader;

import org.bukkit.configuration.file.FileConfiguration;

public class Config
{
    private final FileConfiguration config;

    public Config(FileConfiguration config)
    {
        this.config = config;
        config.addDefault("webhookUrl", "https://canary.discordapp.com/api/webhooks");
        config.options().copyDefaults(true);
    }

    public String getUrl()
    {
        return config.getString("webhookUrl");
    }
}