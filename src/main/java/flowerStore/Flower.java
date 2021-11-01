package flowerStore;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class Flower extends Item {

    private FlowerType flowerType;
    private double price;
    private double sepalLength;
    private String color;

    public Flower(FlowerType flowerType) {
        this.flowerType = flowerType;
    }

    @Override
    public String getDescription() {
        return "Flower";
    }

    @Override
    public double getPrice(){
        return price;
    }
}
