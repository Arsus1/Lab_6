package commands;

import exceptions.InvalidValueException;
import managers.CollectionManager;
import managers.ConsoleManager;

public class RemoveIdCommand extends AbstractCommand {

    public RemoveIdCommand(){
        cmdName = "remove";
        description = "удаляет элемент из коллекции по его id";
        argCount = 1;
    }

    @Override
    public void execute(ConsoleManager consoleManager, CollectionManager collectionManager) {
        long id;
        try {
            id = Long.parseLong(args[0]);
        } catch (Exception e) {
            throw new InvalidValueException(e.getMessage());
        }

        if(!collectionManager.checkIdExist(id))
            throw new InvalidValueException("Такого id не существует");

        collectionManager.remove(id);
        consoleManager.writeln("Элемент " + id + " удален");
    }
}
