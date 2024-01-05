package plain.adapter.intro;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter car model: ");
        String model = scanner.nextLine();
        int age = scanner.nextInt();
        CarPriceCalculator car = new CarPriceCalculator(model, age);
        printVehiclePrice(car);

        TruckPriceCalculator truck = new TruckPriceCalculator(6, 2500);
        printVehiclePrice(truck);
    }
    public static void printVehiclePrice(PriceCalculator priceCalculator){
        String price = priceCalculator.calculatePrice();
        System.out.println("The price is " + price);
    }
}
