package BehavioralDesignPattern.TemplateMethod;

public class TeaMaker extends BeverageMaker{
    @Override
    void addAditionals() {
        System.out.println("Add milk, water, and tea Leaves");
    }

    @Override
    void brew() {
        System.out.println("steeping the tea");
    }
}
