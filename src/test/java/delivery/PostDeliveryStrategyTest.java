package delivery;

import flowerStore.Item;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class PostDeliveryStrategyTest {
    List<Item> items = new ArrayList<>();
    PostDeliveryStrategy strategy;

    @BeforeEach
    void setUp() {
        strategy = new PostDeliveryStrategy();
    }

    @Test
    void deliver() {
        assertEquals("The items will be delivered by post.", strategy.deliver(items));
    }
}