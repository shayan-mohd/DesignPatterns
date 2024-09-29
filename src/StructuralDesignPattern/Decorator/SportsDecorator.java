package StructuralDesignPattern.Decorator;

public class SportsDecorator extends CarDecorator {
    public SportsDecorator(Car c) {
        super(c);
    }
    @Override
    public void assemble(){
        super.assemble();
        System.out.println(" with Sports mode");
    }
}