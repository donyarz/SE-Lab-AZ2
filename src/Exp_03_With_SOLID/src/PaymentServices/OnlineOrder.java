package Exp_03_With_SOLID.src.PaymentServices;

public interface OnlineOrder {
    void onlineOrderRegister(String customerName);
    void onlineOrderPayment(int foodPrice);
}
