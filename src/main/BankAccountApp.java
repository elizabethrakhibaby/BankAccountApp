import java.util.Scanner;

public class BankAccountApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BankAccount account = new BankAccount();
        String action;

        System.out.println("Welcome to AwesomeGIC Bank! What would you like to do?");
        do {
            System.out.println("[D]eposit\n[W]ithdraw\n[P]rint statement\n[Q]uit");
            action = scanner.nextLine().trim().toUpperCase();

            switch (action) {
                case "D":
                    System.out.print("Please enter the amount to deposit: ");
                    double depositAmount = scanner.nextDouble();
                    scanner.nextLine();  // Consume newline
                    account.deposit(depositAmount);
                    break;
                case "W":
                    System.out.print("Please enter the amount to withdraw: ");
                    double withdrawAmount = scanner.nextDouble();
                    scanner.nextLine();  // Consume newline
                    account.withdraw(withdrawAmount);
                    break;
                case "P":
                    account.printStatement();
                    break;
                case "Q":
                    System.out.println("Thank you for banking with AwesomeGIC Bank.");
                    System.out.println("Have a nice day!");
                    break;
                default:
                    System.out.println("Invalid option. Please try again.");
            }
        } while (!action.equals("Q"));

        scanner.close();
    }
}
