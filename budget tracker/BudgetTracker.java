import java.util.Scanner;

public class BudgetTracker {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double balance = 0;
        int choice;

        System.out.println("---- Budget Tracker ----");
        do {
System.out.println("1. Add Income");
System.out.println("2. Add Expense");
System.out.println("3. View Balance");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            switch(choice) {
                case 1:
                System.out.print("Enter income: ");
                double income = scanner.nextDouble();
                balance += income;
                System.out.println("Income added.");
                break;

                case 2:
                System.out.print("Enter expense: ");
                double expense = scanner.nextDouble();
                if (expense > balance) {
                    System.out.println("Insufficient balance!");
                } else {
                    balance -= expense;
                    System.out.println("Expense added.");
                }
                break;

                case 3:
                System.out.printf("Current Balance %.2f USD\n" , balance);
                break;

                case 4:
                System.out.println("Exiting the program...");
                break;

                default:
                System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 4); 

        scanner.close();




    }
}