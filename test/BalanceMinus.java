import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class BalanceMinus {

    @Test
    public void changeBudget() {
        Balance balance = new Balance(100);
        VariableExpense banana = new VariableExpense("banana", 1);
        balance.substractCash(banana.getAmount());
        Assertions.assertEquals(99, balance.getBalance(), "You didn't buy a banana");
    }
}