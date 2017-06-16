package bot.polobot.Commands.TextCommands;

import bot.polobot.Commands.BotCommand;
import bot.polobot.Utils.Constants;
import net.dv8tion.jda.core.events.message.MessageReceivedEvent;

/**
 * Created by Jason on 4/10/2017.
 */
public class CreateRemindCommand implements BotCommand
{
    public static void Execute(MessageReceivedEvent event)
    {
        String user = event.getAuthor().getName();
        String message = event.getMessage().getContent().toString();

        String reminder = message.replace("!remind ","");

        Constants.remindList.add(reminder);

        int reminderNumber = Constants.remindList.size();

        String response = user + ", I added your reminder! The recall number for this reminder is number " +
                reminderNumber + ". ```!recall " + reminderNumber + "``` Can be used to get your reminder!";

        event.getTextChannel().sendMessage(response).queue();

        System.out.println(Constants.remindList);
    }
}
