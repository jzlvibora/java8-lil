package lambdachallenge;


public class LambdaExample {
    public static void main(String[] args) {
        Actionable actionable = ()-> System.out.println("Hello world");
        runAction(actionable);

//        StringMappable stringToUpperCase= (val) ->  val.toUpperCase();
//        printHelloWorldMapped(stringToUpperCase);
        //or
        printHelloWorldMapped(val->val.toUpperCase());

    }

    private static void printHelloWorldMapped(StringMappable map){
        System.out.println(map.mapString("helloworld"));
//        System.out.println(map);
    }

    private static void runAction(Actionable actionable){
        actionable.run();
    }

//    class PrintHelloWorld implements Actionable{
//
//        @Override
//        public void run() {
//            System.out.println("Hello World!");
//        }
//    }
//
//    class StringToUpperCase implements StringMappable{
//
//        @Override
//        public String mapString(String value) {
//            return value.toUpperCase();
//        }
//    }
}

//get rid of special class and implements the interface as lambda expression using the imnplementatio
//rewriye