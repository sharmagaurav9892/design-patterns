package facade;


/**
 *
 * Facade Design Pattern
 *
 * Intent:
 * Provide a simple interface to a complex subsystem.
 *
 * Think of it as a “front desk” — you don’t talk to each hotel department separately, you just call reception, and they coordinate everything for you.
 *
 * ⸻
 *
 * When to use
 * 	•	When a system has multiple steps/subsystems and you want to hide that complexity from the client.
 * 	•	To make code cleaner and reduce direct dependencies on multiple classes.
 *
 * ⸻
 *
 * Example – Home Theater System
 *
 * We have:
 * 	•	DVDPlayer
 * 	•	Projector
 * 	•	SoundSystem
 *
 * Without a facade, the client has to turn on each one, set modes, etc.
 *
 * With a facade, we give them HomeTheaterFacade with just one method: watchMovie().
 *
 *
 *
 */
// Subsystems
class DVDPlayer {
    public void on() { System.out.println("DVD Player On"); }
    public void play(String movie) { System.out.println("Playing " + movie); }
}

class Projector {
    public void on() { System.out.println("Projector On"); }
    public void setWideScreenMode() { System.out.println("Wide Screen Mode"); }
}

class SoundSystem {
    public void on() { System.out.println("Sound System On"); }
    public void setSurroundSound() { System.out.println("Surround Sound Set"); }
}

// Facade
class HomeTheaterFacade {
    private DVDPlayer dvd;
    private Projector projector;
    private SoundSystem sound;

    public HomeTheaterFacade(DVDPlayer dvd, Projector projector, SoundSystem sound) {
        this.dvd = dvd;
        this.projector = projector;
        this.sound = sound;
    }

    public void watchMovie(String movie) {
        System.out.println("Get ready to watch a movie...");
        dvd.on();
        projector.on();
        projector.setWideScreenMode();
        sound.on();
        sound.setSurroundSound();
        dvd.play(movie);
    }
}

// Client
public class Main {
    public static void main(String[] args) {
        DVDPlayer dvd = new DVDPlayer();
        Projector projector = new Projector();
        SoundSystem sound = new SoundSystem();

        HomeTheaterFacade homeTheater = new HomeTheaterFacade(dvd, projector, sound);
        homeTheater.watchMovie("Inception");
    }
}


/**
 *
 * Facade
 * 	•	decorator.Main job: Hide complexity of subsystems and give a simplified interface.
 * 	•	Logic inside: Mostly about sequence of calls and delegation.
 * 	•	Business logic: Minimal or none — the subsystems hold the real business rules.
 * 	•	Scope: Interface simplification.
 *
 * ⸻
 *
 * Orchestrator / Service Layer
 * 	•	decorator.Main job: Coordinate multiple components and implement business workflows.
 * 	•	Logic inside: Often contains real decision-making, validation, data transformations, and branching logic.
 * 	•	Business logic: A lot — may combine data from multiple systems and decide next steps.
 * 	•	Scope: Execution of complex workflows.
 *
 */