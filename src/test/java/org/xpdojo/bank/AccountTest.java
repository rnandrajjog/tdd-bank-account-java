package org.xpdojo.bank;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class AccountTest {

    @Test
	@Disabled
    public void depositAnAmountToIncreaseTheBalance() {
        assertThat("your first test").isBlank();
    }

    @Test
    public  void checkifDepositIsNotNegative()
    {
        Account account= new Account();
        assertThat(account.GetBalanceAmount()>-1);
    }
}
