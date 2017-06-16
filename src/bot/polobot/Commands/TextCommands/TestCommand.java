package bot.polobot.Commands.TextCommands;

import bot.polobot.Commands.BotCommand;
import net.dv8tion.jda.core.events.message.MessageReceivedEvent;

/**
 * Created by Jason on 4/10/2017.
 */
public class TestCommand implements BotCommand {

    public static void Execute(MessageReceivedEvent event)
    {
        String name = event.getAuthor().getName();

        String response = name + ", hi! This Bot is online!";

        event.getTextChannel().sendMessage(response).queue();
    }
}