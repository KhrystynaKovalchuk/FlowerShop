package users;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ReceiverTest {
    Receiver receiver;

    @BeforeEach
    void setUp() {
        receiver = new Receiver();
        receiver.setId(10);
    }

    @Test
    void update() {
        assertEquals(receiver.update("Hello"), "User's status is: Hello");
    }

    @Test
    void setId() {
        assertEquals(receiver.getId(), 10);
    }
}