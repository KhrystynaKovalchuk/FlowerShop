import java.util.ArrayList;
import java.util.List;

public class FlowerBucket {
    public List<FlowerPack> flowerPackList = new ArrayList<FlowerPack>();

    public void addPack(FlowerPack flowerPack) {
        flowerPackList.add(flowerPack);
    }

    public double getPrice(){
        double price = 0;
        for (FlowerPack flowerPack: flowerPackList) {
            price += flowerPack.getPrice();
        }
        return price;
        }
    }
