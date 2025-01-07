public class WeatherStation extends Subject {
    private String forecast;

    public String GetForecast() {
        return forecast;
    }

    public void SetForecast(String forecast) {
        this.forecast = forecast;
        Notify(forecast); // Notify all observers
    }

}
