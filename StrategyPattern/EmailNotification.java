package StrategyPattern;

// Concrete implementation of the NotificationStrategy for sending email notifications
class EmailNotification implements NotificationStrategy {
    private String email;

    // Constructor to initialize the email address
    public EmailNotification(String email) {
        this.email = email;
    }

    // Implementation of sendNotification method for email
    @Override
    public void sendNotification(String message) {
        System.out.println("Sent Email to " + email + ": " + message);
    }
}
