package com.expense.domain.type;

import com.expense.domain.enums.ExpenseCategory;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CarRentalExpenseTypeTest {

    private final CarRentalExpenseType type = new CarRentalExpenseType();

    @Test
    void shouldHaveCorrectNameAndCategory() {
        assertEquals("Car Rental", type.getName());
        assertEquals(ExpenseCategory.TRAVEL, type.getCategory());
    }

    @Test
    void shouldNeverBeOverLimit() {
        assertFalse(type.isOverLimit(0));
        assertFalse(type.isOverLimit(1000));
        assertFalse(type.isOverLimit(999999));
    }

}