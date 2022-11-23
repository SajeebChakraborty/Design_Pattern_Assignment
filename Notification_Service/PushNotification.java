
public class PushNotification implements Notification{
    @Override
    public void notifyUser(String text) {
        System.out.println("Sending Regular push notification: "  + text);
    }
}
