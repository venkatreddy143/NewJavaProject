package interfaceseggregation;

public class Bank implements MoneyExchanger {
    private final double dollorExchangeRate = 0.0127;
    private final double euroExchangeRate = 0.0116;

    @Override
    public double exchangeToUSD(double amount, String fromCurrency) {
        if (fromCurrency.equals("INR")) {
            return amount * euroExchangeRate;
        } else {
            System.out.println("Unsupported currency");
        }
        return amount;
    }
    @Override
    public double exchangeToEUR(double amount, String fromCurrency) {
        if (fromCurrency.equals("INR")) {
            return amount* dollorExchangeRate;
        } else {
            System.out.println("Unsupported currency");
        }
        return amount;
    }
}
