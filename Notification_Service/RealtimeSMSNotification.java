
public class RealtimeSMSNotification implements Notification{
    @Override
    public void notifyUser(String text) {
        System.out.println("Sending Realtime sms: "  + text);
    }
}
