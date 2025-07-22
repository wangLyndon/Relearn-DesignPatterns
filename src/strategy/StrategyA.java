package strategy;

public class StrategyA implements Strategy{
    @Override
    public void execute() {
        System.out.println("我是策略A");
    }
}
