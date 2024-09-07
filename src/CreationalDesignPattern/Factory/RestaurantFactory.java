package CreationalDesignPattern.Factory;

abstract class RestaurantFactory {

    public Burger orderBurger() {
        Burger burger = createBurger();
        burger.prepareBurger();
        return burger;
    }

    public abstract Burger createBurger();
}
