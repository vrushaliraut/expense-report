package com.expense.application;

import com.expense.domain.Expense;
import com.expense.presentation.ExpenseFormatter;
import com.expense.domain.enums.ExpenseCategory;

import java.util.List;

public class ExpenseReportService {
    private final ExpenseFormatter formatter;

    public ExpenseReportService(ExpenseFormatter formatter) {
        this.formatter = formatter;
    }

    public String generateReport(List<Expense> expenses) {
        StringBuilder sb = new StringBuilder();
        int total = 0;
        int mealExpense = 0;
        sb.append("Expenses Report\n");

        for (Expense expense : expenses) {
            if (expense.type().getCategory() == ExpenseCategory.MEAL) {
                mealExpense = mealExpense + expense.amount();
            }

            sb.append(formatter.format(expense)).append("\n");
            total = total + expense.amount();
        }

        sb.append("Meal expenses: ").append(mealExpense).append("\n");
        sb.append("Total expenses: ").append(total).append("\n");

        return sb.toString();
    }


}
