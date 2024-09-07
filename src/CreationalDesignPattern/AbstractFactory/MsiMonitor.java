package CreationalDesignPattern.AbstractFactory;

public class MsiMonitor implements Monitor{
    @Override
    public void assemble() {
        System.out.println("Assembling Msi Monitor");
    }
}
