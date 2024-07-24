package PaymentServices;

public class PhoneOrderService implements PhoneOrder {
    @Override
    public void phoneOrderRegister(String customerName) {
        System.out.println("Phone order registered for " + customerName);
    }

    @Override
    public void phoneOrderPayment(int foodPrice) {
        System.out.println("Phone payment with price: " + foodPrice + " Tomans!");
    }
}
