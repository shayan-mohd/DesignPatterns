package CreationalDesignPattern.AbstractFactory;

public class AsusGpu implements Gpu{
    @Override
    public void assemble() {
        System.out.println("Assembling Asus Gpu");
    }
}
