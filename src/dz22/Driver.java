package dz22;

public class Driver {
    public static void main (String[] args) {
        driving_experience driver = new driving_experience();
        driver.driexp = 2;
        driver.category = "B";
        System.out.println("Стаж вождения: " +driver.driexp);
        System.out.println("Категория вождения: " +driver.category);

        int keysswitch = 0;
        // 0 - ключи от bmw e34
        // 1 - ключи от ford sierra
        // 2 - ключи от bmw e36
        switch (keysswitch) {
            case 0:
                System.out.println("Выбраны ключи от bmw e34");
                break;
            case 1:
                System.out.println("Выбраны ключи от ford sierra");
                break;
            case 2:
                System.out.println("Выбраны ключи от bmw e34");
            default:
                System.out.println("Выбраны неверные ключи");
    }
    }
}
