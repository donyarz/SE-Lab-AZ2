package PaymentServices;

public interface OnlineOrder {
    void registerOnlineOrder(String customerName);
    void processOnlinePayment(int foodPrice);
}
