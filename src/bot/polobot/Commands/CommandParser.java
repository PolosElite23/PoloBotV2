package bot.polobot.Commands;

/**
 * Created by Jason on 4/10/2017.
 */
public class CommandParser {

    public static String Parse(String message){
        if(message.startsWith("!test")){
            return "test";
        } else if(message.startsWith("!poi")) {
            return "ImgPoi";
        } else if(message.startsWith("!remind")){
            return "Remind";
        } else if(message.startsWith("!recall")){
            return "Recall";
        } else if(message.startsWith("!delrecall")){
            return "DelRecall";
        } else {
            return "NoCommand";
        }
    }
}
