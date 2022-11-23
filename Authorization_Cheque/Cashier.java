
public class Cashier extends AbstractAuthorizer{
    public Cashier(int limit) {
        this.limit = limit;
    }

    @Override
    protected void authorizing_account(Account account) {
        System.out.println("A/C name: " + account.getName() + " Cashier authorized ");
    }
}
