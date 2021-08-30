package BuilderPattern.CarParts;

public class Engine {
    private String Name;

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public Engine(String name)
    {
        Name = name;
    }

    @Override
    public String toString() {
        return getName();
    }
}
