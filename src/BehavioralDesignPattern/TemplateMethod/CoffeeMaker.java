package BehavioralDesignPattern.TemplateMethod;

public class CoffeeMaker extends BeverageMaker{
    @Override
    void addAditionals() {
        System.out.println("Add sugar and milk");
    }

    @Override
    void brew() {
        System.out.println("Filter coffee");
    }
}
