package lambda;

public class MethodArgs {
    public static void main(String[] args) {
        System.out.println(runTester(val->val.length()>4,"cartwheel"));
        System.out.println(runTester(val->val.startsWith("v"),"cassiopeia"));

    }

    public static boolean runTester(Tester t, String str){
        return t.test(str);
    }
}
