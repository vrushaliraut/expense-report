| Problem                                                | Description                                                                                                                        |
| ------------------------------------------------------ | ---------------------------------------------------------------------------------------------------------------------------------- |
| **Violation of SRP (Single Responsibility Principle)** | The `printReport` method does *too many things* — formatting strings, calculating totals, filtering expenses, and printing output. |
| **Tight Coupling**                                     | `ExpenseReport` is tightly coupled to the output logic (`System.out.println`).                                                     |
| **Hard-coded business logic**                          | Meal expense thresholds (`5000`, `1000`) are hardcoded in `printReport`, making them non-reusable and hard to test.                |
| **Lack of extensibility**                              | Adding a new expense type requires editing the method directly — this violates the Open/Closed Principle.                          |
| **No Testability**                                     | The method is not testable due to side effects and no separation of concerns.                                                      |
