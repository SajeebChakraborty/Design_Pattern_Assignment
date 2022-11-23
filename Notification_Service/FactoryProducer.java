
public class FactoryProducer {
    public static AbstractNotificationFactory getFactory(String factoryType) throws Exception {

        if(factoryType.equalsIgnoreCase("Regular")) {
            return new RegularNotificationFactory();
        } else if(factoryType.equalsIgnoreCase("Realtime")) {
            return new RealtimeNotificationFactory();
        } else {
            return null;
        }
        
    }
}
