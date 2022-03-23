package cwk13g01;

public class Textbook extends Book {
    private String subject;

    public Textbook(Book other, String subject) {
        super(other);
        this.subject = subject;
    }

    public Textbook(String description, double price, int howMany, String author, String subject) {
        super(description, price, howMany, author);
        this.subject = subject;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    @Override
    public boolean equals(Object obj) {        
        if(obj instanceof Textbook) {
            Textbook other = (Textbook)obj;
            return super.equals(obj) && this.getSubject().equals(other.getSubject());
        }
        else if(obj instanceof Novel) {
            Novel other = (Novel)obj;
            return super.equals(obj) && this.getSubject().equals(other.getGenre());
        }
        return false;
    }

    @Override
    public String toString() {
        return "Textbook: " + getDescription() + " on " + getSubject() + " by " + getAuthor() + " (" + String.format("$%.2f", price) + ")";
    }

    @Override
    public Book clone() {
        return new Book(this);
    }
}
