package PaymentServices;

public class PhoneOrderService implements PhoneOrder {
    @Override
    public void registerPhoneOrder(String customerName) {
        System.out.println("Phone order registered for " + customerName);
    }

    @Override
    public void processPhonePayment(int foodPrice) {
        System.out.println("Phone payment with price: " + foodPrice + " Tomans!");
    }
}
