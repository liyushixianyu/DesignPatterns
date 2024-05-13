package 模版模式;

public abstract class AbstractMakeCoffee{
    String coffee;
    public void makeCoffee(){
        System.out.println("Making " + coffee + " Coffee:");
        grindingCoffeeBeans();
        brewingCoffee();
        addingCondiments();
    }
    public AbstractMakeCoffee(String coffee){
       this.coffee = coffee;
    }
    abstract void brewingCoffee();
    void addingCondiments(){
        System.out.println("Adding condiments");
    }
    abstract void grindingCoffeeBeans();

}
