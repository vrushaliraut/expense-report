package com.expense.domain.policy;

import com.expense.domain.OverExpensePolicy;

public class BreakfastOverExpensePolicy implements OverExpensePolicy {
    @Override
    public boolean isOverLimit(int amount) {
        return amount > 1000;
    }
}
