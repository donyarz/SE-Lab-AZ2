package PaymentServices;

public class OnSiteOrderService implements OnSiteOrder {
    @Override
    public void onSiteOrderRegister(String customerName) {
        System.out.println("On-site order registered for " + customerName);
    }

    @Override
    public void onSiteOrderPayment(int foodPrice) {
        System.out.println("On-site payment with price: " + foodPrice + " Tomans!");
    }
}
