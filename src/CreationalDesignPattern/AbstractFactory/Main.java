package CreationalDesignPattern.AbstractFactory;

public class Main {

    public static void main(String[] arg){

        Company asusCompany  = new AsusCompany();
        Monitor asusCompanyMonitor = asusCompany.createMonitor();
        asusCompanyMonitor.assemble();
        Gpu asusCompanyGpu =  asusCompany.createGpu();
        asusCompanyGpu.assemble();


        Company msiCompany = new MsiCompany();
        Monitor msiCompanyMonitor = msiCompany.createMonitor();
        msiCompanyMonitor.assemble();
        Gpu msiCompanyGpu = msiCompany.createGpu();
        msiCompanyGpu.assemble();
    }
}
