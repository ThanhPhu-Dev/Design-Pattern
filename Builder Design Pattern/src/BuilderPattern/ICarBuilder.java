package BuilderPattern;

import BuilderPattern.CarParts.Engine;
import BuilderPattern.CarParts.SeatBelt;
import BuilderPattern.CarParts.Windscreen;

/**
 * Không bắt buộc phải có
 */
public interface ICarBuilder {
    CarBuilder Engine(Engine engine);
    CarBuilder SeatBelts(SeatBelt seatBelt);
    CarBuilder Wheels(int numberOfWheels);
    CarBuilder Windscreen(Windscreen windscreen);
    CarBuilder Paint(String color);
    Car Build();

}
