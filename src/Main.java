import PaymentServices.OnSiteOrder;
import PaymentServices.OnSiteOrderService;
import PaymentServices.OnlineOrder;
import PaymentServices.OnlineOrderService;
import PaymentServices.PhoneOrder;
import PaymentServices.PhoneOrderService;
// import PaymentServices.OrderService;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // OrderService orderService = null;
        Object orderService = null;
        String customerName;
        Order order;
        int customerAnswerForOrder = 0;
        int customerAnswerForPaymentMethod = 0;

        System.out.println("Enter Customer Name : ");
        customerName = scanner.nextLine();
        order = new Order(customerName);

        //Step 1 : Select Order Items
        while (customerAnswerForOrder != 3) {
            System.out.println("For Ordering Sandwich enter 1.");
            System.out.println("For Ordering Pizza enter 2.");
            System.out.println("For submit your order enter 3");
            customerAnswerForOrder = scanner.nextInt();

            if (customerAnswerForOrder == 1) {
                order.addItem(new Food("sandwich", 1000));
            } else if (customerAnswerForOrder == 2) {
                order.addItem(new Food("pizza", 2000));
            }


        }

        //Step2 : Select Payment Method
        System.out.println("Enter Your Payment Method (1 for online, 2 for on-site, 3 for phone):");
        customerAnswerForPaymentMethod = scanner.nextInt();
        if (customerAnswerForPaymentMethod == 1) {
            orderService = new OnlineOrderService();
            ((OnlineOrder) orderService).onlineOrderRegister(customerName);
        } else if (customerAnswerForPaymentMethod == 2) {
            orderService = new OnSiteOrderService();
            ((OnSiteOrder) orderService).onSiteOrderRegister(customerName);
        } else if (customerAnswerForPaymentMethod == 3) {
            orderService = new PhoneOrderService();
            ((PhoneOrder) orderService).phoneOrderRegister(customerName);
        }

        //Step3 : pay price
        System.out.println("Pay Price:");
        if (orderService instanceof OnlineOrderService) {
            ((OnlineOrder) orderService).onlineOrderPayment(order.getTotalPrice());
        } else if (orderService instanceof OnSiteOrderService) {
            ((OnSiteOrder) orderService).onSiteOrderPayment(order.getTotalPrice());
        } else if (orderService instanceof PhoneOrderService) {
            ((PhoneOrder) orderService).phoneOrderPayment(order.getTotalPrice());
        }

        //Finally Print Bill
        System.out.println(order);


    }

}
