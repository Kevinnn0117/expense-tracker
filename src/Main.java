import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ExpenseManager manager = new ExpenseManager();

        manager.add(new Expense(12.50, "Lunch", "Food"));
        manager.add(new Expense(2.75, "Metro", "Travel"));
        manager.add(new Expense(18.00, "Book", "Learning"));


        //scanner (user input)
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter amount: ");
        double amount = scanner.nextDouble();
        scanner.nextLine();

        System.out.print("Enter description: ");
        String description = scanner.nextLine();

        System.out.print("Enter category: ");
        String category = scanner.nextLine();

        scanner.close();

        manager.add(new Expense(amount, description, category));


        manager.list();

        System.out.printf("TOTAL: %.2f%n", manager.total());
    }
}