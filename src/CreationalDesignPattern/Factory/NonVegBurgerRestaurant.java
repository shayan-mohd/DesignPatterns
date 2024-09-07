package CreationalDesignPattern.Factory;

public class NonVegBurgerRestaurant extends RestaurantFactory{
    @Override
    public Burger createBurger() {
        return new NonVegBurger();
    }
}
