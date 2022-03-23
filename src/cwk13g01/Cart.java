package cwk13g01;

public class Cart extends ItemStorage {
    public double totalPrice() {
        double total = 0;
        for (int i = 0; i < firstEmptyItem; i++) {
            total += items[i].getPrice() * items[i].getHowMany();
        }
        return total;
    }

    @Override
    public String toString() {
        return super.toString() + "Total: (" + String.format("$%.2f", this.totalPrice()) + ")";
    }
}
