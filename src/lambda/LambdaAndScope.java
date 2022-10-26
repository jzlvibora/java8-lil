package lambda;

public class LambdaAndScope {
    public static void main(String[] args) {

//        Ex1: invalid . c is laready defined within the scope
//        Calculator c = (c,a) -> c+a;

//        Ex2:invalid
//        int c = 5;
//        Calculator calculator = (c,a) -> c+a;

//        Ex3:valid
        int c = 5;
        Calculator calculator = (b,a) -> c+a;
    }
}
