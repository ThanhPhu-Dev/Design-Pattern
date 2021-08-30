package BuilderPattern;

import BuilderPattern.CarParts.Engine;
import BuilderPattern.CarParts.SeatBelt;
import BuilderPattern.CarParts.Windscreen;

public class main {

    public static void main(String[] args) {
        Car car = Car.builder()
                     .Wheels(4)
                     .SeatBelts(new SeatBelt("Builder Seat Belt"))
                     .Windscreen(new Windscreen("Builder wind screen"))
                     .Engine(new Engine("Builder Foot"))
                     .Paint("red")
                     .Build();
        System.out.println(car.toString());
    }
}
