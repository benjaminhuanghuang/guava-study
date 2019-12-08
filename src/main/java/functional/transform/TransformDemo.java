package functional.transform;

import com.google.common.collect.Collections2;
import com.google.common.collect.Sets;
import org.junit.Test;

import java.text.SimpleDateFormat;
import java.util.Collection;
import java.util.Set;

public class TransformDemo {
    @Test
    public void test() {
        Set<Long> timeSet = Sets.newHashSet(20190102L, 20190103L);
        Collection<String> result = Collections2.transform(timeSet, (e) -> new SimpleDateFormat("yyyy-MM-dd").format(e));
        result.forEach(System.out::println);
    }
}
