/*

1. Core Idea

Define a family of algorithms, encapsulate each one, and make them interchangeable at runtime.

Instead of writing if-else everywhere to choose an algorithm, you delegate the choice to the Strategy object.

⸻

2. Basic OOP Example (Java)

Problem

You have different payment methods — Credit Card, PayPal, UPI — and you want to switch payment method at runtime without changing the checkout code.
 */


package strategy;


// Strategy Interface
interface PaymentStrategy {
    void pay(int amount);
}

// Concrete Strategies
class CreditCardPayment implements PaymentStrategy {
    public void pay(int amount) {
        System.out.println("Paid " + amount + " using Credit Card");
    }
}

class PayPalPayment implements PaymentStrategy {
    public void pay(int amount) {
        System.out.println("Paid " + amount + " using PayPal");
    }
}

// Context
class PaymentContext {
    private PaymentStrategy strategy;
    public void setStrategy(PaymentStrategy strategy) {
        this.strategy = strategy;
    }
    public void pay(int amount) {
        strategy.pay(amount);
    }
}

// Client
public class StrategyPatternExample {
    public static void main(String[] args) {
        PaymentContext context = new PaymentContext();

        context.setStrategy(new CreditCardPayment());
        context.pay(100);

        context.setStrategy(new PayPalPayment());
        context.pay(200);
    }
}


/*

3. In System Design Terms

The Strategy Pattern is like pluggable execution logic.

Examples:
	•	Load Balancing — Different algorithms (Round Robin, Least Connections, IP Hash)
	•	Compression — GZIP, Snappy, LZ4 — change algorithm without changing the client
	•	Search Ranking — Multiple ranking algorithms for different markets
	•	Authentication — OAuth2, SAML, JWT — interchangeable login flows

⸻

Real-world Atlassian Example

Atlassian might use it for:
	•	Issue Search Sorting — Different sorting strategies for backlog view (by priority, due date, or assignee)
	•	Export Formats — Choosing PDF, CSV, or JSON export at runtime
	•	Notification Delivery — Email, Slack, SMS — switch dynamically

⸻

4. Distributed System Analogy

Imagine a microservice that processes images:
	•	Input service → chooses compression strategy (JPEG, PNG, WebP) based on request parameters or user preferences.
	•	You can change compression logic without touching the service’s main business logic.

⸻

5. Why Interviewers Like It
	•	It shows you can remove conditional complexity
	•	Demonstrates Open/Closed Principle from SOLID
	•	Easily maps to real-world cases like load balancers, auth flows, payment gateways


 */