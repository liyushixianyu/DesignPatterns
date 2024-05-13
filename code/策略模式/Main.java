package 策略模式;

// 5. 客户端代码
public class Main{
    public static void main(String[] args) {
        // 创建上下文对象，并设置具体的策略
        Context contextA = new Context(new ConcreteStrategyA());
        // 执行策略
        contextA.contextInterface();

        Context contextB = new Context(new ConcreteStrategyB());
        contextB.contextInterface();
    }
}