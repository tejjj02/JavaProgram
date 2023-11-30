import java.util.Scanner;

class bankAcc {
    private double bal;

    public bankAcc(double initialBalance) {
        this.bal = initialBalance;
    }

    public double getBalance() {
        return bal;
    }

    public void deposit(double amount) {
        bal += amount;
        System.out.println("Deposit successful. Latest balance: " + bal);
    }

    public boolean withdraw(double amount) {
        if (amount > bal) {
            System.out.println("Low funds. Withdrawal failed.");
            return false;
        } else {
            bal -= amount;
            System.out.println("Withdrawal successful. Latest balance: " + bal);
            return true;
        }
    }
}
class atmInterface {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter initial balance for account: ");
        double initialBal = sc.nextDouble();
        bankAcc userAccount = new bankAcc(initialBal);
        while (true) {
            System.out.println("ATM Menu:");
            System.out.println("1. Check Balance in account");
            System.out.println("2. Deposit amount");
            System.out.println("3. Withdraw amount");
            System.out.println("4. Exit");
            System.out.println("Choose an option: ");

            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Current balance: " + userAccount.getBalance());
                    break;
                case 2:
                    System.out.print("Enter deposit amount: ");
                    double depositAmount = sc.nextDouble();
                    userAccount.deposit(depositAmount);
                    break;
                case 3:
                    System.out.print("Enter withdrawal amount: ");
                    double withdrawAmount = sc.nextDouble();
                    userAccount.withdraw(withdrawAmount);
                    break;
                case 4:
                    System.out.println("Exiting ATM.");
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please choose a valid option.");
            }
        }
    }
}
