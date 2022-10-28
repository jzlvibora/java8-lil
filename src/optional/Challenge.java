package optional;

import java.util.Optional;

public class Challenge {
    public static void main(String[] args) {
        //1.create an empty optional of type string
        Optional<String> stringOptional= Optional.empty();

        //2.create an optional containing an integer
        Optional<Integer> integerOptional = Optional.of(31);

        //3.get the value out of the empty optioanl and specify a default name
        stringOptional.orElse("Percy");

        //4.filter the integer optional and only keep odd values, after that get the value or throw runtime exception
        integerOptional.filter(val->val%2!=0).orElseThrow(()->new RuntimeException());

        //5.map the integer to be 1 higher and get the value out
        integerOptional.map(val->val+1).get();
    }
}
