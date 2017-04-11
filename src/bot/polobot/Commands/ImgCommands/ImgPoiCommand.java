package bot.polobot.Commands.ImgCommands;

import net.dv8tion.jda.core.events.message.MessageReceivedEvent;
import java.io.File;
import java.io.IOException;

/**
 * Created by Jason on 4/10/2017.
 */
public class ImgPoiCommand {
    public static void Execute(MessageReceivedEvent event) {
        File poi = new File("C:\\Users\\Jason\\IdeaProjects\\PoloBot Attempt 2\\src\\bot\\polobot\\img\\poi.jpg");
        try {
            event.getChannel().sendFile(poi, null).queue();
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
