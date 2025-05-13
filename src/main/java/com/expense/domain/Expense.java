package com.expense.domain;

import com.expense.domain.enums.ExpenseType;

public class Expense {
    private final ExpenseType type;
    private final int amount;

    public Expense(ExpenseType type, int amount) {
        this.type = type;
        this.amount = amount;
    }

    public ExpenseType getType() {
        return type;
    }

    public int getAmount() {
        return amount;
    }
}
