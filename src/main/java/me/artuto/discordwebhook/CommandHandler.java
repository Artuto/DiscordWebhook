/*
 * Copyright (C) 2017 Artu
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
package me.artuto.discordwebhook;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

public class CommandHandler implements CommandExecutor
{
    @Override
    public boolean onCommand(CommandSender executor, Command cmd, String label, String[] args)
    {
        if (cmd.getName().toLowerCase().equals("webhook"))
        {
            if(args.length==0)
            {
                executor.sendMessage(ChatColor.DARK_BLUE+"-====== Webhook Help ======-"+ChatColor.RESET +
                        "\n/webhook about - Shows information about the plugin" +
                        "\n/webhook help - Shows this message");
            }
            else if(args[0].equals("about"))
            {
                executor.sendMessage("Plugin made by "+ChatColor.GREEN+"Artuto" +
                        ChatColor.RESET+"\nPlugin Version: "+ChatColor.GREEN+Const.VERSION+ChatColor.RESET +
                        "\nDonations are accepted! "+ChatColor.AQUA+"https://paypal.me/artuto");
            }
            else if(args[0].equals("help"))
            {
                executor.sendMessage(ChatColor.DARK_BLUE+"-====== Webhook Help ======-"+ChatColor.RESET +
                        "\n/webhook about - Shows information about the plugin" +
                        "\n/webhook help - Shows this message");
            }
            return true;
        }

        return false;
    }
}
