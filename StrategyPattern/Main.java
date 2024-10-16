package StrategyPattern;

public class Main {
    public static void main(String[] args) {
        NotificationService service = new NotificationService();

        // Set the notification strategy to Email and send a notification
        service.setNotificationStrategy(new EmailNotification("user@example.com"));
        service.notifyUser("Your order has been shipped.");

        // Change the notification strategy to SMS and send another notification
        service.setNotificationStrategy(new SMSNotification("123-456-7890"));
        service.notifyUser("Your package will arrive tomorrow.");
    }
}
