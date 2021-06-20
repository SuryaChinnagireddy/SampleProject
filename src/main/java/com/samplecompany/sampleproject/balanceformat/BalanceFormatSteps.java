package com.samplecompany.sampleproject.balanceformat;

import com.samplecompany.sampleproject.balanceverify.BalancePage;
import org.fluentlenium.core.annotation.Page;
import org.junit.Assert;

import java.util.Arrays;
import java.util.Currency;
import java.util.List;
import java.util.Locale;

public class BalanceFormatSteps {


    @Page
    BalancePage balancePage;

    public void verifyBalanceFormat() {

        String balance1 = balancePage.textValue1.getValue();
        verifyCurrencyFormat(balance1);

        String balance2 = balancePage.textValue2.getValue();
        verifyCurrencyFormat(balance2);

        String balance4 = balancePage.textValue4.getValue();
        verifyCurrencyFormat(balance4);

        String balance5 = balancePage.textValue5.getValue();
        verifyCurrencyFormat(balance5);

        String balance6 = balancePage.textValue6.getValue();
        verifyCurrencyFormat(balance6);

        String totalBalance = balancePage.textTotalValue.getValue();
        verifyCurrencyFormat(totalBalance);

    }



    private boolean verifyCurrencyFormat(String str) {
        boolean format = false;
        char c = str.charAt(0);
        List<Character> currency = Arrays.asList('\u0024', '\u20AC', '\u20AC');

        if (currency.contains(c)) {
            format = true;
            System.out.println("The given String "+str+" has a curency symbol");
        }else{
            System.out.println("The given String "+str+" doesn't have a curency symbol");
        }

        Assert.assertTrue(currency.contains(c));

        return format;
    }
}
