package BehavioralDesignPattern.Observer;

public interface IChannel {
//    void update(Subscriber subscriber);

    void updateAll(Data data);

    void subscribe(Subscriber subscriber);
    void unsubscribe(Subscriber subscriber);
}
