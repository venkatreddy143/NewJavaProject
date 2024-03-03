package interfaceseggregation;

interface MoneyExchanger {
    double exchangeToUSD(double amount, String fromCurrency);
    double exchangeToEUR(double amount, String fromCurrency);
}
