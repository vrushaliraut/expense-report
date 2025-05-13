package com.expense.domain;

public interface OverExpensePolicy {
    boolean isOverLimit(int amount);
}
