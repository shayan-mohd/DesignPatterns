package BehavioralDesignPattern.State;

public class ProductSelectedState implements VendingMachineState{
    @Override
    public void handleRequest() {
        System.out.println("Product Selected: Ready to process payment");
    }
}
