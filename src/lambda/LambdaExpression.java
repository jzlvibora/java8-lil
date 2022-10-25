package lambda;

public class LambdaExpression {
    public static void main(String[] args) {
        Calculator calculator = (a,b) -> a+b;
        Calculator calculator1 = (double a, double b) -> {return a + b;};
        System.out.println(calculator.calc(5,9));

        Creator creator = ()->{ return 0;};
        System.out.println(creator.create());

        Tester tester = (val) -> val.length()>4;
        System.out.println(tester.test("hey"));

    }
}
