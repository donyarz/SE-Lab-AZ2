package EXP_01_Non_SOLID.src.PaymentServices;

public interface OrderService {
    public void onSiteOrderRegister(String customerName);
    public void onlineOrderRegister(String customerName);
    public void phoneOrderRegister(String customerName); // New method for phone orders

    public void onSiteOrderPayment(int foodPrice);
    public void onlineOrderPayment(int foodPrice);
    public void phoneOrderPayment(int foodPrice); // New method for phone orders
}
