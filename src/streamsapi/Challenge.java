package streamsapi;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.stream.Collectors;

public class Challenge {
    public static void main(String[] args) {
        String[] names={"Rylee", "Angelique","Youssef","Natalie","Maiike", "Ella", "Anya", "Satish", "Antony","Jerry", "Fatime"};
        List<String> nameList = new ArrayList<>(Arrays.asList(names));
        String[] condition={"A","a"};

        //result is list with values that stat with A or a
        List<String> filterresult = nameList.stream().filter(name->name.startsWith("a")||name.startsWith("A")).collect(Collectors.toList());
        System.out.println(filterresult);

        //SOLN:
//        List<String> namesList=Arrays.stream(names).filter(s->s.toLowerCase().startsWith("a")).collect(Collectors.toList());

        //result is the print statement of the modified elements
        nameList.stream()
                .map(name->(name.equals("Maiike"))?name+"student":name)
                .forEach(name-> System.out.println(name));

        //result is new list with only Angelique and Anya in it
        //print before terminal operator
        List<String> newList = nameList.stream().filter(name->!name.equals("Antony")).peek(name-> System.out.println(name)).filter(name->name.equals("Angelique")||name.equals("Anya")).collect(Collectors.toList());
        System.out.println(newList);

    }
}
