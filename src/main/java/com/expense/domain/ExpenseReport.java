package com.expense.domain;

import com.expense.domain.enums.ExpenseCategory;

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
            if (expense.type().getCategory() == ExpenseCategory.MEAL) {
                mealExpenses += expense.amount();
            }

            sb.append(formatter.format(expense)).append("\n");
            total += expense.amount();
        }

        sb.append("Meal expenses: ").append(mealExpenses).append("\n");
        sb.append("Total expenses: ").append(total).append("\n");

        return sb.toString();
    }
}
