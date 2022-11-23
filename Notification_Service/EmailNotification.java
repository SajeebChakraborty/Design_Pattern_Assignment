
public class EmailNotification implements Notification{
    @Override
    public void notifyUser(String text) {

        System.out.println("Sending Regular email: "  + text);
        
    }
}
