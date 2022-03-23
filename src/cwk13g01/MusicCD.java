package cwk13g01;

public class MusicCD extends InventoryItem {
    protected String performer;

    public MusicCD(MusicCD other) {
        super(other);
        this.performer = other.performer;
    }

    public MusicCD(String description, double price, int howMany, String performer) {
        super(description, price, howMany);
        this.performer = performer;
    }    

    public String getPerformer() {
        return performer;
    }

    public void setPerformer(String performer) {
        this.performer = performer;
    }

    @Override
    public String toString() {
        return "CD: " + performer + ": " + description + " (" + String.format("$%.2f", price) + ")";
    }

    @Override
    public void view() {
        System.out.println("Now Playing Sample: " + description);
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof MusicCD) {
            MusicCD other = (MusicCD)obj;
            return super.equals(obj) && this.getPerformer().equals(other.getPerformer());
        }
        return false;
    }

    @Override
    public MusicCD clone() {
        return new MusicCD(this);
    }
}
