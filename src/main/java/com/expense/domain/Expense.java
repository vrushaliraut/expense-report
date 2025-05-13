package com.expense.domain;

import com.expense.domain.enums.ExpenseType;

public record Expense(ExpenseType type, int amount) {
    // record provides getters: type() and amount()
}
