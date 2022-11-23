public class SeniorOfficer extends AbstractAuthorizer{

    public SeniorOfficer(int limit) {

        this.limit = limit;

    }

    @Override
    protected void authorizing_account(Account account) {
        System.out.println("A/C name: " + account.getName() + " Senior Officer authorized ");
    }
}
