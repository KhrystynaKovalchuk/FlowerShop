package users;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SenderTest {
    Sender sender;

    @BeforeEach
    void setUp() {
        sender = new Sender();
        sender.setId(10);
    }

    @Test
    void update() {
        assertEquals(sender.update("Hello"), "User's status is: Hello");
    }

    @Test
    void getId() {
        assertEquals(sender.getId(), 10);
    }
}