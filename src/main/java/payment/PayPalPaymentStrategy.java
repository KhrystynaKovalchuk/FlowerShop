package payment;

public class PayPalPaymentStrategy implements Payment{
    @Override
    public String pay(double price){
        return "The payment will be done by PayPal.";
    }
}
