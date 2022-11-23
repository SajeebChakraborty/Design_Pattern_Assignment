
public class Manager extends AbstractAuthorizer{
    public Manager(int limit) {
        this.limit = limit;
    }

    @Override
    protected void authorizing_account(Account account) {
        System.out.println("A/C name: " + account.getName() + " Manager authorized ");
    }
}
