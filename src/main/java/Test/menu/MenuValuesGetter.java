package Test.menu;

public class MenuValuesGetter {

    private final String fileAction;
    private final String sourceFile;
    private final String destFile;
    private final int key;


    public MenuValuesGetter(String[] parameters) {
        fileAction = parameters[0];
        sourceFile = parameters[1];
        destFile = parameters[2];
        key = Integer.parseInt(parameters[3]);
    }


    public String getFileAction() {return fileAction;}
    public String getSourceFile() {return sourceFile;}
    public String getDestFile() {return destFile;}
    public int getKey(){return key;}

    @Override
    public String toString() {
        return "MenuValuesGetter{" +
                "fileAction='" + fileAction + '\'' +
                ", sourceFile='" + sourceFile + '\'' +
                ", destFile='" + destFile + '\'' +
                ", key=" + key +
                '}';
    }
}