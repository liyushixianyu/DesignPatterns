package 模版模式;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        AbstractMakeCoffee coffeeMaker = null;
        while(in.hasNext()){
            int type = in.nextInt();

            if(type == 1){
                coffeeMaker = new AmericanCoffee();
            }else if(type == 2){
                coffeeMaker = new Latte();
            }else{
                System.out.println("invalid coffee type!");
            }
            coffeeMaker.makeCoffee();
        }
    }
}
