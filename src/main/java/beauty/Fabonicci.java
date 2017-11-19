package beauty;

/**
 * 斐波那契函数
 */

public class Fabonicci {
    public static int Method(int n ){
        if(n == 0){
            return 0;
        }else if (n == 1){
            return 1;
        }else {
            return Method(n-1)+Method(n-2);
        }
    }

    public static int Method2(int n){
        if (n == 0){
            return 0;
        }else if (n <= 2){
            return 1;
        }
        int n1 = 1 , n2=1, sum = 0 ;
        for (int i = 0; i < n-2; i++) {
             sum = n1 + n2 ;
             n1 = n2 ;
            n2 = sum ;

        }
        return  sum;
    }


    public static void main(String[] args) {
        int n = 7;
        int x = Method(n);
        int y = Method2(n);

        System.out.println(x);
        System.out.println(y);
    }
}
