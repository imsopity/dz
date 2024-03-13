package dz1.dz_3;

public class Object1 {
    public static void main(String[] args) {
        Object[] objects={new Apple(1,"Red_Prince"),new Orange(3,"Hamlin")};
        for (int i = 0; i < objects.length; i++) {
            System.out.println(objects[i]);
        }
//        Apple av = new Apple(1, "AV");
    }

}
