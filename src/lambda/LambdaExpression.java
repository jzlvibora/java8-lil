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
        Tester tester1 = val -> {
            String s = val.substring(0,val.length()-2);
            if(s.length()>2){
                System.out.println(val.length());
                System.out.println(s);
                return true;
            }
            else{
                return false;
            }
        };
        System.out.println(tester1.test("macaroni"));

    }
}
