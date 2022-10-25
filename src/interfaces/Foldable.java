package interfaces;

public interface Foldable {
    static void printFoldInstructions(){
        System.out.println("carefully fold the object.");
    }

    default void fold(){
        System.out.println("Folding the object");
    }

//    void fold();
}
