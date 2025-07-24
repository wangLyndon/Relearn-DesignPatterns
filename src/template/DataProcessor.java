package template;

public abstract class DataProcessor {
    public final void process(){
        readData();
        processData();
        writeData();
    }

    protected abstract void readData();

    protected abstract void processData();

    protected void writeData(){
        System.out.println("Write data...");
    }
}
