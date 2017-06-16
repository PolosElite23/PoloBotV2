package bot.polobot.Commands.ImgCommands;

import bot.polobot.Commands.BotCommand;
import net.dv8tion.jda.core.events.message.MessageReceivedEvent;

import java.io.File;
import java.io.IOException;

/**
 * Created by Jason on 6/16/2017.
 */
public class ImgDeadCommand implements BotCommand
{
    public static void Execute(MessageReceivedEvent event)
    {
        File img = new File("C:\\Users\\Jason\\IdeaProjects\\PoloBot Attempt 2\\src\\bot\\polobot\\img\\dead.png");
        try
        {
            event.getChannel().sendFile(img, null).queue();
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
    }
}