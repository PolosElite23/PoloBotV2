package bot.polobot.Commands.TextCommands;

import bot.polobot.Utils.Constants;
import net.dv8tion.jda.core.events.message.MessageReceivedEvent;

/**
 * Created by Jason on 4/10/2017.
 */
public class RecallRemindCommand {
    public static void Execute(MessageReceivedEvent event)
    {
        System.out.println("Recall firing");

        String user = event.getAuthor().getName();
        String message = event.getMessage().getContent().toString();
        int reminderNumber = 0;

        String reminderID = message.replace("!recall ","");
        try {
            reminderNumber = Integer.parseInt(reminderID);
        } catch (NumberFormatException e){
            e.printStackTrace();

            String errorResponse = "I'm Sorry, " + user + "I can't understand that. Make sure you put in: ```!recall *number*``` or else I can't understand it!";
            event.getTextChannel().sendMessage(errorResponse);
        }

        reminderNumber = reminderNumber - 1;
        if (reminderNumber < 0)
        {
            reminderNumber = 0;
        }

        try
        {
            String reminder;
            reminder = Constants.remindList.get(reminderNumber);

            String reminderResponse = user + ", the requested reminder is: " + "```" + reminder + "```";
            event.getTextChannel().sendMessage(reminderResponse).queue();
        } catch (IndexOutOfBoundsException e){
            String errorResponse = "I'm Sorry, " + user + " That was invalid. There is no value in that reminder";
            event.getTextChannel().sendMessage(errorResponse);

            e.printStackTrace();
        }
    }

}
