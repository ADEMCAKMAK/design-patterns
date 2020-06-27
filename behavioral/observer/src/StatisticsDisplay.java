public class StatisticsDisplay implements Observer, DisplayElement{

    private Long state;
    private Subject subject;

    public StatisticsDisplay(Subject subject) {
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
