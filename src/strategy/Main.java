package strategy;

public class Main {
    public static void main(String[] args) {
        Context context = new Context();

        Strategy strategyA = new StrategyA();
        Strategy strategyB = new StrategyB();

        // 添加策略
        context.setStrategy(strategyA);
        context.executeStrategy();

        context.setStrategy(strategyB);
        context.executeStrategy();
    }
}
