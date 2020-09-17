package commands;

import models.City;
import managers.CollectionManager;
import managers.ConsoleManager;

public class AddCommand extends AbstractCommand {

    public AddCommand(){
        cmdName = "add";
        description = "добавляет новый элемент в коллекцию";
        needInput = true;
    }

    @Override
    public Object getInput(ConsoleManager consoleManager){
        return consoleManager.getCity();
    }

    @Override
    public void execute(ConsoleManager consoleManager, CollectionManager collectionManager) {
        if(needInput && inputData == null) inputData = this.getInput(consoleManager);
        collectionManager.addElement((City) inputData);

        consoleManager.writeln("Добавлена новая запись.");
        inputData = null;
    }
}
