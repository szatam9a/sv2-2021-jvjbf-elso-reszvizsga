package cars;

public class Car {
    private String brand;
    private double motorsize;
    private Color color;
    private int price;

    public Car(String brand, double motorsize, Color color, int price) {
        this.brand = brand;
        this.motorsize = motorsize;
        this.color = color;
        this.price = price;
    }

    public void decreasePrice(int percent){
        price = (int)(price* ((100.0-percent)/100));
    }

    public String getBrand() {
        return brand;
    }

    public double getMotorsize() {
        return motorsize;
    }

    public Color getColor() {
        return color;
    }

    public int getPrice() {
        return price;
    }
}
