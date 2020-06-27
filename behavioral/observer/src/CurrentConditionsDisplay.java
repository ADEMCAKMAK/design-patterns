public class CurrentConditionsDisplay implements Observer, DisplayElement{

    private Long state;
    private Observable observable;

    public CurrentConditionsDisplay(Observable observable) {
        this.observable = observable;
        observable.registerObserver(this);
    }

    @Override
    public void display() {
        System.out.println(this.getClass().getSimpleName() +
                " Current conditions state: " + state);
    }

    @Override
    public void update(Long state) {
        this.state = state;
        display();
    }
}
