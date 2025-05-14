package com.expense.domain.type;

import com.expense.domain.enums.ExpenseCategory;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DinnerExpenseTypeTest {
    private final DinnerExpenseType type = new DinnerExpenseType();

    @Test
    void shouldHaveCorrectNameAndCategory() {
        assertEquals("Dinner", type.getName());
        assertEquals(ExpenseCategory.MEAL, type.getCategory());
    }

    @Test
    void shouldDetectOverLimitIfAmountAbove5000() {
        assertTrue(type.isOverLimit(6000));
        assertFalse(type.isOverLimit(5000));
        assertFalse(type.isOverLimit(4000));
    }
}