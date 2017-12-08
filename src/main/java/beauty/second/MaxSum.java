package beauty.second;

/**
 * 2.14 数组的子数组之和的最大值
 */
public class MaxSum {
    public static int maxSum(int[] arr){
        double maxnum = Double.NEGATIVE_INFINITY;
        int b = (int) maxnum;
        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                for (int k = i; k <= j; k++) {
                    sum += arr[k];

                }
                if(sum>b){
                    b = sum;
                }

            }

        }

        return b;
    }

    public static void main(String[] args) {
        int[] arr = {1,-2,3,5,-3,2};
        int result = maxSum(arr);

        System.out.println(result);
    }

}
