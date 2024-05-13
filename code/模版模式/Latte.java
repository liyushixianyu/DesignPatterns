package 模版模式;

public class Latte extends AbstractMakeCoffee{
    public Latte() {
        super("Latte");
    }

    @Override
    void brewingCoffee() {
        System.out.println("Brewing coffee");
    }

    @Override
    void grindingCoffeeBeans() {
        System.out.println("Grinding coffee beans");
    }
    @Override
    void addingCondiments(){
        System.out.println("Adding milk");
        System.out.println("Adding condiments");
    }
}
