package 策略模式;

// 2. 具体策略类1
class ConcreteStrategyA extends Strategy {
    @Override
    public void algorithmInterface() {
        System.out.println("Strategy A");
        // 具体的策略1执行逻辑
    }
}
