package delivery;

import flowerStore.Item;

import java.util.List;

public interface Delivery {
    String deliver(List<Item> items);
}
