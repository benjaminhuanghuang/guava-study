package set;

import com.google.common.collect.Sets;
import com.google.common.collect.Sets.SetView;
import org.junit.Test;

import java.util.Set;

public class SetDemo {
    @Test
    public void test(){
        Set<Integer> set1 = Sets.newHashSet(1,2,3);
        Set<Integer> set2 = Sets.newHashSet(3,5,4);

        SetView<Integer> s = Sets.intersection(set1, set2);
        s.forEach(System.out::println);

        s = Sets.difference(set1, set2);
        s.forEach(System.out::println);

        s = Sets.union(set1, set2);
        s.forEach(System.out::println);
    }
}
