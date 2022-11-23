public abstract class AbstractAuthorizer {
    protected int limit;
    private AbstractAuthorizer nextAuthorizer;

    public void setNextAuthorizer(AbstractAuthorizer nextAuthorizer) {
        this.nextAuthorizer = nextAuthorizer;
    }

    public boolean isAuthorized(Account account, int limit) {

        if(this.limit >= limit) {
            authorizing_account(account);

            return true;
        } else {
            if(nextAuthorizer == null)
            {

                authorizing_account(account);

                return true;

            }

            authorizing_account(account);
            System.out.println("pass to the next authorization.......");
            return nextAuthorizer.isAuthorized(account, limit);
        }
    }

    protected abstract void authorizing_account(Account account);
}
