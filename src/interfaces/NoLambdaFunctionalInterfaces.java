package interfaces;

import java.util.function.Predicate;

public class NoLambdaFunctionalInterfaces {
    public static void main(String[] args) {
        Predicate<String> predicate = new Predicate<String>(){

            @Override
            public boolean test(String s) {
               return s.startsWith("M");
            }
        };

        System.out.println(predicate.test("Maria"));
        System.out.println(predicate.test("carmin"));
    }
}
