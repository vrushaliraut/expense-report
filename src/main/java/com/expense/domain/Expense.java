package com.expense.domain;

public record Expense(ExpenseType type, int amount) {
    // record provides getters: type() and amount()
}
