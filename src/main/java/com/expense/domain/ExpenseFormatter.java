package com.expense.domain;

import com.expense.domain.enums.ExpenseType;

public class ExpenseFormatter {
    public String format(Expense expense) {
        ExpenseType type = expense.type();
        int amount = expense.amount();

        String marker = isMealOverLimit(type, amount) ? "X" : " ";
        return type.getDisplayName() + "\t" + amount + "\t" + marker;
    }

    private boolean isMealOverLimit(ExpenseType type, int amount) {
        return (type == ExpenseType.DINNER && amount > 5000)
                || (type == ExpenseType.BREAKFAST && amount > 1000);
    }
}
