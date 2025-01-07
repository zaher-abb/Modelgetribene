import java.util.ArrayList;
import java.util.List;

public abstract class Subject {
    private List<Observer> observers = new ArrayList<>();

    public void Attach(Observer o) {
        observers.add(o);
    }

    public void Detach(Observer o) {
        observers.remove(o);
    }

    public void Notify(String forecast) {
        for (Observer observer : observers) {
            observer.Update(forecast);
        }
    }
}
