package 策略模式;

public class ConcreteStrategyB extends Strategy{
    @Override
    public void algorithmInterface() {
        System.out.println("Strategy B");
        // 具体的策略2执行逻辑
    }
}
