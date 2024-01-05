package plain.adapter.Exercise;

public class AsianCity implements City{
    private String name;
    private double temperature;
    private boolean hasWeatherWarning;

    public AsianCity(String name, double temperature){
        this.name= name;
        this.temperature = temperature;
    }
    @Override
    public String getName() {
        return name;
    }

    @Override
    public double getTemperature() {
        return temperature;
    }

    @Override
    public String getTemperatureScale() {
        return "Celsius";
    }

    @Override
    public boolean getHasWeatherWarning() {
        return hasWeatherWarning;
    }

    @Override
    public void setHasWeatherWarning(boolean hasWeatherWarning) {
        this.hasWeatherWarning = hasWeatherWarning;
    }

    public boolean isHasWeatherWarning() {
        return hasWeatherWarning;
    }
}
