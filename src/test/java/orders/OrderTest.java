package orders;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import users.Receiver;

import static org.junit.jupiter.api.Assertions.*;

class OrderTest {
    Order order = new Order();
    Receiver receiver = new Receiver();

    @BeforeEach
    void setUp() {
    }

    @Test
    void addUser() {
        order.addUser(receiver);
        assertEquals(order.users.size(), 1);
    }

    @Test
    void removeUser() {
        order.removeUser(receiver);
        assertEquals(order.users.size(), 0);
    }
}