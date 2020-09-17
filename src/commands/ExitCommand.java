package commands;

import managers.CollectionManager;
import managers.ConsoleManager;

public class ExitCommand extends AbstractCommand {

    public ExitCommand(){
        cmdName = "exit";
        description = "выход из программы без сохранения";
    }

    @Override
    public void execute(ConsoleManager consoleManager, CollectionManager collectionManager) {
        /*if(consoleManager.getIsScript()) System.exit(1);

        String out = consoleManager.readWithMessage("Вы уверены? Данные не сохраняются (Y/N)", false);
        if(out.toLowerCase().equals("y")) System.exit(1);*/
        System.exit(1);
    }
}
