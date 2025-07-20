package singletion;

public class LazyMode {
    private static LazyMode instance;

    private LazyMode() {}

    public static LazyMode getInstance(){
        if (instance == null){
            instance = new LazyMode();
        }
        return instance;
    }
}
