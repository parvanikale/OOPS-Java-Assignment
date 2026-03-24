class BankApplication {

    // Method that throws exception
    static void processTransaction(int amount) throws Exception {

        if (amount < 0) {
            throw new Exception("Invalid transaction");
        }

        System.out.println("Transaction processed");
    }

    public static void main(String[] args) {

        try {
            int amount = 1000; // valid amount
            processTransaction(amount);

        } catch (Exception e) {
            System.out.println("Exception handled in main");
        }
    }
}