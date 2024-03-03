package interfaceseggregation;

import interfaceseggregation.Bank;
import interfaceseggregation.CurrencyExchangerFactory;

public class CurrencyExchangerFactoryTest {
    public static void main(String[] args) {
        MoneyExchanger usdExchanger = CurrencyExchangerFactory.getExchanger("USD");
        double exchangedAmount = usdExchanger.exchangeToUSD(10000.00 , "INR");
        System.out.println("Exchanged amount from INR to USD: " + exchangedAmount+"Dollors");

        MoneyExchanger eurExchanger = CurrencyExchangerFactory.getExchanger("EUR");
        exchangedAmount = eurExchanger.exchangeToEUR(10000.00, "INR");
        System.out.println("Exchanged amount from INR to EUR: " + exchangedAmount+"Euros");
    }
}