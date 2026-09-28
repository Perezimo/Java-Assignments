package tdd;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class AccountTest {
    private Account account;
    @BeforeEach
    void setUp(){
        account = new Account();

    }

    @Test
    public void testToShowIfI_CanCheck_AccountBalance(){
        double actual = account.checkBalance();
        double expected = 5000.0;

        assertEquals(expected,actual);
    }
    @Test
    public void testThat_ICanDeposit_AmountIn_Account() {
        account.deposit(5000);
        double actual = account.checkBalance();

        double expected = 5000.0;

        assertEquals(expected, actual);

    }

    @Test
    public void testToShowICan_WithdrawAnAmount_FromAccount(){
        account.deposit(5000.0);
        account.withdraw(4000);

        double actual= Account.checkBalance();
        double expected = 1000.0;

        assertEquals(expected , actual);

    }

    @Test
    public void testThatI_CannotWithdraw_MoreThanAccount_Balance(){

        account.deposit(5000.0);
        account.withdraw(6000.0);

        double actual= account.checkBalance();
        double expected = 0.0;

        assertEquals(expected, actual);

    }

   // @Test
    //public void testThat_INeed_PasswordTo_KnowMy_AccountBalance(){
       // if(password == 2468){

        }

