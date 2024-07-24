package Exp_03_With_SOLID.src.PaymentServices;

public interface PhoneOrder {
    void phoneOrderRegister(String customerName);
    void phoneOrderPayment(int foodPrice);
}
