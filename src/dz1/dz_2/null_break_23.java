package dz1.dz_2;

public class null_break_23 {
    public static void main(String[] args) {
        String[] strings = new String[6];
        strings[0] = "first";
        strings[1] = "second";
        strings[2] = "third";
        strings[3] = "null";
        strings[4] = "fifth";
        strings[5] = "six";
        System.out.println(strings[0]);
        for (int i = 1; i < strings.length; i++) {
            if(i == 3)
                break;
            System.out.println(strings[i]);
        }
    }
}
