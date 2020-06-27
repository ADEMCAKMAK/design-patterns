/**
 *  its contain your own publisher
 */
public class ForecastDisplay implements Observer, DisplayElement {

    private Long state;
    private Subject subject;

    public ForecastDisplay(Subject subject) {
        this.subject = subject;
        subject.registerObserver(this);
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
