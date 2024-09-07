package CreationalDesignPattern.Factory;

public class Main {

    public static void main(String[] arg) {
        RestaurantFactory nonVegRestaurant = new NonVegBurgerRestaurant();
        Burger nonVegBurger = nonVegRestaurant.orderBurger();
        System.out.println(nonVegBurger.toString());

        RestaurantFactory vegBurgerRestaurant = new VegBurgerRestaurant();
        Burger vegBurger = vegBurgerRestaurant.orderBurger();
        System.out.println(vegBurger);
    }
}
