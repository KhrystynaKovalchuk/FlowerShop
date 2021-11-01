package decorator;

import flowerStore.FlowerBucket;
import flowerStore.Item;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RibbonDecoratorTest {
    RibbonDecorator decorator;
    Item item = new FlowerBucket();

    @BeforeEach
    void setUp() {
        decorator = new RibbonDecorator(item);
    }

    @Test
    void getPrice() {
        assertEquals(40, decorator.getPrice());
    }
}