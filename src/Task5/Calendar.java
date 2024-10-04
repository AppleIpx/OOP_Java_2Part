package Task5;
import java.util.ArrayList;
import java.util.List;


class Calendar implements Subject {
    private List<Observer> observers = new ArrayList<>();

    @Override
    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers(String eventDetails) {
        for (Observer observer : observers) {
            observer.update(eventDetails);
        }
    }

    public void addEvent(String eventDetails) {
        System.out.println("Добавлено новое событие: " + eventDetails);
        notifyObservers(eventDetails);
    }
}
