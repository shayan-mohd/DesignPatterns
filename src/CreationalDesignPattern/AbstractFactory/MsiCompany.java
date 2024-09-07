package CreationalDesignPattern.AbstractFactory;

public class MsiCompany implements Company{
    @Override
    public Monitor createMonitor() {
        return new MsiMonitor();
    }

    @Override
    public Gpu createGpu() {
        return new MsiGpu();
    }
}
