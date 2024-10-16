package ObserverPattern;

public class Main {
    public static void main(String[] args) {
        Store store = new Store();
        Customer customer1 = new Customer("Alice");
        Customer customer2 = new Customer("Bob");

        // Attach customers to the store notifier
        store.attach(customer1);
        store.attach(customer2);

        // Send store promotions to all attached customers
        store.newPromotion("50% off on all items!");
        store.newPromotion("Buy 1 Get 1 Free on select products.");
    }
}
