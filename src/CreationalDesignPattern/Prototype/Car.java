package CreationalDesignPattern.Prototype;


public class Car extends Vehicle {

    public Boolean isSunroof;

    Car() {}

    Car(Car c) {
        super(c);
        this.isSunroof = c.isSunroof;
    }

    @Override
    public Vehicle clone() {
        return new Car(this);
    }

    @Override
    public String toString() {
        return "Car{" +
                "isSunroof=" + isSunroof +
                ", color='" + color + '\'' +
                ", tyres=" + tyres +
                ", seat=" + seat +
                '}';
    }
}
