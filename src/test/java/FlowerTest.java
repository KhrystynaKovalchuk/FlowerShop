import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FlowerTest {
    private Flower flower;
    private Flower flower1;
    private FlowerPack flowerPack;
    private FlowerPack flowerPack1;
    private FlowerBucket flowerBucket;
    private Store store;
    @org.junit.jupiter.api.BeforeEach
    void setUp() {


        flowerPack = new FlowerPack();
        flower = new Flower(FlowerType.ROSE);
        flower.setPrice(10);
        flower.setSepalLength(50);

        flowerPack.setFlower(flower);
        flowerPack.setAmount(10);

        flowerPack1 = new FlowerPack();
        flower1 = new Flower(FlowerType.TULIP);
        flower1.setPrice(25);
        flower1.setSepalLength(30);

        flowerPack1.setFlower(flower1);
        flowerPack1.setAmount(7);

        flowerBucket = new FlowerBucket();
        flowerBucket.addPack(flowerPack);
        flowerBucket.addPack(flowerPack1);

        store = new Store();
        store.addBucketToStore(flowerBucket);
    }

    @Test
    void getFlowerType() {
        assertEquals(FlowerType.ROSE, flower.getFlowerType());
        assertEquals(FlowerType.TULIP, flower1.getFlowerType());
    }

    @Test
    void getPrice() {
        assertEquals(10, flower.getPrice());
        assertEquals(25, flower1.getPrice());
    }

    @Test
    void getSepalLength() {
        assertEquals(50, flower.getSepalLength());
        assertEquals(30, flower1.getSepalLength());
    }

    @Test
    void getPackPrice() {
        assertEquals(100, flowerPack.getPrice());
        assertEquals(175, flowerPack1.getPrice());
    }

    @Test
    void getBucketPrice() {
        assertEquals(275, flowerBucket.getPrice());
    }

    @Test
    void testStoreSearch() {
        assertEquals(1, store.search(FlowerType.ROSE));
        assertEquals(1, store.search(FlowerType.TULIP));
    }
}