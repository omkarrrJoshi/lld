### Scenario
Imagine you're developing a shopping cart application. Customers can add different types of products (electronics, clothing, furniture) to their cart. Each product category might have a specific tax calculation rule (e.g., electronics may have a flat sales tax, clothing might be tax-exempt, and furniture might have a weight-based tax).

### Task
Implement the Strategy Design Pattern to handle different tax calculations for various product categories.

### Requirements

- Define an interface TaxCalculator with a method calculateTax(double price).
- Implement concrete strategies for electronics tax, clothing tax, and furniture tax (you can simplify the tax calculations for this example).
- Design a ShoppingCart class that holds a list of products and can calculate the total cost including tax based on the product category. The shopping cart should allow setting a specific tax calculation strategy for each product category.

#### Bonus
Explain how you would extend this design to handle additional product categories with unique tax rules.

This scenario tests understanding of the Strategy Design Pattern components (interfaces, concrete strategies, and context) and ability to apply it to a real-world situation. It also encourages to discuss potential design choices and extensibility.