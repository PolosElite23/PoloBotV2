package bot.polobot.Utils;

import bot.polobot.Commands.ImgCommands.ImgDeadCommand;
import bot.polobot.Commands.ImgCommands.ImgNoSleepCommand;
import bot.polobot.Commands.ImgCommands.ImgSleepCommand;
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

        String command = CommandParser.Parse(message);

        switch (command)
        {
            case "TestCommand": TestCommand.Execute(event); break;
            case "ImgPoiCommand": ImgPoiCommand.Execute(event); break;
            case "CreateRemindCommand" : CreateRemindCommand.Execute(event); break;
            case "RecallRemindCommand" : RecallRemindCommand.Execute(event); break;
            case "DeleteRemindCommand" : DeleteRemindCommand.Execute(event); break;
            case "ImgSleepCommand" : ImgSleepCommand.Execute(event); break;
            case "ImgNoSleepCommand" : ImgNoSleepCommand.Execute(event); break;
            case "ImgDeadCommand" : ImgDeadCommand.Execute(event); break;
            case "NoCommand": break;
            default: break;
        }
    }
}
