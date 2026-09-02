public class Main {
    public static void main(String[] args) {
        Expense e1 = new Expense(12.50, "Lunch", "Food");
        Expense e2 = new Expense(2.75, "Metro", "Travel");
        Expense e3 = new Expense(18.00, "Book", "Learning");

        Expense[] expenses = {e1, e2, e3};

        for (int i = 0; i < expenses.length; i++) {
            System.out.print(
                expenses[i].getDescription() + " | " +
                        expenses[i].getCategory() + " | "
            );

            System.out.printf("%.2f%n", expenses[i].getAmount());
        }


        double total = e1.getAmount() + e2.getAmount() + e3.getAmount();

        System.out.println("TOTAL: " + total);
    }
}