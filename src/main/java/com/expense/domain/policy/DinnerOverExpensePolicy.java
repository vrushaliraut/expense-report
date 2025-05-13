package com.expense.domain.policy;

import com.expense.domain.OverExpensePolicy;

public class DinnerOverExpensePolicy implements OverExpensePolicy {
    @Override
    public boolean isOverLimit(int amount) {
        return amount > 5000;
    }
}
