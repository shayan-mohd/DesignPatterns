package BehavioralDesignPattern.TemplateMethod;

public class Main {

    public static void main(String[] arg) {
        BeverageMaker teaMaker = new TeaMaker();
        teaMaker.makeBeverage();

        System.out.println("--------------------------");
        BeverageMaker coffeeMAker = new CoffeeMaker();
        coffeeMAker.makeBeverage();
    }
}
