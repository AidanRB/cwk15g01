# Project 2
## Part A

Create a class InventoryItem which has
- a String description
- a double price
- an int howMany

Provide a copy constructor in addition to other constructors.  The copy constructor should copy description and price but not howMany, which defaults to 1 instead.  In all inheriting classes, also provide copy constructors which chain to this one.

Write a clone method that uses the copy constructor to create a copy.  Create similar clone methods in all classes in this assignment.

Write a toString for this class that returns something like "Footo the Wonder Boot Exploder ($22.99)" (leave out howMany)

Also write an equals method for this class. InventoryItems can only be equal to other InventoryItems, and only if they have the same price and description (even if howMany is different). Note how the equals method agrees with the copy constructor about what it means for two InventoryItems to be the same.

Add a method view(), that prints something like "Viewing: Footo the Wonder Boot Exploder"

In a harness class with a main, create several InventoryItems, clone them, and check that  equals works properly.

## Part B
Create a class Book which inherits from InventoryItem and also has a String author (Book will use description to hold the book's title). toString for this class will return something like "Book: The Curse of the Flying Wombat by Constance deCoverlet ($12.95)". 

For Book, override view() to print something like "Opening Book Exerpt: The Curse of the Flying Wombat"

Also override equals to require author is the same, in addition to the requirements in the superclass (chain the equals methods together).

---

Create a class MusicCD which inherits from InventoryItem and also has a String performer (it will use description to hold the CD's title). toString for this class will return something like "CD: Tommy Gnosis: Greatest Hits ($18.65)" 

For MusicCD override view() to print something like "Now Playing Sample: Greatest Hits".

Also override equals to require performer is the same, in addition to the requirements in the superclass.

---

In your main, create more InventoryItem variables, but point them at a Book and a MusicCD.  Use clone to make copies of each type and make sure this works.  Check that equals works properly. 

Turn in Parts A & B as Classwork, but then continue for the Project.

## Part C
Create two more classes, TextBook and Novel, which inherit from Book. A TextBook has a String subject, and a Novel has a String genre.

Override equals in both these classes.  A TextBook can be equal to another TextBook with the same price, description, author,  and subject, or to a Novel if the price, description, and author are the same and the genre of the Novel is the same as the subject of the textbook. The same goes for the Novel class.  

## Part D
Create a class ItemStorage which contains an array of inventory items as an instance variable. It should start out empty but with room for at least 10 items. Keep an instance variable like firstEmptyInstance which holds the number of the first empty location in the array (these should NOT be accessible directly from outside classes, but you may find it easier to use protected for the sake of your subclasses).

Add a method add(newitem) to add InventoryItems to the list.  If the item it is adding is equal (think about this) to an item already in the list, instead of taking up another spot in the array, increase the howmany number for the item already there (so if the one in the array has 3 and the one I am adding has 2, we end up with 5), otherwise add it to the array in the first empty spot as usual.  If we have added successfully, return true. If the item is new to the list and the array is full, return false.

The toString method should return a String that lists all the items that are in the list, numbered from 1, including how many of each there are.

Add a method viewAll that calls view for each of the items in the list.

---

Create a class Cart which inherits from ItemStorage

Add a method totalPrice which should return the current total price of all elements in the cart, taking in to account how many of each there are (so if there is an item with price $3 and there are 4 of them, they add $12 to the total price.

The toString should look like the one for ItemStorage, but add a total price at the bottom.

---

Create a Class Warehouse which inherits from ItemStorage.

Add a method buy(int index) (Assume a human started counting at 1, and adjust accordingly.)

- If index is not a valid, occupied index in the list, return null. 
- If it is valid and there is more than one of that item in stock, decrease the number in stock, and return a copy of the item. 
- If there is only one left, before returning it, remove it entirely from the list by first replacing it by the last item in the list, and then moving the first empty index variable up by one, and then return the item.  (so, if the cart formerly contained items (A, B, C, D, E) and we removed the last C, it would now contain (A, B, E, D), and the first empty index would become 4 instead of 5, while we return C.)  
*[Do not remove items by looping through and moving everything else up, so that ABCDE with C removed becomes ABDE, notice how much more inefficient this is.  It is only worth doing in an array if we care about the order.]*

## Part E
In a main, create a Warehouse and fill it with various Books, MusicCD's, and other items for sale.  Make sure there are multiples of some items in the warehouse. (Make items up in your code, don't read them in from a user). Also create a Cart.

In a loop, repeatedly show the Warehouse and ask the user whether to 1) buy a new item, 2) view cart, 3) preview items 4) check out. If they choose to buy a new item, ask for the number of the item, buy that item from the warehouse, and add the chosen item to the cart. If they choose to view cart, print the cart. If they choose to preview items, use viewAll() from the Cart class to view all items in the cart. If they choose to check out,  show the total cost again and make them confirm that they want to buy  and if they do, print a message saying their credit card was charged, if not just say goodbye, then end the program.

*(hint: The main class shouldn't even need to be aware that there are arrays in the Cart and Warehouse classes.  Classes other than main shouldn't talk to the user for this program.  As always, you may add extra methods to any class to help you break down tasks or to make coding easier.)*