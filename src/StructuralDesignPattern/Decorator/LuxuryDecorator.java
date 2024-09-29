package StructuralDesignPattern.Decorator;

public class LuxuryDecorator extends CarDecorator {
    public LuxuryDecorator(Car c) {
        super(c);
    }
    @Override
    public void assemble() {
        super.assemble();
        System.out.println(" with Luxury interior");
    }
}