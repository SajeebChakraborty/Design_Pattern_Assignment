
public class RegularNotificationFactory extends AbstractNotificationFactory{
    @Override
    Notification createNotification(String channelType) throws Exception {
        Notification notification = null;

        if(channelType.equalsIgnoreCase("SMS")) {
            notification = new SMSNotification();
        } else if(channelType.equalsIgnoreCase("Email")) {
            notification = new EmailNotification();
        } else if(channelType.equalsIgnoreCase("Push")) {
            notification = new PushNotification();
        }

        return notification;
    }
}
