package com.expense;

import com.expense.application.ExpenseReportService;
import com.expense.domain.Expense;
import com.expense.domain.type.BreakfastExpenseType;
import com.expense.domain.type.CarRentalExpenseType;
import com.expense.domain.type.DinnerExpenseType;
import com.expense.presentation.ConsoleExpenseReportPrinter;
import com.expense.presentation.ExpenseFormatter;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        Expense dinnerExpense = new Expense(new DinnerExpenseType(), 6000);
        Expense breakfastExpense = new Expense(new BreakfastExpenseType(), 700);
        Expense carExpense = new Expense(new CarRentalExpenseType(), 1500);

        List<Expense> expenses = List.of(dinnerExpense, breakfastExpense, carExpense);

        ExpenseFormatter formatter = new ExpenseFormatter();
        ExpenseReportService service = new ExpenseReportService(formatter);
        ConsoleExpenseReportPrinter printer = new ConsoleExpenseReportPrinter(service);

        printer.print(expenses);
    }
}