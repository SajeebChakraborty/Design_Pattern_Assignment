
public class RealtimeNotificationFactory extends AbstractNotificationFactory{
    @Override
    Notification createNotification(String channelType) throws Exception {
        Notification notification = null;

        if(channelType.equalsIgnoreCase("SMS")) {
            notification = new RealtimeSMSNotification();
        } else if(channelType.equalsIgnoreCase("Email")) {
            notification = new RealtimeEmailNotification();
        } else if(channelType.equalsIgnoreCase("Push")) {
            notification = new RealtimePushNotification();
        }

        return notification;
    }
}
