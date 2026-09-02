public class Main {
    public static void main(String[] args) {
        ExpenseManager manager = new ExpenseManager();

        manager.add(new Expense(12.50, "Lunch", "Food"));
        manager.add(new Expense(2.75, "Metro", "Travel"));
        manager.add(new Expense(18.00, "Book", "Learning"));

        manager.list();

        System.out.printf("TOTAL: %.2f%n", manager.total());
    }
}