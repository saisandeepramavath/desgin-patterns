package StrategyPattern;

// Concrete implementation of the NotificationStrategy for sending SMS notifications
class SMSNotification implements NotificationStrategy {
    private String phoneNumber;

    // Constructor to initialize the phone number
    public SMSNotification(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    // Implementation of sendNotification method for SMS
    @Override
    public void sendNotification(String message) {
        System.out.println("Sent SMS to " + phoneNumber + ": " + message);
    }
}
