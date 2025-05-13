package com.expense.domain.type;

import com.expense.domain.ExpenseType;
import com.expense.domain.enums.ExpenseCategory;

public class DinnerExpenseType implements ExpenseType {
    @Override
    public String getName() {
        return "Dinner";
    }

    @Override
    public ExpenseCategory getCategory() {
        return ExpenseCategory.MEAL;
    }

    @Override
    public boolean isOverLimit(int amount) {
        return amount > 5000;
    }
}
