package CreationalDesignPattern.Builder;

public class Car {

    private int id;
    private String color;
    private String model;
    private boolean isSunroof;

    private Car(int id, String color, String model, boolean isSunroof) {
        this.id = id;
        this.color = color;
        this.model = model;
        this.isSunroof = isSunroof;
    }

    @Override
    public String toString() {
        return "Car{" +
                "id=" + id +
                ", color='" + color + '\'' +
                ", model='" + model + '\'' +
                ", isSunroof=" + isSunroof +
                '}';
    }

    public static class CarBuilder {
        private int id;
        private String color;
        private String model = null;
        private boolean isSunroof;

        CarBuilder() {}

        public CarBuilder setId(int id) {
            this.id = id;
            return this;
        }

        public CarBuilder setColor(String color) {
            this.color = color;
            return this;
        }

        public CarBuilder setModel(String model) {
            this.model = model;
            return this;
        }

        public CarBuilder setSunroof(boolean sunroof) {
            isSunroof = sunroof;
            return this;
        }

        public Car build() {
            return new Car(id, color, model, isSunroof);
        }
    }
}
