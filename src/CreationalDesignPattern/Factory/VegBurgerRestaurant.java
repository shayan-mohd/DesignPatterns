package CreationalDesignPattern.Factory;

public class VegBurgerRestaurant extends RestaurantFactory{
    @Override
    public Burger createBurger() {
        return new VegBurger();
    }
}
