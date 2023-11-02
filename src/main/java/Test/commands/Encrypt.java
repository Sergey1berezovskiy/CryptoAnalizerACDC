package Test.commands;


import Test.files.FileProcessor;
import Test.menu.Menu;
import Test.menu.MenuValuesGetter;

public class Encrypt extends FileProcessor {

    @Override
    public void runFile() {
        MenuValuesGetter parameters = Menu.parameterGetter;
        String sourceFile = parameters.getSourceFile();
        String destFile = parameters.getDestFile();
        int key = parameters.getKey();

        runFile(sourceFile,destFile,key);
    }

}
