package payment;

public class CreditCartPaymentStrategy implements Payment{
    @Override
    public String pay(double price){
        return "The payment will be done by Credit Card.";
    }
}
