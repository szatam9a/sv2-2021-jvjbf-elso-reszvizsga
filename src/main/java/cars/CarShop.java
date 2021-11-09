package cars;



import java.util.ArrayList;
import java.util.List;

public class CarShop {
    private String shopName;
    private int highestPriceInTheShop;
    private List<Car> cars = new ArrayList<>();

    public CarShop(String shopName, int highestPriceInTheShop) {
        this.shopName = shopName;
        this.highestPriceInTheShop = highestPriceInTheShop;
    }
    
    
    
    public boolean addCar(Car car) {
        if (car.getPrice() < highestPriceInTheShop) {
            cars.add(car);
            return true;
        }
        return false;
    }

    public int sumCarPrice() {
        int sumCars = 0;
        for (Car actualCar : cars
        ) {
            sumCars += actualCar.getPrice();
        }
        return sumCars;
    }

    public int numberOfCarsCheaperThan(int price) {
        int counter = 0;
        for (Car actualCar : cars
        ) {
            if (actualCar.getPrice() < price) {
                counter++;
            }

        }
        return counter;
    }

    public List<Car> carsWithBrand(String brand) {
        List<Car> resultOfTheSearch = new ArrayList<>();
        for (Car actualCar : cars
        ) {
            if (actualCar.getBrand().equals(brand)) {
                resultOfTheSearch.add(actualCar);
            }
        }
        return resultOfTheSearch;
    }

    public String getShopName() {
        return shopName;
    }

    public int getHighestPriceInTheShop() {
        return highestPriceInTheShop;
    }

    public List<Car> getCars() {
        return cars;
    }

    public List<Car> getCarsForSell() {
        return cars;
    }
}
