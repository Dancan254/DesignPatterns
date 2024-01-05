package plain.adapter.intro;

public class CarPriceCalculator implements PriceCalculator{
    private int age;
    private String model;
    public static int averagePrice = 6000;

    public CarPriceCalculator(String model, int age){
        this.model = model;
        this.age = age;
    }

    public int getRetailPrice(){
        return switch (model) {
            case "Ford" -> 3000;
            case "Audi" -> 5000;
            case "Benz" -> 7000;
            case "Tesla" -> 8000;
            default -> averagePrice;
        };
    }

    @Override
    public String calculatePrice() {
        return getRetailPrice() + "USD";
    }
}
