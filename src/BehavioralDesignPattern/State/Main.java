package BehavioralDesignPattern.State;

public class Main {

    public static void main(String[] arg) {
        VendingMachineContext vendingMachine = new VendingMachineContext();

        vendingMachine.setState(new ReadyState());

        vendingMachine.request();

        vendingMachine.setState(new ProductSelectedState());
        vendingMachine.request();


        vendingMachine.setState(new OutOfStockState());
        vendingMachine.request();

    }
}
