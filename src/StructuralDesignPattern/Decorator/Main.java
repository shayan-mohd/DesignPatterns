package StructuralDesignPattern.Decorator;

public class Main {
    public static void main(String[] arg) {
        Car sportsLuxuryCar = new SportsDecorator(new LuxuryDecorator(new RealCar()));
        sportsLuxuryCar.assemble();

        Car sportsCar = new SportsDecorator(new RealCar());
        sportsCar.assemble();

        Car luxuryToyCar = new LuxuryDecorator(new ToyCar());
        luxuryToyCar.assemble();
    }

}
