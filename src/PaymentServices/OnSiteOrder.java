package PaymentServices;

public interface OnSiteOrder {
    void registerOnSiteOrder(String customerName);
    void processOnSitePayment(int foodPrice);
}
