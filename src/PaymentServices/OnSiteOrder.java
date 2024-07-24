package PaymentServices;

public interface OnSiteOrder {
    void onSiteOrderRegister(String customerName);
    void onSiteOrderPayment(int foodPrice);
}
