package observer;

import java.util.ArrayList;

/**
 * Publisher
 */
public class Subject {

    private ArrayList<Observer> subscribedObserver = new ArrayList<>();
    private String status = "";

    public void subscribe(Observer observer){
        subscribedObserver.add(observer);
    }

    public void unSubscribe(Observer observer){
        subscribedObserver.remove(observer);
    }

    public void updateStatus(String status){
        this.status = status;
        notifyAllObserver();
    }

    public void notifyAllObserver(){
        for (int i=0; i<subscribedObserver.size(); i++){
            Observer observer = subscribedObserver.get(i);
            observer.update(status);
        }
    }
}
