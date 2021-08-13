package za.ac.cput.factory;

import org.junit.jupiter.api.Test;
import za.ac.cput.entity.Payment;
import static org.junit.jupiter.api.Assertions.*;

class PaymentFactoryTest {

    @Test
    public void createPayment(){

        Payment payment=PaymentFactory.creatPayment(20,"2021/06/11");
        System.out.println(payment.getPaymentID());
        assertNotNull(payment.getPaymentID());
        System.out.println(payment);

    }
}