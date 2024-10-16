package ObserverPattern;

// Concrete implementation of the Observer interface
class Customer implements Observer {
    private String name;

    // Constructor to initialize the customer's name
    public Customer(String name) {
        this.name = name;
    }

    // Implementation of the update method to receive notifications
    @Override
    public void update(String message) {
        System.out.println("Notification for " + name + ": " + message);
    }
}
