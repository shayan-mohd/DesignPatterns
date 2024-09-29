package BehavioralDesignPattern.State;

public class OutOfStockState implements VendingMachineState{
    @Override
    public void handleRequest() {
        System.out.println("Selected Product is out of state");
    }
}
