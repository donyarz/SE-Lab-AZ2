package PaymentServices;

public class PhoneOrderService implements OrderService {
    @Override
    public void onSiteOrderRegister(String customerName) {
        // Empty Body
    }

    @Override
    public void onlineOrderRegister(String customerName) {
        // Empty Body
    }

    @Override
    public void onSiteOrderPayment(int foodPrice) {
        // Empty Body
    }

    @Override
    public void onlineOrderPayment(int foodPrice) {
        // Empty Body
    }

    // New methods for phone orders
    public void phoneOrderRegister(String customerName) {
        System.out.println("Phone order registered for " + customerName);
    }

    public void phoneOrderPayment(int foodPrice) {
        System.out.println("Phone Payment with Price: " + foodPrice + " Tomans!");
    }
}
