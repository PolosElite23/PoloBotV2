package bot.polobot.Utils;

/**
 * Created by Jason on 4/10/2017.
 */
public class CommandParser {

    public static String Parse(String message){
        if(message.startsWith("!test")){
            return "TestCommand";
        } else if(message.startsWith("!poi")) {
            return "ImgPoiCommand";
        } else if(message.startsWith("!remind")){
            return "CreateRemindCommand";
        } else if(message.startsWith("!recall")){
            return "RecallRemindCommand";
        } else if(message.startsWith("!delrecall")){
            return "DeleteRemindCommand";
        } else if(message.startsWith("!sleep")){
            return "ImgSleepCommand";
        } else if(message.startsWith("!nosleep")){
            return "ImgNoSleepCommand";
        } else if(message.startsWith("!dead")){
            return "ImgDeadCommand";
        } else {
            return "NoCommand";
        }
    }
}
