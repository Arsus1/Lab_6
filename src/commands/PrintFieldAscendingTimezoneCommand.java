package commands;

import managers.CollectionManager;
import managers.ConsoleManager;

public class PrintFieldAscendingTimezoneCommand extends AbstractCommand {

    public PrintFieldAscendingTimezoneCommand(){
        cmdName = "print_field_ascending_timezone";
        description = "выводит значения поля timezone всех элементов в порядке возрастания";
    }

    @Override
    public void execute(ConsoleManager consoleManager, CollectionManager collectionManager) {
        collectionManager.sortByTimezone().forEach(x->consoleManager.writeln(x.toString()));
    }
}
