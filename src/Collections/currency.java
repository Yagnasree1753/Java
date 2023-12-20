package Collections;
import java.util.Currency;
import java.util.Locale;
public class currency {
    public static void main(String[] args){
        Currency currency = Currency.getInstance(Locale.US);
        System.out.println("Currency Code :" + currency.getCurrencyCode() ); ///Outputs USD
        System.out.println("Symbol: " + currency.getSymbol());  // Outputs $

        //Create a locale object for india
        Locale indiaLocale = new Locale("en", "IN");
        Currency indianCurrency =  Currency.getInstance(indiaLocale);
        System.out.println("Currency Code :" + indianCurrency.getCurrencyCode() );
        System.out.println("Symbol: " + indianCurrency.getSymbol());

    }
}
