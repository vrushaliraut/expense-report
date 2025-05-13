package com.expense.domain;

import com.expense.domain.enums.ExpenseType;

public class ExpenseFormatter {
    public String format(Expense expense) {
        String name = switch (expense.getType()) {
            case DINNER -> "Dinner";
            case BREAKFAST -> "Breakfast";
            case CAR_RENTAL -> "Car Rental";

        };

        String marker = (expense.getType() == ExpenseType.DINNER && expense.getAmount() > 5000)
                || (expense.getType() == ExpenseType.BREAKFAST && expense.getAmount() > 1000)
                ? "X" : " ";

        return name + "\t" + expense.getAmount() + "\t" + marker;

    }
}
