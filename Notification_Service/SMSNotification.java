
public class SMSNotification implements Notification{
    @Override
    public void notifyUser(String text) {
        System.out.println("Sending Regular sms: "  + text);
    }
}
