package com.expense.domain;

import com.expense.domain.enums.ExpenseType;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertTrue;

class ExpenseReportTest {

    @Test
    void shouldPrintMealAndTotalExpenses(){
        Expense dinnerExpense = new Expense(ExpenseType.DINNER, 6000);
        Expense breakfastExpense = new Expense(ExpenseType.BREAKFAST, 500);
        Expense carRentalExpense = new Expense(ExpenseType.CAR_RENTAL, 2000);
        List<Expense> expenses = List.of(dinnerExpense, breakfastExpense, carRentalExpense);

        ExpenseReport report = new ExpenseReport();

        String generatedReport = report.generateReport(expenses);
        System.out.println(generatedReport);
        assertTrue(generatedReport.contains("Dinner\t6000\tX"));
        assertTrue(generatedReport.contains("Breakfast\t500\t "));
        assertTrue(generatedReport.contains("Car Rental\t2000\t "));
        assertTrue(generatedReport.contains("Meal expenses: 6500"));
        assertTrue(generatedReport.contains("Total expenses: 8500"));
    }
}