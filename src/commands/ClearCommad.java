package commands;

import managers.CollectionManager;
import managers.ConsoleManager;

public class ClearCommad extends AbstractCommand {
    public ClearCommad(){
        cmdName = "clear";
        description = "очищает коллекцию";
    }

    @Override
    public void execute(ConsoleManager consoleManager, CollectionManager collectionManager) {
        collectionManager.clear();
        consoleManager.writeln("Коллекция была очищена");
    }
}
