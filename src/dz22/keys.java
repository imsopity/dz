package dz22;

import java.util.Scanner;

public class keys {
    public static void main(String[] args){
        Scanner bscan = new Scanner(System.in);
        System.out.print("Выберите ключи: ");
        int keysswitch = bscan.nextInt();
        // 0 - ключи от bmw e34
        // 1 - ключи от ford sierra
        // 2 - ключи от bmw e36
        if (keysswitch == 0) {
            System.out.println("Выбраны ключи от bmw e34");
        } else if (keysswitch == 1) {
            System.out.println("Выбраны ключи от ford sierra");
        } else if (keysswitch == 2) {
            System.out.println("Выбраны ключи от bmw e36");
        } else {
            System.out.println("Выбраны неверные ключи");
        }
    }
}

