package 模版模式;

public class AmericanCoffee extends AbstractMakeCoffee{
    public AmericanCoffee(){
        super("American Coffee");
    }
    @Override
    void brewingCoffee() {
        System.out.println("Brewing coffee");
    }

    @Override
    void grindingCoffeeBeans() {
        System.out.println("Grinding coffee beans");
    }
}
