package com.expense.domain.type;

import com.expense.domain.ExpenseType;
import com.expense.domain.enums.ExpenseCategory;

public class CarRentalExpenseType implements ExpenseType {
    @Override
    public String getName() {
        return "Car Rental";
    }

    @Override
    public ExpenseCategory getCategory() {
        return ExpenseCategory.TRAVEL;
    }

    @Override
    public boolean isOverLimit(int amount) {
        return false;
    }
}
