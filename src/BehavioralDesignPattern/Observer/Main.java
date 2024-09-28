package BehavioralDesignPattern.Observer;

public class Main {

    public static void main(String[] arg) {
        IChannel channel = new ChannelClass();
        channel.subscribe(new SubscriberClass("name1"));
        channel.subscribe(new SubscriberClass("name2"));
        channel.subscribe(new SubscriberClass("name3"));
        channel.subscribe(new SubscriberClass("name4"));

        channel.updateAll(new Data("shayan", 24));
    }
}
