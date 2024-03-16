package dz2;

public class CarInfo {
    private int place;
    private String category;

    @Override
    public String toString() {
        return "CarInfo{" +
                "place=" + place +
                ", category='" + category + '\'' +
                '}';
    }

    public CarInfo(int place, String category){
        this.place = place;
        this.category = category;
    }
}
