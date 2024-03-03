package interfaceseggregation;

import interfaceseggregation.Bank;

public class CurrencyExchangerFactory {
    public static MoneyExchanger getExchanger(String currency) {
        MoneyExchanger result = null;
        if (currency.equals("USD")) {
            result = new Bank();
        } else if (currency.equals("EUR")) {
            result = new Bank();
        } else {
            System.out.println("Unsupported currency");
        }
        return result;
    }

}
