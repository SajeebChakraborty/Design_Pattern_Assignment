
public class NotificationService {
    public static void main(String[] args) {
        try {
            AbstractNotificationFactory realtime_Factory = FactoryProducer.getFactory("Realtime");
            Notification notification = realtime_Factory.createNotification("Push");
            notification.notifyUser("Hi");

            AbstractNotificationFactory regular_Factory = FactoryProducer.getFactory("Regular");
            Notification notification2 = regular_Factory.createNotification("Email");
            notification2.notifyUser("Hi");

        } catch (Exception e) {
            System.out.println("Error msg: " + e.getMessage());
        }

    }
}
