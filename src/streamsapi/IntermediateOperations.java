package streamsapi;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class IntermediateOperations {
    public static void main(String[] args) {
        String[] names = {"Ana", "Cave", "Chime","Victor"};
        List<String> nameList = new ArrayList<>(Arrays.asList(names));

        //filter
        nameList.stream().filter(s->s.startsWith("C")).forEach(s-> System.out.println(s));

        //map
        nameList.stream().map(s->s+"student").forEach(s-> System.out.println(s));

        //flatMap
        String[][] names2d = {names,names};
        String[] names1d = Stream.of(names2d).flatMap(arr->Stream.of(arr)).toArray(size->new String[size]);
        for(String name:names1d){
            System.out.println("1d array: " + name);
        }

        //peek
        //you dont have to do for loop to iterate and print
        String[] names1dPeek = Stream.of(names2d).flatMap(arr->Stream.of(arr))
                .peek(s-> System.out.println("1dPeek: "+s))
                .toArray(size->new String[size]);

        //skip
        //here 1st element is iskipped
        Arrays.stream(names1d).skip(1).forEach(s-> System.out.println("skip: " + s));

        //limit
        Arrays.stream(names1d).limit(1).forEach(s-> System.out.println("limit: " + s));

        //skip list combination
        Arrays.stream(names1d).skip(3).limit(8).forEach(s-> System.out.println("skip limit: " + s));

        //distinct
        long numDistinctVal = Arrays.stream(names1d).distinct().count();
        System.out.println("distinct values: " + numDistinctVal );

        //sorted
        Arrays.stream(names1d).sorted().forEach(s-> System.out.println("sorted: " + s));

    }
}
