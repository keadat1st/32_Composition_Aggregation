// Java program to illustrate 
// the concept of Composition
import java.util.*;

class GFG 
{
    public static void main (String[] args) 
    {    
        // Creating a Library
        Library library = new Library();
     
        // Adding 3 books to the library.
        library.addBook(new Book("EffectiveJ Java", "Joshua Bloch"));
        library.addBook(new Book("Thinking in Java", "Bruce Eckel"));
        library.addBook(new Book("Java: The Complete Reference", "Herbert Schildt"));
         
        ArrayList<Book> bks = library.getTotalBooksInLibrary();
        for(Book bk : bks){        
            System.out.println("Title : " + bk.title + " and "
            +" Author : " + bk.author);
        }
    }
}
