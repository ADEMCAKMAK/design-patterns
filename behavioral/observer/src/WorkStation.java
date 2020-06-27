public class WorkStation {

    public static void main(String[] args) {
        ObservableImpl observableImpl = new ObservableImpl();
        CurrentConditionsDisplay currentDisplay = new CurrentConditionsDisplay(observableImpl);
        StatisticsDisplay statisticsDisplay = new StatisticsDisplay(observableImpl);
        ForecastDisplay forecastDisplay = new ForecastDisplay(observableImpl);
        observableImpl.setData(80L);
        observableImpl.setData(82L);
        observableImpl.setData(78L);
    }

}
