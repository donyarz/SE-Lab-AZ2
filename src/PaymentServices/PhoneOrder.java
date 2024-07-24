package PaymentServices;

public interface PhoneOrder {
    void phoneOrderRegister(String customerName);
    void phoneOrderPayment(int foodPrice);
}
