public class WorkStation {

    public static void main(String[] args) {
        Publisher publisher = new Publisher();
        CurrentConditionsDisplay currentDisplay = new CurrentConditionsDisplay(publisher);
        StatisticsDisplay statisticsDisplay = new StatisticsDisplay(publisher);
        ForecastDisplay forecastDisplay = new ForecastDisplay(publisher);
        publisher.setData(80L);
        publisher.setData(82L);
        publisher.setData(78L);
    }

}
