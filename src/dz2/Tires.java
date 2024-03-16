package dz2;

public class Tires {
    private int radius;
//    private String season;
    private String name;

    @Override
    public String toString() {
        return "Tires{" +
                "radius=" + radius +
                ", name='" + name + '\'' +
                '}';
    }

    public Tires(int radius, String name){
        this.radius = radius;
//        this.season = season;
        this.name = name;
    }
}
