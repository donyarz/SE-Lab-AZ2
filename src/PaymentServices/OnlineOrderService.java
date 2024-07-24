package PaymentServices;

public class OnlineOrderService implements OnlineOrder {
    @Override
    public void registerOnlineOrder(String customerName) {
        System.out.println("Online order registered for " + customerName);
    }

    @Override
    public void processOnlinePayment(int foodPrice) {
        System.out.println("Online payment with price: " + foodPrice + " Tomans!");
    }
}
