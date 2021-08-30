package BuilderPattern.CarParts;

public class Windscreen {

    private String Name;

    public Windscreen(String name) {
        Name = name;
    }


    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    @Override
    public String toString() {
        return getName();
    }
}
