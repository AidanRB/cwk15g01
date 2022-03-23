package cwk13g01;

import java.util.Scanner;

public class MainClass {
    public static void main(String[] args) {
        Warehouse warehouse = new Warehouse();
        warehouse.add(new MusicCD("Album II", 9.99, 4, "1D Dekodierungskapazitat"));
        warehouse.add(new MusicCD("Album IV", 19.99, 2, "2D Dekodierungskapazitat"));
        warehouse.add(new MusicCD("Album IV", 19.99, 3, "2D Dekodierungskapazitat"));
        warehouse.add(new Textbook("Book of Text", 159, 1, "McAuthor", "Words"));
        warehouse.add(new Novel("Stories For Your Pet Skink", 15, 2, "Elizabeth Greene", "Pets and Animals"));
        warehouse.add(new Book("An HR Adventure", 2, 6, "Dr. Suits"));
        warehouse.add(new Book("The Book of Books", 3, 7, "Various"));
        warehouse.add(new Textbook("Overpriced and Outdated", 85, 4, "Some Guy", "Marketing"));
        warehouse.add(new Novel("How I Made $1m Selling Textbooks", 20, 1, "Some Guy", "Marketing"));

        Cart cart = new Cart();
        int choice = 0;
        Scanner scanner = new Scanner(System.in);
        while(choice != 4) {
            System.out.println("\n# Warehouse:\n" + warehouse);

            System.out.println("\n1. Buy a new item");
            System.out.println("2. View cart");
            System.out.println("3. Preview items");
            System.out.print("4. Checkout\n: ");
            switch(choice = scanner.nextInt()) {
                case 1:
                    System.out.print("Choose an item to buy: ");
                    int index = scanner.nextInt();
                    InventoryItem item = warehouse.buy(index);
                    if(item != null) {
                        cart.add(item);
                        System.out.println("\n# Item added to cart\n");
                    }
                    else {
                        System.out.println("\n# Invalid item\n");
                    }
                    break;
                
                case 2:
                    System.out.println("\n# Cart: " + cart + "\n");
                    break;
                
                case 3:
                    cart.viewAll();
                    break;
                
                case 4:
                    System.out.println("Your total is $" + String.format("%.2f", cart.totalPrice()));
                    System.out.print("\n# Proceed to checkout? (y/n): ");
                    if(scanner.next().equals("y")) {
                        // add sales tax
                        System.out.println("\n# Credit card charged " + String.format("%.2f", cart.totalPrice() * 1.06) + "\n");
                    }
                    else {
                        System.out.println("\n# Goodbye :(");
                    }
                    break;
                
                default:
                    System.out.println("Invalid choice");
            }
        }
        scanner.close();
    }
}
