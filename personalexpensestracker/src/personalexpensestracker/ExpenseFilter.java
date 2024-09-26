package personalexpensestracker;

@FunctionalInterface
public interface ExpenseFilter {
    boolean filter(Expense expense);
}

