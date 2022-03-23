package cwk13g01;

public class Book extends InventoryItem {
    protected String author;

    public Book(Book other) {
        super(other);
        this.author = other.author;
    }

    public Book(String description, double price, int howMany, String author) {
        super(description, price, howMany);
        this.author = author;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    @Override
    public String toString() {
        return "Book: " + description + " by " + author + " (" + String.format("$%.2f", price) + ")";
    }

    @Override
    public void view() {
        System.out.println("Opening Book Exerpt: " + description);
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Book) {
            Book other = (Book)obj;
            return super.equals(obj) && this.getAuthor().equals(other.getAuthor());
        }
        return false;
    }

    @Override
    public Book clone() {
        return new Book(this);
    }
}
