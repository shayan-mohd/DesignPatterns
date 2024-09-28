package BehavioralDesignPattern.Observer;

public class SubscriberClass implements  Subscriber {

    String name;

    public SubscriberClass(String name) {
        this.name = name;
    }

    @Override
    public void execute(Data msg) {
        System.out.println(this.name + "-" + msg.getStudentName() + " -- " + msg.getAge());
    }
}
