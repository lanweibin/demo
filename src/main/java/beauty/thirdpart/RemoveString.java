package beauty.thirdpart;

/**
 * 3.1字符串移位包含问题
 */
public class RemoveString {
    public static boolean removeString(String a, String b){
        StringBuilder sb = new StringBuilder();
        sb.append(a);
        sb.append(a);
        if (sb.toString().contains(b)){
            return true;
        }
        return false;
    }


    public static void main(String[] args) {
        String a = "aabcd";
        String  b = "cdaa";

        boolean s = removeString(a,b);

        System.out.println(s);
    }
}


