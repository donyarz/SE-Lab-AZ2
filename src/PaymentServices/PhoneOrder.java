package PaymentServices;

public interface PhoneOrder {
    void registerPhoneOrder(String customerName);
    void processPhonePayment(int foodPrice);
}
