package dz2;

public class Engine {
    private int volume;
    private String fuel;
    private String name;

    public Engine (int volume, String fuel, String name){
        this.volume = volume;
        this.fuel = fuel;
        this.name = name;
    }

//    public abstract void CarEngine(int volume, String fuel, String name);

    @Override
    public String toString() {
        return "Engine{" +
                "volume=" + volume +
                ", fuel='" + fuel + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
