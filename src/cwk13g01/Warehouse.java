package cwk13g01;

public class Warehouse extends ItemStorage {
    public InventoryItem buy(int index) {
        index--;
        
        if(index < 0 || index >= firstEmptyItem) {
            return null;
        }
        
        else if(items[index].getHowMany() > 1) {
            items[index].setHowMany(items[index].getHowMany() - 1);
            return items[index].clone();
        }

        InventoryItem returning = items[index];
        items[index] = items[--firstEmptyItem];
        return returning;
    }
}
