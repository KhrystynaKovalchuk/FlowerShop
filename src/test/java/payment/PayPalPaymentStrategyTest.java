package payment;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PayPalPaymentStrategyTest {
    PayPalPaymentStrategy strategy;

    @BeforeEach
    void setUp() {
        strategy = new PayPalPaymentStrategy();
    }

    @Test
    void pay() {
        assertEquals("The payment will be done by PayPal.", strategy.pay(50));
    }
}