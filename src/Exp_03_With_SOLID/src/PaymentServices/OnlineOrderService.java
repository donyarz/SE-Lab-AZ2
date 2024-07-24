package Exp_03_With_SOLID.src.PaymentServices;

public class OnlineOrderService implements OnlineOrder {
    @Override
    public void onlineOrderRegister(String customerName) {
        System.out.println("Online order registered for " + customerName);
    }

    @Override
    public void onlineOrderPayment(int foodPrice) {
        System.out.println("Online payment with price: " + foodPrice + " Tomans!");
    }
}
