package delivery;

import flowerStore.Item;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class DHLDeliveryStrategyTest {
    List<Item> items = new ArrayList<>();
    DHLDeliveryStrategy strategy;

    @BeforeEach
    void setUp() {
        strategy = new DHLDeliveryStrategy();
    }

    @Test
    void deliver() {
        assertEquals("The items will be delivered by courier.", strategy.deliver(items));
    }
}