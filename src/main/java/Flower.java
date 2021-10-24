import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class Flower {
    private FlowerType flowerType;
    private double price;
    private double sepalLength;
    private String color;

    public Flower(FlowerType flowerType) {
        this.flowerType = flowerType;
    }
}
