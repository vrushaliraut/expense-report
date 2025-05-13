package com.expense.domain.policy;

import com.expense.domain.OverExpensePolicy;

public class NoOverExpensePolicy implements OverExpensePolicy {
    @Override
    public boolean isOverLimit(int amount) {
        return false;
    }
}
