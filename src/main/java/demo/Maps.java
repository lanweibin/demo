package demo;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;

public class Maps {
    public static void main(String[] args) {
        HashMap<Integer,Integer> map = new HashMap<Integer, Integer>();
        map.put(1,1);
        map.put(2,2);
        map.put(3,3);

        Map<Integer, Integer>  ht = new Hashtable<Integer, Integer>();
        ht.put(1,1);
        ht.put(2,2);

//        traversal1(map);
        traversal2(ht);

    }

    private static void traversal2(Map<Integer, Integer> ht) {
        for (Map.Entry<Integer, Integer> re : ht.entrySet() ){
            System.out.println(re.getKey() + "----------"+ re.getValue());
        }
    }

    private static void traversal1(HashMap<Integer, Integer> map) {

        for (Map.Entry<Integer, Integer> re : map.entrySet()){
            System.out.println(re.getKey() + "-----" + re.getValue());
        }

    }


}
