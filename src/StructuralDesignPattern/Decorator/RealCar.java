package StructuralDesignPattern.Decorator;

public class RealCar implements Car {
    @Override
    public void assemble() {
        System.out.println("Real Car");
    }
}
