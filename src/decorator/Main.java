package decorator;

/**
 * Decorator Design Pattern
 *
 * Intent:
 * Add new functionality to an object dynamically (at runtime) without altering its structure or creating many subclasses.
 *
 * Think of it as wrapping an object in another object that adds extra behavior.
 *
 * ⸻
 *
 * When to use
 * 	•	When you want to add features on the fly.
 * 	•	When you want to avoid a large inheritance tree.
 * 	•	Common in Java I/O Streams (BufferedInputStream, DataInputStream, etc.).
 *
 * ⸻
 *
 * Example – decorator.Coffee Shop
 *
 * We have:
 * 	•	decorator.Coffee (basic interface).
 * 	•	decorator.SimpleCoffee (just black coffee).
 * 	•	Decorators like decorator.MilkDecorator, decorator.SugarDecorator add extra cost and description.
 *
 */


// Component
interface Coffee {
    String getDescription();
    double getCost();
}

// Concrete Component
class SimpleCoffee implements Coffee {
    public String getDescription() { return "Simple decorator.Coffee"; }
    public double getCost() { return 5.0; }
}

// Decorator
abstract class CoffeeDecorator implements Coffee {
    protected Coffee decoratedCoffee;

    public CoffeeDecorator(Coffee coffee) {
        this.decoratedCoffee = coffee;
    }

    public String getDescription() {
        return decoratedCoffee.getDescription();
    }

    public double getCost() {
        return decoratedCoffee.getCost();
    }
}

// Concrete Decorators
class MilkDecorator extends CoffeeDecorator {
    public MilkDecorator(Coffee coffee) { super(coffee); }
    public String getDescription() { return super.getDescription() + ", Milk"; }
    public double getCost() { return super.getCost() + 1.5; }
}

class SugarDecorator extends CoffeeDecorator {
    public SugarDecorator(Coffee coffee) { super(coffee); }
    public String getDescription() { return super.getDescription() + ", Sugar"; }
    public double getCost() { return super.getCost() + 0.5; }
}

// Client
public class Main {
    public static void main(String[] args) {
        Coffee coffee = new SimpleCoffee();
        coffee = new MilkDecorator(coffee);
        coffee = new SugarDecorator(coffee);

        System.out.println(coffee.getDescription()); // Simple decorator.Coffee, Milk, Sugar
        System.out.println(coffee.getCost());        // 7.0
    }
}


/**
 *
 * Advantages
 * 	•	Flexible — can add/remove features at runtime.
 * 	•	Avoids creating many subclasses.
 *
 * Disadvantages
 * 	•	Can result in many small classes if overused.
 * 	•	Debugging can be tricky due to multiple layers.
 *
 */

