public class Main {
    public static void main(String[] args)  {
        AccountManager accountManager = new AccountManager();
        System.out.println("Bakiye = " + accountManager.getBalance());
        accountManager.deposit(100);
        System.out.println("Bakiye = " + accountManager.getBalance());
        try {
            accountManager.withdraw(90);
        } catch(BalanceInsufficentException e) {
            System.out.println(e.getMessage());
        }
        System.out.println("Bakiye = " + accountManager.getBalance());
        try {
            accountManager.withdraw(20);
        } catch(BalanceInsufficentException e) {
            System.out.println(e.getMessage());
        }
        System.out.println("Bakiye = " + accountManager.getBalance());
    }
}