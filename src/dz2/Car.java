package dz2;

import java.util.Scanner;

public class Car {
    public static void main(String[] args){
        Object[] objects = {new Engine(4400,"AИ-92","М62B44")};
        for (int i = 0; i < objects.length; i++) {
            System.out.println(objects[i]);
        }
        Object[] cartiers = {new Tires(17,"Belshina")};
        for (int i = 0; i < cartiers.length; i++) {
            System.out.println(cartiers[i]);
            ISeasonTires tires = ISeasonTires.SUMMER;
            System.out.println("Сезон покрышек: " +tires);
        }
        Object[] carinfo = {new CarInfo(17,"B")};
        for (int i = 0; i < carinfo.length; i++) {
            System.out.println(carinfo[i]);
        }
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите ключ: ");
        int key = scanner.nextInt();
        if (key == 123) {
            System.out.println("Машина открыта");
        }
        else if (key != 123) {
            System.out.println("Неверный ключ");
        }

    }
}
