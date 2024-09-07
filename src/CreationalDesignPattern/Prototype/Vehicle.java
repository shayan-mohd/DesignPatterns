package CreationalDesignPattern.Prototype;

abstract class Vehicle {
    public String color;
    public int tyres;
    public int seat;

    Vehicle () {
    }

    Vehicle(Vehicle v) {
        this.color = v.color;
        this.seat = v.seat;
        this.tyres= v.tyres;
    }

    public abstract Vehicle clone();

    @Override
    public String toString() {
        return "Vehicle{" +
                "color='" + color + '\'' +
                ", tyres=" + tyres +
                ", seat=" + seat +
                '}';
    }
}
