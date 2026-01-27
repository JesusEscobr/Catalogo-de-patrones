import java.util.ArrayList;
import java.util.List;

interface Observer {
    void update(String message);
}

class User implements Observer {
    private String name;

    public User(String name) {
        this.name = name;
    }

    public void update(String message) {
        System.out.println(name + " recibió: " + message);
    }
}

class Channel {
    private List<Observer> observers = new ArrayList<>();

    public void subscribe(Observer observer) {
        observers.add(observer);
    }

    public void unsubscribe(Observer observer) {
        observers.remove(observer);
    }

    public void notifyObservers(String message) {
        for (Observer observer : observers) {
            observer.update(message);
        }
    }
}

public class ObserverPattern {
    public static void main(String[] args) {
        Channel channel = new Channel();

        User user1 = new User("Ana");
        User user2 = new User("Luis");

        channel.subscribe(user1);
        channel.subscribe(user2);

        channel.notifyObservers("Nuevo video disponible");
    }
}
