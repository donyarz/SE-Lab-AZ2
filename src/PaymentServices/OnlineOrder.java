package PaymentServices;

public interface OnlineOrder {
    void onlineOrderRegister(String customerName);
    void onlineOrderPayment(int foodPrice);
}
