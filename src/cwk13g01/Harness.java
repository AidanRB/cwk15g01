package cwk13g01;

public class Harness {
    public static void main(String[] args) {
        InventoryItem one = new InventoryItem("A Very Good Item", 42, 1);
        InventoryItem two = new InventoryItem("An Okay Item", 4.2, 1);
        System.out.println(one);
        System.out.println(two);
        one.setHowMany(5);
        InventoryItem one_copy = new InventoryItem(one);
        InventoryItem two_copy = two.clone();
        System.out.println(one_copy);
        System.out.println(two_copy);
        System.out.println(one.equals(one_copy));
        System.out.println(one_copy.equals(one));
        System.out.println(one.equals(two) + "\n");
        
        InventoryItem actuallyBook = new Book("A Good Book", 15, 1, "A Good Author");
        InventoryItem actuallyCD = new MusicCD("Now That's What I Call Mongolian Throat Singing", 9.99, 3, "Various Artists");
        InventoryItem bookCopy = actuallyBook.clone();
        InventoryItem musicCopy = actuallyCD.clone();

        bookCopy.view();
        System.out.println(actuallyBook.equals(bookCopy));
        musicCopy.view();
        System.out.println(actuallyCD.equals(musicCopy));
        System.out.println(actuallyBook.equals(actuallyCD));
    }
}
