package observer;

import java.util.ArrayList;
import java.util.List;

// Observer Interface
interface Observer {
    void update(String news);
}

// Subject Interface
interface Subject {
    void registerObserver(Observer observer);
    void removeObserver(Observer observer);
    void notifyObservers();
}

// Concrete Subject
class NewsAgency implements Subject {
    private List<Observer> observers = new ArrayList<>();
    private String news;

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(news);
        }
    }

    public void setNews(String news) {
        this.news = news;
        notifyObservers();
    }
}

// Concrete Observers
class NewsChannel implements Observer {
    private String channelName;

    public NewsChannel(String channelName) {
        this.channelName = channelName;
    }

    @Override
    public void update(String news) {
        System.out.println(channelName + " received news: " + news);
    }
}

// Test
public class ObserverPatternDemo {
    public static void main(String[] args) throws InterruptedException {
        NewsAgency agency = new NewsAgency();

        Observer channel1 = new NewsChannel("Aaj Tak");
        Observer channel2 = new NewsChannel("DD News");

        agency.registerObserver(channel1);
        agency.registerObserver(channel2);

        Thread.sleep(2000);
        agency.setNews("New Java version released!");

        Thread.sleep(2000);
        agency.setNews("Stock market hits record high!");

        Thread.sleep(2000);
        agency.setNews("Heavy Rain Alert in Jaipur!");


    }
}