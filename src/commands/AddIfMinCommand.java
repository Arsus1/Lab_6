package commands;

import models.City;
import managers.CollectionManager;
import managers.ConsoleManager;

public class AddIfMinCommand extends AbstractCommand {

    public AddIfMinCommand(){
        cmdName = "add_if_min";
        description = "добавляет новый элемент в коллекцию, если его значение меньше, чем у наименьшего элемента этой коллекции";
        needInput = true;
    }

    @Override
    public Object getInput(ConsoleManager consoleManager){
        return consoleManager.getCity();
    }

    @Override
    public void execute(ConsoleManager consoleManager, CollectionManager collectionManager) {
        if(needInput && inputData == null) inputData = this.getInput(consoleManager);
        Boolean res = collectionManager.addIfMin((City) inputData);

        if(res)
            consoleManager.writeln("Элемент был добавлен");
        else
            consoleManager.writeln("Элемент не был добавлен. Элемент оказался больше минимального");

        inputData = null;
    }
}
