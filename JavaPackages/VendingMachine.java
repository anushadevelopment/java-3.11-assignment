public class VendingMachine {
    public static void main(String[] args) {
        
    }

    public static double makePayment(double amount) {
        return amount;
    }

    enum Epayment {
        PAYNOW, GRABPAY, FAVEPAY
    }
    public static void makePayment()

    
    public static boolean connectPayNow(){
        return true;
    }
}




// public class VendingMachine {
    
//     public static void main(String[] args) {
//         VendingMachine myVendingMachine = new VendingMachine();
//         myVendingMachine.makePayment(10.0); // cash
//         myVendingMachine.makePayment(EPayment.GRABPAY); // cashless, no amount needed
//         myVendingMachine.makePayment(EPayment.FAVEPAY);
//         myVendingMachine.makePayment(EPayment.PAYNOW);
//     }

//     public void makePayment(double amount) {
//         System.out.printf("Payment of $%,.2f recieved!%n", amount);
//     }

//     enum EPayment {
//         PAYNOW, GRABPAY, FAVEPAY
//     }

//     public void makePayment(EPayment paymentMode) {
//         boolean succesfulPayment = switch (paymentMode) {
//             case FAVEPAY -> connectFavePay();
//             case GRABPAY -> connectGrabPay();
//             case PAYNOW -> connectPayNow();            
//         };

//         System.out.println("Payment " + (succesfulPayment ? "successful!" : "failed!"));
//     }

//     private boolean connectPayNow(){
//         System.out.println("Connecting to PayNow...");
//         return true;
//     }

//     private boolean connectGrabPay() {
//         System.out.println("Connecting to GrabPay...");
//         return false;
//     }

//     private boolean connectFavePay() {
//         System.out.println("Connecting to FavePay...");
//         return connectGrabPay();
//     }
// }
