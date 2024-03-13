package dz1.dz_2;

public class every_two_22 {
    public static void main(String[] args) {
        int[] nums = new int[6];
        nums[0] = 1;
        nums[1] = 2;
        nums[2] = 3;
        nums[3] = 4;
        nums[4] = 5;
        nums[5] = 6;
        int len = nums.length;
        for (int i=1;i<len;i=i+2){
            System.out.println("Каждый второй элемент массива: "+nums[i]);
        }
    }
}
