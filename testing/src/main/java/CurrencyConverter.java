public class CurrencyConverter {

    private String inputCurrency;
    private String outputCurrency;
    private float exchangeRate;
    public CurrencyConverter(String inputCurrency,
                             String outputCurrency,
                             float exchangeRate) {
        this.inputCurrency = inputCurrency;
        this.outputCurrency = outputCurrency;
        this.exchangeRate = exchangeRate;
    }
    private float convert(float inputCurrencyValue) {
        float outputCurrencyValue = inputCurrencyValue * exchangeRate;
        return outputCurrencyValue;
    }
    //inputCurrency->outputCurrency=outputCurrencyValue, np. USD->PLN=23
    //PLN->EUR=100
    //GPB->EUR=34
    public String doTransaction(float inputCurrencyValue) {
        float outputCurrencyValue = convert(inputCurrencyValue);
        String receipt = inputCurrency + "->" + outputCurrency + "=" + outputCurrencyValue;
        return receipt;
    }
    public static void main(String[] args) {
        CurrencyConverter currencyConverter =
                new CurrencyConverter("PLN",
                        "USD",
                        0.26f);
        String receipt = currencyConverter.doTransaction(100);
        String receipt2 = currencyConverter.doTransaction(200);
        System.out.println("Paragon 1: " + receipt);
        System.out.println("Paragon 2: " + receipt2);
    }
}