package CreationalDesignPattern.Builder;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        Car.CarBuilder builder = new Car.CarBuilder();
        Car car1 = builder.setId(123)
                .setColor("yellow")
                .setModel("Xi41")
                .setSunroof(true)
                .build();

        System.out.println(car1.toString());

        Car car2 = new Car.CarBuilder()
                .setId(234)
                .setColor("Red")
                .build();
        System.out.println(car2.toString());

    }
}
