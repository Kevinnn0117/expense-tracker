public class Main {
    public static void main(String[] args) {
        Expense e1 = new Expense(12.50, "Lunch", "Food");
        Expense e2 = new Expense(2.75, "Metro", "Travel");
        Expense e3 = new Expense(18.00, "Book", "Learning");

        System.out.println(
                e1.getDescription() + " | " +
                        e1.getCategory() + " | " +
                        e1.getAmount()
        );

        System.out.println(
                e2.getDescription() + " | " +
                        e2.getCategory() + " | " +
                        e2.getAmount()
        );

        System.out.println(
                e3.getDescription() + " | " +
                        e3.getCategory() + " | " +
                        e3.getAmount()
        );

        double total = e1.getAmount() + e2.getAmount() + e3.getAmount();

        System.out.println("TOTAL: " + total);
    }
}