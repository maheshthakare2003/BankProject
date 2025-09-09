import org.example.SavingsAccount;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SavingsAccountTest {
    @Test
    public void testWithdraw() {
        double openingBalance = 12000.0;
        double amountToWithdraw = 4500.0;
        double expectedBalance = openingBalance - amountToWithdraw;

        SavingsAccount account = new SavingsAccount(openingBalance);

        Assertions.assertNotNull(account);
        System.out.println("Object creation test case passed...");

        Assertions.assertEquals(openingBalance, account.getBalance(), "Initial balance " + openingBalance);
        System.out.println("Withdraw test case passed...");

        account.withdraw(amountToWithdraw);
        Assertions.assertEquals(expectedBalance, account.getBalance(), "Balance check after withdraw");

        System.out.println("Tested withdraw");
    }
}
