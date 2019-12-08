package functional.compose;

import com.google.common.base.Function;
import com.google.common.base.Functions;
import com.google.common.collect.Collections2;
import com.google.common.collect.Lists;
import org.junit.Test;

import javax.annotation.Nullable;
import java.util.Collection;
import java.util.List;

public class ComposeDemo {
    @Test
    public void test(){
        List<String> list = Lists.newArrayList("aaaaaaaa","bbbb", "cc");
        Function<String, String> f1 = new Function<String, String>(){
            @Override
            public String apply(@Nullable String s) {
                return s.length() > 4? s.substring(0,4) : s;
            }
        };
        Function<String, String> f2 = new Function<String, String>(){
            @Override
            public String apply(@Nullable String s) {
                return s.toUpperCase();
            }
        };

        Function<String, String> f = Functions.compose(f1, f2);
        Collection<String> result = Collections2.transform(list, f);

        result.forEach(System.out::println);

    }
}
