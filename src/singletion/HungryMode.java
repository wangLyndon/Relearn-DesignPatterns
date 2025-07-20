package singletion;

/**
 * 这个会在类加载的时候被创建出来，线程安全
 */
public class HungryMode {
    private static final HungryMode instance = new HungryMode();

    private HungryMode(){}

    public static HungryMode getInstance(){
        return instance;
    }
}
