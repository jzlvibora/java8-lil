package interfaces;

public class Bag implements Foldable , Washable{

    public void fold(){
        System.out.println("Folding bag.");
    }

    @Override
    public void wash() {
        System.out.println("Washing bag..");
    }


}
