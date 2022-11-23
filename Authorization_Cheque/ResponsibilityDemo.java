
public class ResponsibilityDemo {
    public static void main(String[] args) {
        Account account = new Account("Sajeeb Chakraborty", 999995);

        AuthorizationChain authorizationChain = new AuthorizationChain();

        int amount = 10000;
        boolean isAuthorized = authorizationChain.authorizeWithdrawal(account, amount);

        if(isAuthorized) {
            account.withdraw(amount);
        }
    }
}
