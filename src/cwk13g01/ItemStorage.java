package cwk13g01;

public class ItemStorage {
    protected InventoryItem [] items = new InventoryItem[10];
    protected int firstEmptyItem = 0;

    public boolean add(InventoryItem newItem) {
        for (int i = 0; i < firstEmptyItem; i++) {
            if (items[i] != null && items[i].equals(newItem)) {
                items[i].setHowMany(items[i].getHowMany() + newItem.getHowMany());
                return true;
            }
        }

        if (firstEmptyItem < items.length) {
            items[firstEmptyItem++] = newItem;
            return true;
        }

        return false;
    }

    @Override
    public String toString() {
        String returning = "";
        for (int i = 0; i < firstEmptyItem; i++) {
            returning += (i + 1) + ". " + items[i].getHowMany() + "x " + items[i] + "\n";
        }
        return returning;
    }

    public void viewAll() {
        for (int i = 0; i < firstEmptyItem; i++) {
            items[i].view();
        }
    }
}
