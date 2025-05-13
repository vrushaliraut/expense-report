package com.expense.domain.enums;

// Make ExpenseType an Enum with Metadata
public enum ExpenseType {
    DINNER("Dinner", ExpenseCategory.MEAL),
    BREAKFAST("Breakfast", ExpenseCategory.MEAL),
    CAR_RENTAL("Car Rental", ExpenseCategory.TRAVEL);

    private final String displayName;
    private final ExpenseCategory category;

    ExpenseType(String displayName, ExpenseCategory category) {
        this.displayName = displayName;
        this.category = category;
    }

    public String getDisplayName() {
        return displayName;
    }

    public ExpenseCategory getCategory() {
        return category;
    }
}
