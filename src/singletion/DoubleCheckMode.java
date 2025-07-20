package singletion;

public class DoubleCheckMode {
    private static volatile DoubleCheckMode instance;

    private DoubleCheckMode() {
    }

    public static DoubleCheckMode getInstance() {
        if (instance == null){ // 第一次检查 防止重复同步
            synchronized (DoubleCheckMode.class){
                if (instance == null){ // 第二次检查 防止重复生成
                    instance = new DoubleCheckMode();
                }
            }
        }
        return instance;
    }
}
