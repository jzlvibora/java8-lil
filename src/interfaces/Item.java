package interfaces;

public class Item implements Foldable, Washable {
    private String name;
    private String brand;

    public Item(String name, String brand) {
        this.name = name;
        this.brand = brand;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void fold(){
        System.out.println("Folding my " + this.brand + " " +this.name);
    }

    @Override
    public void wash() {
        System.out.println("Washing " +name);
    }

    public static void main(String[] args) {
        Foldable.printFoldInstructions();
        Item item1 = new Item("Jeans", "Bench");
        item1.fold();

    }
}
