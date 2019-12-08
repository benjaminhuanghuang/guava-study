package collection.readonly;

import com.google.common.collect.ImmutableList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ReadonlyListDemo {
    public static void main(String[] args) {

    }


    public void FixLengthDemo(){
        List<String> list = Arrays.asList("a", "b", "c");   // create fixed length list
        list.add("d");    // error
    }

    public void ReadonlyDemo1(){
        List<String> list = new ArrayList<>();

        list.add("a");
        list.add("b");
        list.add("c");

        List<String> readList = Collections.unmodifiableList(list);
        readList.add("d");    // error
    }


    public void GuavaImmutableList(){
        ImmutableList<String> iList = ImmutableList.of("a", "b", "c");
        iList.add("error"); // Error
    }
}
