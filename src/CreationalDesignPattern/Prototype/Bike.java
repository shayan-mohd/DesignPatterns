package CreationalDesignPattern.Prototype;

public class Bike extends Vehicle{

    private Boolean isAutoStart;


    Bike() {
    }

    private Bike(Bike b) {
        super(b);
        this.isAutoStart = b.isAutoStart;
    }

    public void setIsAutoStart(Boolean isAutoStart) {
        this.isAutoStart = isAutoStart;
    }

    @Override
    public Vehicle clone() {
        return new Bike(this);
    }

    @Override
    public String toString() {
        return "Bike{" +
                "isAutoStart=" + isAutoStart +
                ", color='" + color + '\'' +
                ", tyres=" + tyres +
                ", seat=" + seat +
                '}';
    }
}
