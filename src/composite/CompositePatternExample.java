/*
The Composite Design Pattern is a structural design pattern that lets you treat individual objects and groups of objects (compositions) in the same way.

It’s most often used to represent hierarchical tree structures — for example, file systems, menus, UI components, etc.

⸻

Key Idea
	•	You have leaves (simple objects) and composites (objects that contain other objects).
	•	Both implement the same interface, so the client doesn’t need to know whether it’s dealing with a leaf or a composite.

 */







package composite;

import java.util.ArrayList;
import java.util.List;






// Component
interface FileSystemItem {
    void showDetails();
}

// Leaf
class File implements FileSystemItem {
    private String name;

    File(String name) {
        this.name = name;
    }

    @Override
    public void showDetails() {
        System.out.println("File: " + name);
    }
}

// Composite
class Folder implements FileSystemItem {
    private String name;
    private List<FileSystemItem> items = new ArrayList<>();

    Folder(String name) {
        this.name = name;
    }

    public void add(FileSystemItem item) {
        items.add(item);
    }

    public void remove(FileSystemItem item) {
        items.remove(item);
    }

    @Override
    public void showDetails() {
        System.out.println("Folder: " + name);
        for (FileSystemItem item : items) {
            item.showDetails();
        }
    }
}

// Client
public class CompositePatternExample {
    public static void main(String[] args) {
        File file1 = new File("Resume.pdf");
        File file2 = new File("Photo.jpg");

        Folder personalFolder = new Folder("Personal");
        personalFolder.add(file1);
        personalFolder.add(file2);

        Folder rootFolder = new Folder("Root");
        rootFolder.add(personalFolder);
        rootFolder.add(new File("System.log"));

        rootFolder.showDetails();
    }
}


/*
Real-life Examples
	•	File explorer (folders and files)
	•	HTML DOM (tags within tags)
	•	Company hierarchy (managers and employees)
	•	GUI frameworks (containers and components)
 */