package plain.adapter.Exercise;

public class Main {
    public static void main(String[] args) {
        NorthAmericanCity america = new NorthAmericanCity("America", 45);
        AsianCity Thailand = new AsianCity("Thailand", 50);
        NorthAmericanCity toronto = new NorthAmericanCity("Toronto", 45);
        AsianCity bankok = new AsianCity("bankok", 50);
        WeatherWarnings weatherWarnings = new WeatherWarnings();
        weatherWarnings.postWarning(america);
        weatherWarnings.postWarning(Thailand);
        weatherWarnings.postWarning(toronto);
        weatherWarnings.postWarning(bankok);
    }
}
