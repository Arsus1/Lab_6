package commands;

import models.City;
import managers.CollectionManager;
import managers.ConsoleManager;

public class RemoveLowerCommand extends AbstractCommand {
    public RemoveLowerCommand(){
        cmdName = "remove_lower";
        description = "удаляет из коллекции все элементы, меньшие, чем заданный";
        needInput = true;
    }

    @Override
    public Object getInput(ConsoleManager consoleManager){
        return consoleManager.getCity();
    }

    @Override
    public void execute(ConsoleManager consoleManager, CollectionManager collectionManager) {
        if(needInput && inputData == null) inputData = this.getInput(consoleManager);

        int initSize = collectionManager.getCityCollection().size();
        collectionManager.removeLower((City) inputData);
        int afterSize = collectionManager.getCityCollection().size();

        consoleManager.writeln("Было удалено " + (initSize - afterSize) + " элементов");

        inputData = null;
    }
}
