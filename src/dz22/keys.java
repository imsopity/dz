package dz22;

public class keys {
    public static void main(String[] args){
        int keysswitch = 0;
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

