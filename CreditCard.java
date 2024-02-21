public class CreditCard {
    //FIELDS
        private String customer;
        private String bank;
        private String account;
        private int limit;
        private double balance;

    //CONSTRUCTORS
        public CreditCard(String customer, String bank, String account, int limit, double balance){
            this.customer = customer;
            this.bank = bank;
            this.account = account;
            this.limit = limit;
            this.balance = balance;
        }
    //GETTERS
        public String getCustomer () {
            return customer;
        }
        public String getBank () {
            return bank;
        }
        public String getAccount () {
            return account;
        }
        public int getLimit () {
            return limit;
        }
        public double getBalance () {
            return balance;
        }

        public boolean charge (double price){
            return price <= limit;
        }

        public void makePayment (double amount){
            balance -= amount;
        }


}
