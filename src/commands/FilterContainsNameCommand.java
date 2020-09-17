package commands;

import models.City;
import exceptions.InvalidValueException;
import managers.CollectionManager;
import managers.ConsoleManager;

import java.util.ArrayList;

public class FilterContainsNameCommand extends AbstractCommand {
    public FilterContainsNameCommand(){
        cmdName = "filter_contains_name";
        description = "выводит элементы, значение поля name которых содержит заданную подстроку";
        argCount = 1;
    }

    @Override
    public void execute(ConsoleManager consoleManager, CollectionManager collectionManager) {
        ArrayList<City> out = collectionManager.findByName(args[0]);
        if(out.size() == 0) consoleManager.writeln("Элементы с таким именем не найден");
        out.forEach(x-> consoleManager.writeln(x.toString()));
    }
}
