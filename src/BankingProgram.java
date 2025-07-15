import java.util.Scanner;

public class BankingProgram {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args){
        //java banking program for beginners
        //declare variables
        double balance = 0;
        boolean isRunning = true;
        int choice;

        while(isRunning) {

            //display menu
            System.out.println("****************");
            System.out.println("Banking Program");
            System.out.println("****************");
            System.out.println("1: Show Balance");
            System.out.println("2: Deposit");
            System.out.println("3: Withdraw");
            System.out.println("4: Exit");
            System.out.println("****************");
            System.out.print("Enter your choice (1-4): ");
            choice = scanner.nextInt();
            switch (choice) {

                case 1 -> showBalance(balance);
                case 2 -> balance += deposit();
                case 3 -> balance -= withdraw(balance);
                case 4 -> isRunning = false;
                default -> System.out.println("Invalid choice");
            }
        }
        System.out.println("****************");
        System.out.println("Thank you! Have a nice day!!!");
        //get and process users choice
        //showBalance()
        //deposit()
        //withdraw()
        //exit message
        scanner.close();
    }

    static void showBalance(double balance){
        System.out.println("****************");
        System.out.printf("$%.2f\n", balance);
    }
    static double deposit(){
        double amount;
        System.out.print("Enter amount to be deposited: ");
        amount = scanner.nextDouble();
        if(amount < 0){
            System.out.println("Amount cannot be negative");
            return 0;
        }
        else{
            return amount;
        }

    }
    static double withdraw(double balance){
        double amount;
        System.out.print("Enter amount to be withdrawn: ");
        amount = scanner.nextDouble();
        if(amount > balance){
            System.out.print("Insufficient funds\n");
            return 0;
        }else if ( amount < 0){
            System.out.print("Amount cannot be negative\n");
            return 0;
        }
        else{
            return amount;
        }
    }
}
