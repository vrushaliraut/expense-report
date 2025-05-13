package com.expense.domain;

import com.expense.domain.enums.ExpenseCategory;

public interface ExpenseType {
    String getName();
    ExpenseCategory getCategory();
    boolean isOverLimit(int amount);
}
