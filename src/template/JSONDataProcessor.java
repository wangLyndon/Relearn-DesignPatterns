package template;

public class JSONDataProcessor extends DataProcessor{
    @Override
    protected void readData() {
        System.out.println("Read json file");
    }

    @Override
    protected void processData() {
        System.out.println("Process json file");
    }
}
