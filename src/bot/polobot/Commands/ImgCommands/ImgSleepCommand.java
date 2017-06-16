package bot.polobot.Commands.ImgCommands;

import bot.polobot.Commands.BotCommand;
import net.dv8tion.jda.core.events.message.MessageReceivedEvent;

import java.io.File;
import java.io.IOException;
import java.util.Random;

/**
 * Created by Jason on 6/16/2017.
 */
public class ImgSleepCommand implements BotCommand
{
    public static void Execute(MessageReceivedEvent event)
    {
        Random rand = new Random();

        String[] SleepImgs = {"C:\\Users\\Jason\\IdeaProjects\\PoloBot Attempt 2\\src\\bot\\polobot\\img\\sleep\\sleep1.png",
                "C:\\Users\\Jason\\IdeaProjects\\PoloBot Attempt 2\\src\\bot\\polobot\\img\\sleep\\sleep2.png",
                "C:\\Users\\Jason\\IdeaProjects\\PoloBot Attempt 2\\src\\bot\\polobot\\img\\sleep\\sleep3.jpg",
                "C:\\Users\\Jason\\IdeaProjects\\PoloBot Attempt 2\\src\\bot\\polobot\\img\\sleep\\sleep4.png",
                "C:\\Users\\Jason\\IdeaProjects\\PoloBot Attempt 2\\src\\bot\\polobot\\img\\sleep\\sleep5.png",
                "C:\\Users\\Jason\\IdeaProjects\\PoloBot Attempt 2\\src\\bot\\polobot\\img\\sleep\\sleep6.jpg",
                "C:\\Users\\Jason\\IdeaProjects\\PoloBot Attempt 2\\src\\bot\\polobot\\img\\sleep\\sleep7.png",
                "C:\\Users\\Jason\\IdeaProjects\\PoloBot Attempt 2\\src\\bot\\polobot\\img\\sleep\\sleep8.jpg",
                "C:\\Users\\Jason\\IdeaProjects\\PoloBot Attempt 2\\src\\bot\\polobot\\img\\sleep\\sleep9.png",
                "C:\\Users\\Jason\\IdeaProjects\\PoloBot Attempt 2\\src\\bot\\polobot\\img\\sleep\\sleep10.png",
                "C:\\Users\\Jason\\IdeaProjects\\PoloBot Attempt 2\\src\\bot\\polobot\\img\\sleep\\sleep11.png",
                "C:\\Users\\Jason\\IdeaProjects\\PoloBot Attempt 2\\src\\bot\\polobot\\img\\sleep\\sleep12.jpg",
                "C:\\Users\\Jason\\IdeaProjects\\PoloBot Attempt 2\\src\\bot\\polobot\\img\\sleep\\sleep13.png"};

        int n = rand.nextInt(SleepImgs.length);

        String SelectedImg = SleepImgs[n];

        File SelectedSleep = new File(SelectedImg);

        try
        {
            event.getChannel().sendFile(SelectedSleep, null).queue();
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
    }
}
