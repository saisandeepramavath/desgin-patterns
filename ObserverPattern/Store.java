package ObserverPattern;

// Concrete class that uses Notifier to notify observers about store updates
class Store extends Notifier {
    // Method to send a store update to all observers
    public void newPromotion(String promotion) {
        notifyObservers("Store Promotion: " + promotion);
    }
}
