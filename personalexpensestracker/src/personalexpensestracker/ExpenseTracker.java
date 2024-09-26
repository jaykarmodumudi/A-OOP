package personalexpensestracker;

import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class ExpenseTracker {
    private List<Expense> expenses;
    private Map<String, List<Expense>> categorizedExpenses;

    public ExpenseTracker() {
        expenses = new ArrayList<>();
        categorizedExpenses = new HashMap<>();
    }

    // Method to add an expense
    public void addExpense(Expense expense) {
        expenses.add(expense);
        categorizedExpenses.computeIfAbsent(expense.getCategory(), k -> new ArrayList<>()).add(expense);
    }

    // Method to filter expenses based on a given condition
    public List<Expense> filterExpenses(ExpenseFilter filter) {
        return expenses.stream().filter(filter::filter).collect(Collectors.toList());
    }

    // Method to generate a monthly report
    public void generateMonthlyReport() {
        Map<Month, Double> monthlySummary = expenses.stream()
                .collect(Collectors.groupingBy(expense -> expense.getDate().getMonth(),
                        Collectors.summingDouble(Expense::getAmount)));

        System.out.println("Monthly Expense Summary:");
        monthlySummary.forEach((month, total) -> System.out.println(month + ": $" + total));
    }

    // Method to generate a category-wise report
    public void generateCategoryReport() {
        System.out.println("Category-wise Expense Summary:");
        categorizedExpenses.forEach((category, expList) -> {
            double total = expList.stream().mapToDouble(Expense::getAmount).sum();
            System.out.println(category + ": $" + total);
        });
    }

    public static void main(String[] args) {
        ExpenseTracker tracker = new ExpenseTracker();

        // Sample data
        tracker.addExpense(new Expense(LocalDate.of(2024, 9, 20), 50, "Food", "Lunch"));
        tracker.addExpense(new Expense(LocalDate.of(2024, 9, 21), 100, "Transport", "Taxi"));
        tracker.addExpense(new Expense(LocalDate.of(2024, 9, 22), 20, "Food", "Snacks"));
        tracker.addExpense(new Expense(LocalDate.of(2024, 10, 5), 150, "Entertainment", "Concert"));

        // Generating reports
        tracker.generateMonthlyReport();
        tracker.generateCategoryReport();

        // Filtering expenses by category
        System.out.println("\nFiltered Expenses (Category: Food):");
        List<Expense> filteredExpenses = tracker.filterExpenses(expense -> "Food".equals(expense.getCategory()));
        filteredExpenses.forEach(System.out::println);
    }
}
