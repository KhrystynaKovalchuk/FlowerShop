package decorator;

import flowerStore.FlowerBucket;
import flowerStore.Item;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PaperDecoratorTest {
    PaperDecorator decorator;
    Item item = new FlowerBucket();
    @BeforeEach
    void setUp() {
        decorator = new PaperDecorator(item);
    }

    @Test
    void getPrice() {
        assertEquals(13, decorator.getPrice());
    }
}