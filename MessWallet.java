public class MessWallet {
    double balance;

    public MessWallet(double openingBalance) {
        if (openingBalance < 0) {
            System.out.println("Balance is negative");
            balance = 0;
        } else {
            balance = openingBalance;
        }
    }

    public void topUp(double amount) {
        if (amount > 0) {
            balance += amount;
        } else {
            System.out.println("Given amount is negative");
        }
    }

    public void deduct(double amount) {
        if (amount > balance) {
            System.out.println("Deduct rejected: Insufficient balance");
        } else {
            balance -= amount;
        }
    }

    public double getBalance() {
        return balance;
    }

    public static void main(String[] args) {
        MessWallet wallet = new MessWallet(5);

        wallet.topUp(5);
        wallet.deduct(5);

        System.out.println(wallet.getBalance());
    }
}