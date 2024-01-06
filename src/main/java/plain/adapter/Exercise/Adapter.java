package plain.adapter.Exercise;

public class Adapter implements City{

    City city;

    public Adapter(AsianCity city){
        this.city = city;
    }

    @Override
    public String getName() {
        return city.getName();
    }

    public double getTemperature(){
        double temperature = city.getTemperature();
        return temperature * 1.8 + 32;
   }
   public String getTemperatureScale(){
        return "fahrenheit";
   }

    @Override
    public boolean getHasWeatherWarning() {
        return city.getHasWeatherWarning();
    }

    @Override
    public void setHasWeatherWarning(boolean hasWeatherWarning) {
        city.setHasWeatherWarning(hasWeatherWarning);
    }
}
