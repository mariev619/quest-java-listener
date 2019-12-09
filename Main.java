public class Main {

    public static void main(String[] args) {

        // TODO : create and use a TransactionListener interface with onComplete method
        Transactions.withdraw(100, new TransactionListener() {
            public void onComplete(Bank account) {
                System.out.printf("Your balance is: %d%n", account.getTotal());
            }
        });
    }
}