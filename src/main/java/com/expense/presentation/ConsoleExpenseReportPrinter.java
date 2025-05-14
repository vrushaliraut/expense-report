package com.expense.presentation;

import com.expense.application.ExpenseReportService;
import com.expense.domain.Expense;

import java.util.List;

public class ConsoleExpenseReportPrinter {
    private final ExpenseReportService service;

    public ConsoleExpenseReportPrinter(ExpenseReportService service){
        this.service = service;
    }

    public void print(List<Expense> expenses){
        String report = service.generateReport(expenses);
        System.out.println(report);
    }
}
