package chain_of_responsibility;

// Step 1: Handler interface
abstract class SupportHandler {
    protected SupportHandler nextHandler;

    public void setNextHandler(SupportHandler nextHandler) {
        this.nextHandler = nextHandler;
    }

    public abstract void handleRequest(String issue);
}

// Step 2: Concrete Handlers
class Level1Support extends SupportHandler {
    public void handleRequest(String issue) {
        if (issue.equals("password reset")) {
            System.out.println("Level 1 solved: " + issue);
        } else if (nextHandler != null) {
            nextHandler.handleRequest(issue);
        }
    }
}

class Level2Support extends SupportHandler {
    public void handleRequest(String issue) {
        if (issue.equals("software bug")) {
            System.out.println("Level 2 solved: " + issue);
        } else if (nextHandler != null) {
            nextHandler.handleRequest(issue);
        }
    }
}

class Level3Support extends SupportHandler {
    public void handleRequest(String issue) {
        System.out.println("Level 3 handling: " + issue);
    }
}

// Step 3: Client
public class Main {
    public static void main(String[] args) {
        SupportHandler l1 = new Level1Support();
        SupportHandler l2 = new Level2Support();
        SupportHandler l3 = new Level3Support();

        l1.setNextHandler(l2);
        l2.setNextHandler(l3);

        l1.handleRequest("password reset"); // handled by Level 1
        l1.handleRequest("software bug");   // handled by Level 2
        l1.handleRequest("server crash");   // handled by Level 3
    }
}
