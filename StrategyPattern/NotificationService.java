package StrategyPattern;

// NotificationService class that uses different notification strategies
class NotificationService {
    private NotificationStrategy notificationStrategy;

    // Setter method to set the notification strategy at runtime
    public void setNotificationStrategy(NotificationStrategy notificationStrategy) {
        this.notificationStrategy = notificationStrategy;
    }

    // Method to send a notification using the current strategy
    public void notifyUser(String message) {
        if (notificationStrategy != null) {
            notificationStrategy.sendNotification(message);
        } else {
            System.out.println("Notification strategy not set.");
        }
    }
}
