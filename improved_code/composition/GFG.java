// Java program to illustrate 
// the concept of Composition
import java.util.*;
 
// main method
class GFG 
{
    public static void main (String[] args) 
    {
         
        // Creating the Objects of Book class.
        Book b1 = new Book("EffectiveJ Java", "Joshua Bloch");
        Book b2 = new Book("Thinking in Java", "Bruce Eckel");
        Book b3 = new Book("Java: The Complete Reference", "Herbert Schildt");
         
        // Creating a Library and adding the 3 books to it.
        Library library = new Library();
        library.addBook(b1);
        library.addBook(b2);
        library.addBook(b3);
         
        ArrayList<Book> bks = library.getTotalBooksInLibrary();
        for(Book bk : bks){
             
            System.out.println("Title : " + bk.title + " and "
            +" Author : " + bk.author);
        }
    }
}
