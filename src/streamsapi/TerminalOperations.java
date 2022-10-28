package streamsapi;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TerminalOperations {
    public static void main(String[] args) {

        int[] ints = {1,2,3,4,5};
        int total = Arrays.stream(ints).reduce(0, (x,y)->x+y);
        System.out.println(total);

        String[] names = {"Ana", "Cave", "Chime","Victor",""};
        List<String> nameList = new ArrayList<>(Arrays.asList(names));

        //create stream based on array
//        Stream<String> arrayStream = Arrays.stream(names).forEach(name-> System.out.println(name));
        Arrays.stream(names).forEach(name-> System.out.println(name));
        Optional<String> resultMin = Arrays.stream(names).min((a, b)->a.compareTo(b));
        System.out.println(resultMin);


        //craete stream based on collection
        Stream<String> listStream = nameList.stream();
        boolean resultListStream = nameList.stream().allMatch(name->!name.isEmpty());
        boolean resListStream = nameList.stream().noneMatch(name->name.equals("Victor"));
        boolean allMatchStream = nameList.stream().allMatch(name->name.startsWith("C"));


        System.out.println("all none empty:" + resultListStream);
        System.out.println("Victor does not exists:" + resListStream);
        System.out.println("all starts with C: " + allMatchStream);

        List<String> listNamesLongerThan5 = nameList.stream().filter(name -> name.length()>5).collect(Collectors.toList());
        System.out.println(listNamesLongerThan5);

        //create stream using generate method
        Stream<Integer> generateStream =Stream.generate(()->5);
        Optional<Integer> resMin = Stream.generate(()->5).min((a,b)->a.compareTo(b));
        System.out.println(resMin);

        //create stream using iterate method
        Stream<Integer> iterateStream = Stream.iterate(1, x->x+2);




    }
}
