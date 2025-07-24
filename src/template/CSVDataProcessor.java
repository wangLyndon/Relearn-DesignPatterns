package template;

public class CSVDataProcessor extends DataProcessor{
    @Override
    protected void readData() {
        System.out.println("Read data...");
    }

    @Override
    protected void processData() {
        System.out.println("Process data...");
    }
}
