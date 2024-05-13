package 策略模式;

// 4. 上下文类
class Context {
    private Strategy strategy;

    // 设置具体的策略
    public Context(Strategy strategy) {
        this.strategy = strategy;
    }

    // 执行策略
    public void contextInterface() {
        strategy.algorithmInterface();
    }
}
