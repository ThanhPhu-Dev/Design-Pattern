package BuilderPattern;

import BuilderPattern.CarParts.Engine;
import BuilderPattern.CarParts.SeatBelt;
import BuilderPattern.CarParts.Windscreen;

public class CarBuilder implements ICarBuilder{
    private Engine _engine;
    private SeatBelt _seatBelt;
    private int _wheels;
    private Windscreen _windscreen;
    private String _color;

    @Override
    public CarBuilder Engine(Engine engine) {
        _engine = engine;
        return this;
    }

    @Override
    public CarBuilder SeatBelts(SeatBelt seatBelt) {
        _seatBelt = seatBelt;
        return this;
    }

    @Override
    public CarBuilder Wheels(int numberOfWheels) {
        _wheels = numberOfWheels;
        return this;
    }

    @Override
    public CarBuilder Windscreen(Windscreen windscreen) {
        _windscreen = windscreen;
        return this;
    }

    @Override
    public CarBuilder Paint(String color) {
        _color = color;
        return this;
    }

    @Override
    public Car Build() {
        return new Car(_wheels, _seatBelt, _color, _windscreen, _engine);
    }
}
