package dz1.dz_3;

public class Orange {
    private int size;
    private String name;

    public Orange(int size, String name) {
        this.size = size;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Orange{" +
                "size=" + size +
                ", name='" + name + '\'' +
                '}';
    }
}
