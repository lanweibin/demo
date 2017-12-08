package beauty.second;

/**
 * 2.17 数组循环位移
 */
public class RightShift {
    public  static int[] Right(int[] arr, int n){
        while(n-->0){
            int first = arr[arr.length-1];
            for (int i =arr.length-1 ; i >0; i--) {
                arr[i] = arr[i-1];

            }
            arr[0] = first;
        }

        return arr;
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6};
        int n = 2;
        int[] result = Right(arr,2);

        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] +",");

        }
    }
}
