package strategy;

public class StrategyB implements Strategy{
    @Override
    public void execute() {
        System.out.println("我是策略B");
    }
}
