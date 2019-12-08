package map;

import com.google.common.collect.ArrayListMultimap;
import com.google.common.collect.Multimap;
import org.junit.Test;

import java.util.*;

public class MultimapDemo {
    @Test
    public void test(){
        Map<String, String> map = new HashMap<>();
        map.put("book1", "1111");
        map.put("book11111", "1111");
        map.put("book2", "2222");
        map.put("book3", "3333");

        Multimap<String, String> mm = ArrayListMultimap.create();

        Iterator<Map.Entry<String, String>> iter = map.entrySet().iterator();
        while(iter.hasNext()){
            Map.Entry<String, String> entry = iter.next();
            mm.put(entry.getValue(), entry.getKey());
        }

        Set<String> keys = mm.keySet();
        for(String key: keys){
            Collection<String> values = mm.get(key);
            System.out.println(key + " -> " + values);
        }
    }
}
