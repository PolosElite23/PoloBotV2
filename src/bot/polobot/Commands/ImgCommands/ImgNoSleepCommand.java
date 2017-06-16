package bot.polobot.Commands.ImgCommands;

import bot.polobot.Commands.BotCommand;
import net.dv8tion.jda.core.events.message.MessageReceivedEvent;

import java.io.File;
import java.io.IOException;
import java.util.Random;

/**
 * Created by Jason on 6/16/2017.
 */
public class ImgNoSleepCommand implements BotCommand
{
    public static void Execute(MessageReceivedEvent event)
    {
        Random rand = new Random();

        String[] NoSleepImgs = {"C:\\Users\\Jason\\IdeaProjects\\PoloBot Attempt 2\\src\\bot\\polobot\\img\\nosleep\\nosleep1.png",
                "C:\\Users\\Jason\\IdeaProjects\\PoloBot Attempt 2\\src\\bot\\polobot\\img\\nosleep\\nosleep2.png",
                "C:\\Users\\Jason\\IdeaProjects\\PoloBot Attempt 2\\src\\bot\\polobot\\img\\nosleep\\nosleep3.jpg",
                "C:\\Users\\Jason\\IdeaProjects\\PoloBot Attempt 2\\src\\bot\\polobot\\img\\nosleep\\nosleep4.jpg",
                "C:\\Users\\Jason\\IdeaProjects\\PoloBot Attempt 2\\src\\bot\\polobot\\img\\nosleep\\nosleep5.png"
        };

        int n = rand.nextInt(NoSleepImgs.length);

        String SelectedImg = NoSleepImgs[n];

        File SelectedNoSleep = new File(SelectedImg);

        try
        {
            event.getChannel().sendFile(SelectedNoSleep, null).queue();
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
    }
}
