package delivery;

import flowerStore.Item;

import java.util.List;

public class DHLDeliveryStrategy implements Delivery{
    @Override
    public String deliver(List<Item> items){
        return "The items will be delivered by courier.";
    }
}
