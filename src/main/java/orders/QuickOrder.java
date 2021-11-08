package orders;

import flowerStore.FlowerBucket;

public class QuickOrder {
    private FlowerBucket bucket;
    public QuickOrder(FlowerBucket buck){
        bucket = buck;
    }
    public static Order createNew(QuickOrder order){
        return new Order();
    }
}
