package CreationalDesignPattern.Prototype;


public class Main {

    public static void main(String[] args) {

        Bike b  = new Bike();
        b.color = "yellow";
        b.seat = 2;
        b.tyres = 2;
        b.setIsAutoStart(Boolean.TRUE);
        System.out.println(b.toString());

        Bike bikeCopy = (Bike) b.clone();
        bikeCopy.color = "red";
        System.out.println(bikeCopy.toString());


        Car c = new Car();
        c.isSunroof = false;
        c.color = "Black";
        c.tyres = 4;
        c.seat = 7;

        System.out.println(c);

        Car carCopy = (Car) c.clone();
        System.out.println(carCopy);

    }
}
