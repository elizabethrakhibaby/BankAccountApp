public class BankAccountTest {

    public static void main(String[] args) {
        BankAccountTest tester = new BankAccountTest();
        tester.testInitialBalance();
        tester.testDeposit();
        tester.testWithdraw();
        tester.testInsufficientFunds();
        tester.testNegativeDeposit();
        tester.testNegativeWithdraw();

        System.out.println("All tests passed.");
    }

    public void testInitialBalance() {
        BankAccount account = new BankAccount();
        assert account.getBalance() == 0.0 : "Initial balance should be zero.";
    }

    public void testDeposit() {
        BankAccount account = new BankAccount();
        account.deposit(500);
        assert account.getBalance() == 500.0 : "Balance should be 500 after depositing 500.";
    }

    public void testWithdraw() {
        BankAccount account = new BankAccount();
        account.deposit(500);
        account.withdraw(100);
        assert account.getBalance() == 400.0 : "Balance should be 400 after withdrawing 100 from 500.";
    }

    public void testInsufficientFunds() {
        BankAccount account = new BankAccount();
        account.deposit(100);
        account.withdraw(200);
        assert account.getBalance() == 100.0 : "Balance should remain 100 if withdrawal exceeds balance.";
    }

    public void testNegativeDeposit() {
        BankAccount account = new BankAccount();
        account.deposit(-100);
        assert account.getBalance() == 0.0 : "Balance should remain 0 if deposit amount is negative.";
    }

    public void testNegativeWithdraw() {
        BankAccount account = new BankAccount();
        account.deposit(100);
        account.withdraw(-50);
        assert account.getBalance() == 100.0 : "Balance should remain unchanged if withdrawal amount is negative.";
    }
}
