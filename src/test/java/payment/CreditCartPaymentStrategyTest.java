package payment;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import static org.junit.jupiter.api.Assertions.*;

class CreditCartPaymentStrategyTest {
    CreditCartPaymentStrategy strategy;

    @BeforeEach
    void setUp() {
        strategy = new CreditCartPaymentStrategy();
    }

    @Test
    void pay() {
        assertEquals("The payment will be done by Credit Card.", strategy.pay(50));
    }
}