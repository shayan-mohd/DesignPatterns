package BehavioralDesignPattern.State;

public class ReadyState implements VendingMachineState{
    @Override
    public void handleRequest() {
        System.out.println("Select the product");
    }
}
