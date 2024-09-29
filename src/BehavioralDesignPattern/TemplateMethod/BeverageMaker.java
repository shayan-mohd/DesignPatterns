package BehavioralDesignPattern.TemplateMethod;

public abstract class BeverageMaker {
    //template method
    public void makeBeverage() {
        boilWater();
        brew();
        addAditionals();
        pourInCup();
    }

     private void boilWater() {
         System.out.println("Boil Water");
     }
     private void pourInCup() {
         System.out.println("pour Beverage into cup");
     }
     abstract void addAditionals();
     abstract void brew();


}
