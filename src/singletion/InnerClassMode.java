package singletion;

public class InnerClassMode {
    private InnerClassMode() {

    }

    private static class Holder {
        private static final InnerClassMode instance = new InnerClassMode();
    }

    public static InnerClassMode getInstance() {
        // 这里只有第一次用到这个方法的时候，这个类才会被加载，JVM类加载机制保证类只加载一次
        return Holder.instance;
    }
}
