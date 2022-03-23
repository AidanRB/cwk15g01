package cwk13g01;

public class Novel extends Book{
    private String genre;

    public Novel(Book other, String genre) {
        super(other);
        this.genre = genre;
    }

    public Novel(String description, double price, int howMany, String author, String genre) {
        super(description, price, howMany, author);
        this.genre = genre;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    @Override
    public boolean equals(Object obj) {        
        if(obj instanceof Textbook) {
            Textbook other = (Textbook)obj;
            return super.equals(obj) && this.getGenre().equals(other.getSubject());
        }
        else if(obj instanceof Novel) {
            Novel other = (Novel)obj;
            return super.equals(obj) && this.getGenre().equals(other.getGenre());
        }
        return false;
    }

    @Override
    public String toString() {
        return "Novel: " + getDescription() + " on " + getGenre() + " by " + getAuthor() + " (" + String.format("$%.2f", price) + ")";
    }

    @Override
    public Book clone() {
        return new Book(this);
    }
}
