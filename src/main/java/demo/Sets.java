package demo;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class Sets {
    public static void main(String[] args) {
        Set set = new HashSet();
        TreeSet treeSet = new TreeSet();
        set.add(1);
        set.add(2);
        set.add(3);


        treeSet.add(1);
        treeSet.add(2);
        treeSet.add(3);



//        traversal1(set);
//        traversal2(set);
        traversa(treeSet);

    }

    private static void traversa(TreeSet treeSet) {
        for (Object re : treeSet){
            System.out.println(re);
        }
    }

    private static void traversal2(Set set) {
        Iterator it = set.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }
    }

    private static void traversal1(Set set) {
        for (Object re : set){
            System.out.println(re);
        }
    }
}
