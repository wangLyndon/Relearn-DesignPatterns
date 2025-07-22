package strategy;

public class Context {
    private Strategy strategy;

    public Context() {
    }

    public Context(Strategy strategy) {
        this.strategy = strategy;
    }

    public void executeStrategy(){
        if (strategy != null){
            strategy.execute();
        }else {
            System.out.println("没有配置策略");
        }
    }

    public void setStrategy(Strategy strategy) {
        this.strategy = strategy;
    }
}
