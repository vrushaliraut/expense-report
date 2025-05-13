package com.expense.domain;

import com.expense.domain.enums.ExpenseType;

import java.util.Date;
import java.util.List;

public class ExpenseReport {
    private final ExpenseFormatter formatter = new ExpenseFormatter();

    public String generateReport(List<Expense> expenses) {
        StringBuilder sb = new StringBuilder();
        int total = 0;
        int mealExpenses = 0;

        sb.append("Expenses ").append(new Date()).append("\n");

        for (Expense expense : expenses) {
            if (expense.getType() == ExpenseType.DINNER || expense.getType() == ExpenseType.BREAKFAST) {
                mealExpenses += expense.getAmount();
            }

            sb.append(formatter.format(expense)).append("\n");
            total += expense.getAmount();
        }

        sb.append("Meal expenses: ").append(mealExpenses).append("\n");
        sb.append("Total expenses: ").append(total).append("\n");

        return sb.toString();
    }
}
