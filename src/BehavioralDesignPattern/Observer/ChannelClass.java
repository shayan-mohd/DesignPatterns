package BehavioralDesignPattern.Observer;

import java.util.ArrayList;
import java.util.List;

public class ChannelClass implements  IChannel {

    List<Subscriber> subscriberList;

    public ChannelClass() {
        this.subscriberList = new ArrayList<>();
    }

    @Override
    public void updateAll(Data data) {
        subscriberList.forEach( t -> {
            t.execute(data);
        });
    }

    @Override
    public void subscribe(Subscriber subscriber) {
        subscriberList.add(subscriber);
    }

    @Override
    public void unsubscribe(Subscriber subscriber) {
        subscriberList.remove(subscriber);
    }
}
