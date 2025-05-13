package com.expense.domain.type;

import com.expense.domain.ExpenseType;
import com.expense.domain.enums.ExpenseCategory;

public class BreakfastExpenseType implements ExpenseType {
    @Override
    public String getName() {
        return "Breakfast";
    }

    @Override
    public ExpenseCategory getCategory() {
        return ExpenseCategory.MEAL;
    }

    @Override
    public boolean isOverLimit(int amount) {
        return amount > 1000;
    }
}
