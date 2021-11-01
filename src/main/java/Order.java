import delivery.Delivery;
import flowerStore.Item;
import payment.Payment;

import java.util.ArrayList;
import java.util.List;

public class Order {
    public List<Item> items = new ArrayList<>();
    Payment payment;
    Delivery delivery;

    public void setPaymentStrategy(Payment payment){
        this.payment = payment;
    }

    public void SetDeliveryStrategy(Delivery delivery){
        this.delivery = delivery;
    }

    public double calculateTotalPrice(){
        double price = 0;
        for (Item item: items){
            price += item.getPrice();
        }
        return price;
    }

    public String processOrder(){
        return "Please wait... Your order is processed.";
    }

    public void addItem(Item item){
        items.add(item);
    }

    public void removeItem(Item item){
        items.remove(item);
    }
}
