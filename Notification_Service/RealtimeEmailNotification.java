
public class RealtimeEmailNotification implements Notification{
    @Override
    public void notifyUser(String text) {
        System.out.println("Sending Realtime email: "  + text);
    }
}
