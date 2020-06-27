import java.util.ArrayList;
import java.util.List;

/**
 *  its contains all subscriber
 */
public class Publisher implements Subject {

    private List<Observer> observers;
    private Long state;

    public Publisher() {
        observers = new ArrayList<>();
    }

    public List<Observer> getObservers() {
        return observers;
    }

    public void setObservers(List<Observer> observers) {
        this.observers = observers;
    }

    public Long getState() {
        return state;
    }

    public void setState(Long state) {
        this.state = state;
    }

    public void dataChanged(){
        notifyObservers();
    }

    public void setData(Long state) {
        this.setState(state);
        dataChanged();
    }

    @Override
    public void registerObserver(Observer o) {
        observers.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        int index = observers.indexOf(o);
        if(index >= 0)
            observers.remove(index);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : observers)
            observer.update(state);
    }
}
