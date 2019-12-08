package set;

import com.google.common.collect.HashMultiset;
import org.junit.Test;

import java.util.Set;

public class MultisetDemo {
    @Test
    public void test(){

        String s = "11 22 33 33 33";
        String[] ss = s.split(" ");
        HashMultiset<String> set = HashMultiset.create();
        for(String str:ss){
            set.add(str);
        }
        Set<String> set2 = set.elementSet();
        for(String str:set2){
            System.out.println(str + " : "+ set.count(str));
        }
    }
}
