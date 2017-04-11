package bot.polobot.Commands.TextCommands;

import bot.polobot.Constants;
import net.dv8tion.jda.core.events.message.MessageReceivedEvent;

/**
 * Created by Jason on 4/10/2017.
 */
public class DeleteRemindCommand
{
    public static void Execute(MessageReceivedEvent event)
    {

        String user = event.getAuthor().getName();
        String message = event.getMessage().getContent().toString();
        int reminderNumber = 0;

        String reminderID = message.replace("!delrecall ","");
            try {
            reminderNumber = Integer.parseInt(reminderID);
        } catch (NumberFormatException e){
            e.printStackTrace();

            String errorResponse = "I'm Sorry, " + user + "I can't understand that. Make sure you put in: ```!delrecall *number*``` or else I can't understand it!";
            event.getTextChannel().sendMessage(errorResponse);
        }

        reminderNumber = reminderNumber - 1;

        if (reminderNumber < 0)
        {
            reminderNumber = 0;
        }

        if(reminderNumber <= Constants.remindList.size())
        {
            Constants.remindList.remove(reminderNumber);

            String response = user + ", I have cleared the reminder.";
            event.getTextChannel().sendMessage(response).queue();
        } else {
            String errorResponse = "I'm Sorry, " + user + " That was invalid. There is no value in that reminder";
            event.getTextChannel().sendMessage(errorResponse);
        }

        System.out.println(Constants.remindList);
    }
}