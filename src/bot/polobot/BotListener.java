package bot.polobot;

import bot.polobot.Commands.CommandParser;
import bot.polobot.Commands.TextCommands.CreateRemindCommand;
import bot.polobot.Commands.ImgCommands.ImgPoiCommand;
import bot.polobot.Commands.TextCommands.DeleteRemindCommand;
import bot.polobot.Commands.TextCommands.RecallRemindCommand;
import bot.polobot.Commands.TextCommands.TestCommand;
import net.dv8tion.jda.core.events.message.MessageReceivedEvent;
import net.dv8tion.jda.core.hooks.ListenerAdapter;

/**
 * Created by Jason on 4/10/2017.
 */
public class BotListener extends ListenerAdapter
{
    public void onMessageReceived (MessageReceivedEvent event) {
        String message = event.getMessage().getContent();

        String command;

        command = CommandParser.Parse(message);

        switch (command)
        {
            case "test": TestCommand.Execute(event); break;
            case "ImgPoi": ImgPoiCommand.Execute(event); break;
            case "Remind" : CreateRemindCommand.Execute(event); break;
            case "Recall" : RecallRemindCommand.Execute(event); break;
            case "DelRecall" : DeleteRemindCommand.Execute(event); break;
            case "NoCommand": break;
            default: break;
        }
    }
}
