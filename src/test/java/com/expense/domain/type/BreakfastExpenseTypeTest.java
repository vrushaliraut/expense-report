package com.expense.domain.type;

import com.expense.domain.enums.ExpenseCategory;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BreakfastExpenseTypeTest
{
    private final BreakfastExpenseType type = new BreakfastExpenseType();

    @Test
    void shouldHaveCorrectNameAndCategory() {
        assertEquals("Breakfast", type.getName());
        assertEquals(ExpenseCategory.MEAL, type.getCategory());
    }

    @Test
    void shouldDetectOverLimitIfAmountAbove1000() {
        assertTrue(type.isOverLimit(1500));
        assertFalse(type.isOverLimit(1000));
        assertFalse(type.isOverLimit(800));
    }

}