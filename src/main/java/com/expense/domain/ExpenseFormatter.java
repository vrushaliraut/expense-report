package com.expense.domain;

public class ExpenseFormatter {
    public String format(Expense expense) {
        String marker = expense.type().isOverLimit(expense.amount()) ? "X" : " ";
        return expense.type().getName() + "\t" + expense.amount() + "\t" + marker;
    }
}
