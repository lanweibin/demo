package demo;

public class Continute {
    public static int c(int[] nums){
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            if (i == 2){
                continue;
            }

            sum += nums[i];

        }

        return sum;
    }

    public static int b(int[] nums){
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            if (i == 2){
                break;
            }

            sum += nums[i];

        }

        return sum;
    }


    public static void main(String[] args) {
        int[] num = {1,2,3,4,5};
        int c = c(num);
        int b = b(num);

        System.out.println(c);
        System.out.println(b);
    }
}
