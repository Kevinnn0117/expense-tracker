import java.util.ArrayList;

public class ExpenseManager {
    private ArrayList<Expense> expenses = new ArrayList<>();

    public void add(Expense expense) {
        if (expense.getAmount() <= 0){
            System.out.println("Amount must be greater than 0.");
            return;
        }

        expenses.add(expense);
    }

    public void list() {
        for (int i = 0; i < expenses.size(); i++) {
            System.out.print(
                    expenses.get(i).getDescription() + " | " +
                            expenses.get(i).getCategory() + " | "
            );

            System.out.printf("%.2f%n", expenses.get(i).getAmount());
        }
    }

    public double total() {
        double total = 0;

        for (int i = 0; i < expenses.size(); i++) {
            total += expenses.get(i).getAmount();
        }

        return total;
    }

}