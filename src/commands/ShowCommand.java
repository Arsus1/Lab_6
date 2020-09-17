package commands;

import managers.CollectionManager;
import managers.ConsoleManager;

public class ShowCommand extends AbstractCommand {

    public ShowCommand(){
        cmdName = "show";
        description = "выводит все элементы коллекции";
    }

    @Override
    public void execute(ConsoleManager consoleManager, CollectionManager collectionManager) {
        consoleManager.writeln("Количество элементов в коллекции: " + collectionManager.getCityCollection().size());
        StringBuilder sb = new StringBuilder();
        collectionManager.getCityCollection().forEach(s -> sb.append(s).append("\n"));

        consoleManager.writeln(sb.toString());
    }
}
