//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
//        double x = 2+4L;
//        System.out.println(x);
//        //i++ only takes the old value
//        //++i takes the new value after incremented
//        int i = 0;
//        i = ++i;
//        System.out.println(i);

//        double root = Math.sqrt(2.0);
//        Double d1 = new Double(root);
//        Double d2 = root;
//        System.out.println(d2.toString());
//        System.out.println(integer.toString(2));

//        String s = "2.5";
//        double value = Double.parseDouble(s);
//        System.out.println(value);

//        int t = Integer.MAX_VALUE;
//        System.out.println(t+1);
//
//        int z = t + 1;
//        System.out.println(z);


        CreditCard card1 = new CreditCard("Edward", "Kelvin Bank", "1234 5678 9012 3456", 5000, 1000.0);

        // Example usage
        System.out.println("Credit Card Details:");
        System.out.println("Customer: " + card1.getCustomer());
        System.out.println("Bank: " + card1.getBank());
        System.out.println("Account: " + card1.getAccount());
        System.out.println("Limit: " + card1.getLimit());
        System.out.println("Balance: " + card1.getBalance());

        double chargeAmount = 6000;
        boolean chargeResult = card1.charge(chargeAmount);
        if (chargeResult) {
            System.out.println("Charge of $" + chargeAmount + " successful.");
        } else {
            System.out.println("Charge of $" + chargeAmount + " failed. Exceeds credit limit.");
        }

        double paymentAmount = 50.0;
        card1.makePayment(paymentAmount);
        System.out.println("Made a payment of $" + paymentAmount);

        // Displaying updated balance
        System.out.println("Updated Balance: " + card1.getBalance());

    }
}