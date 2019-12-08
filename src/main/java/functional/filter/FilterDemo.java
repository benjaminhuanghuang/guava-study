package functional.filter;

import com.google.common.collect.Collections2;
import com.google.common.collect.Lists;
import org.junit.Test;

import java.util.Collection;
import java.util.List;

public class FilterDemo {
    @Test
    public void test() {
        List<String> list = Lists.newArrayList("aa", "ab", "c");

        Collection<String> result = Collections2.filter(list, (e) -> e.startsWith("a"));

        result.forEach(System.out::println);
    }
}
