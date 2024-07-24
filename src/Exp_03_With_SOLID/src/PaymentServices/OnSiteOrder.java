package Exp_03_With_SOLID.src.PaymentServices;

public interface OnSiteOrder {
    void onSiteOrderRegister(String customerName);
    void onSiteOrderPayment(int foodPrice);
}
