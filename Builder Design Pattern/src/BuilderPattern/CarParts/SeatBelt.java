package BuilderPattern.CarParts;

public class SeatBelt {

    private String Brand;

    public SeatBelt(String brand)
    {
        Brand = brand;
    }


    public String getBrand() {
        return Brand;
    }

    public void setBrand(String brand) {
        Brand = brand;
    }

    @Override
    public String toString() {
        return getBrand();
    }
}
