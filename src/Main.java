public class Main {
    public static void main(String[] args) {
        // Create the subject
        WeatherStation weatherStation = new WeatherStation();

        // Create observers (people)
        Person alice = new Person("Alice");
        Person bob = new Person("Bob");
        Person charlie = new Person("Charlie");

        // Attach observers to the subject
        weatherStation.Attach(alice);
        weatherStation.Attach(bob);
        weatherStation.Attach(charlie);

        // Update weather forecast
        weatherStation.SetForecast("Sunny with clear skies");
        weatherStation.SetForecast("Heavy rain expected tomorrow");
    }
}
