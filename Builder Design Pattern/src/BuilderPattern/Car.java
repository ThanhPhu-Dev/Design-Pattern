package BuilderPattern;

import BuilderPattern.CarParts.Engine;
import BuilderPattern.CarParts.SeatBelt;
import BuilderPattern.CarParts.Windscreen;

public class Car {

    private int NumberOfWheels;
    private SeatBelt SeatBelt;
    private String Color;
    private Windscreen Windscreen;
    private Engine Engine;

    public static CarBuilder builder(){
        return new CarBuilder();
    }
    public Car(int numberOfWheels, BuilderPattern.CarParts.SeatBelt seatBelt,
               String color, BuilderPattern.CarParts.Windscreen windscreen,
               BuilderPattern.CarParts.Engine engine) {
        NumberOfWheels = numberOfWheels;
        SeatBelt = seatBelt;
        Color = color;
        Windscreen = windscreen;
        Engine = engine;
    }

    public int getNumberOfWheels() {
        return NumberOfWheels;
    }

    public void setNumberOfWheels(int numberOfWheels) {
        NumberOfWheels = numberOfWheels;
    }

    public BuilderPattern.CarParts.SeatBelt getSeatBelt() {
        return SeatBelt;
    }

    public void setSeatBelt(SeatBelt seatBelt) {
        SeatBelt = seatBelt;
    }

    public String getColor() {
        return Color;
    }

    public void setColor(String color) {
        Color = color;
    }

    public Windscreen getWindscreen() {
        return Windscreen;
    }

    public void setWindscreen(Windscreen windscreen) {
        Windscreen = windscreen;
    }

    public Engine getEngine() {
        return Engine;
    }

    public void setEngine(Engine engine) {
        Engine = engine;
    }

    @Override
    public String toString() {
        return "Car{\n" +
                "\t NumberOfWheels=" + NumberOfWheels +
                ",\n\t SeatBelt=" + SeatBelt.toString() +
                ",\n\t Color=" + Color +
                ",\n\t Windscreen=" + Windscreen.toString() +
                ",\n\t Engine=" + Engine.toString() +
                "\n}";
    }
}
