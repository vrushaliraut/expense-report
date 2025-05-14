# 🧾 Expense Reporting System

A cleanly architected Java application that generates detailed expense reports using a 
domain-driven, testable, and extensible approach.

---

## 🧱 Architecture Overview

```
src/
├── domain/             → Pure business models and logic
│   ├── Expense.java
│   ├── ExpenseCategory.java
│   ├── ExpenseType.java (interface)
│   └── type/           → Individual types like Dinner, Breakfast, etc.
│
├── application/        → Coordination logic and orchestration
│   └── ExpenseReportService.java
│
└── presentation/       → UI layer (console, formatter)
    ├── ConsoleExpenseReportPrinter.java
    └── ExpenseFormatter.java
```

---

## ✅ Features

* Supports custom expense types (`Dinner`, `Breakfast`, `Car Rental`)
* Tracks total and meal-only expenses
* Marks meals exceeding threshold (e.g., `"X"` for over-expense)
* Easily extensible using the **Strategy Pattern**
* Designed using **SOLID principles** and **Layered Architecture**
* 100% testable via JUnit

---

## 🧪 Test the Project

### Run unit tests using JUnit 5:

```bash
./gradlew test
```

### Example test covered:

* `ExpenseReportServiceTest` for overall report logic
* `DinnerExpenseTypeTest`, `BreakfastExpenseTypeTest`, etc. for per-type logic

---

## 🚀 Run the Application

### Sample CLI Runner

You can run the main class:

#### 📁 `Main.java`

```java
public class Main {
    public static void main(String[] args) {
        List<Expense> expenses = List.of(
            new Expense(new DinnerExpenseType(), 6000),
            new Expense(new BreakfastExpenseType(), 700),
            new Expense(new CarRentalExpenseType(), 1500)
        );

        ExpenseFormatter formatter = new ExpenseFormatter();
        ExpenseReportService service = new ExpenseReportService(formatter);
        ConsoleExpenseReportPrinter printer = new ConsoleExpenseReportPrinter(service);

        printer.print(expenses);
    }
}
```

### Output:

```
Expenses Report
Dinner    	6000	X
Breakfast 	700  	 
Car Rental	1500 	 
Meal expenses: 6700
Total expenses: 8200
```

---

## ✨ How to Add a New Expense Type

1. **Create a new class** in `domain.type`, e.g. `LunchExpenseType`
2. Implement `ExpenseType` interface:

```java
public class LunchExpenseType implements ExpenseType {
    public String getName() { return "Lunch"; }
    public ExpenseCategory getCategory() { return ExpenseCategory.MEAL; }
    public boolean isOverLimit(int amount) { return amount > 4000; }
}
```

3. Use it:

```java
new Expense(new LunchExpenseType(), 4500);
```

---

## 📦 Dependencies

* Java 17+
* JUnit 5
* Gradle

---

## 👨‍💻 Author

Crafted with ❤️ by [Vrushali]
