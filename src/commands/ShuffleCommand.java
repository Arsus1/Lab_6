package commands;

import managers.CollectionManager;
import managers.ConsoleManager;

public class ShuffleCommand extends AbstractCommand {
    public ShuffleCommand(){
        cmdName = "shuffle";
        description = "перемешивает элементы коллекции в случайном порядке";
    }

    @Override
    public void execute(ConsoleManager consoleManager, CollectionManager collectionManager) {
        collectionManager.shuffle();
        consoleManager.writeln("Коллекция была перемешана в случайном порядке");
    }
}
