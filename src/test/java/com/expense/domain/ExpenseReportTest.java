package com.expense.domain;

import com.expense.domain.type.BreakfastExpenseType;
import com.expense.domain.type.CarRentalExpenseType;
import com.expense.domain.type.DinnerExpenseType;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertTrue;

class ExpenseReportTest {

    @Test
    void shouldFormatExpensesWithOverLimitMarkersAndSummarizeTotals() {
        List<Expense> expenses = List.of(
                new Expense(new DinnerExpenseType(), 6000),
                new Expense(new BreakfastExpenseType(), 500),
                new Expense(new CarRentalExpenseType(), 2000)
        );

        ExpenseReport report = new ExpenseReport();
        String output = report.generateReport(expenses);

        assertTrue(output.contains("Dinner\t6000\tX"));
        assertTrue(output.contains("Breakfast\t500\t "));
        assertTrue(output.contains("Car Rental\t2000\t "));
        assertTrue(output.contains("Meal expenses: 6500"));
        assertTrue(output.contains("Total expenses: 8500"));
    }
}