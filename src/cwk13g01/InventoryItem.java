package cwk13g01;

public class InventoryItem {
    protected String description;
    protected double price;
    protected int howMany = 1;

    public InventoryItem(InventoryItem item) {
        setDescription(item.getDescription());
        setPrice(item.getPrice());
    }

    public InventoryItem(String description, double price, int howMany) {
        setDescription(description);
        setPrice(price);
        setHowMany(howMany);
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getHowMany() {
        return howMany;
    }

    public void setHowMany(int howMany) {
        this.howMany = howMany;
    }

    public boolean equals(Object obj) {
        if(obj instanceof InventoryItem) {
            InventoryItem other = (InventoryItem)obj;
            return this.getDescription().equals(other.getDescription()) &&
                   this.getPrice() == other.getPrice();
        }
        return false;
    }

    public InventoryItem clone() {
        return new InventoryItem(this);
    }

    @Override
    public String toString() {
        return description + " (" + String.format("$%.2f", price) + ")";
    }

    public void view() {
        System.out.println("Viewing: " + this);
    }    
}
