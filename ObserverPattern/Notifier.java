package ObserverPattern;

import java.util.ArrayList;
import java.util.List;

// Observer interface that will be implemented by all observers
interface Observer {
    void update(String message);
}

// Notifier class that maintains a list of observers and notifies them of changes
class Notifier {
    private List<Observer> observers = new ArrayList<>();

    // Method to attach a new observer to the list
    public void attach(Observer observer) {
        observers.add(observer);
    }

    // Method to detach an observer from the list
    public void detach(Observer observer) {
        observers.remove(observer);
    }

    // Method to notify all attached observers of a change
    public void notifyObservers(String message) {
        for (Observer observer : observers) {
            observer.update(message);
        }
    }
}
