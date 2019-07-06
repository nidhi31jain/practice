import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class ArrayListToSet {
    public static void main(String[] args){
        ArrayList<String> strings = new ArrayList<>();
        strings.add("jjj");
        strings.add("aaa");
        strings.add("nnn");
        strings.add("mmm");
        strings.add("aaa");
        strings.add("ddd");
        strings.add("ccc");
        strings.add("aaa");
        strings.add("bbb");
        strings.add("aaa");

        System.out.println(strings);

        Set<String> mySet = new HashSet<>();

        Iterator iterator = strings.iterator();
        while(iterator.hasNext()){
            String str = (String)iterator.next();
            mySet.add(str);
        }
        System.out.println(mySet);

    }
}
