package otherfeatures;

public class StringInSwitchExample {
    public static void main(String[] args) {
        String language = "java";

        switch(language){
            case "java":
                System.out.println("i love java");
                break;

            case "python":
                System.out.println("i love python");
                break;

            case "c#":
                System.out.println("i love c#");

            default:
                System.out.println("can you teach me that");
                break;
        }
    }
}
;