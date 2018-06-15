# Composition

Composition is a restricted form of Aggregation in which two entities are highly dependent on each other.

It represents part-of relationship.    
In composition, both the entities are dependent on each other.    
When there is a composition between two entities, the composed object cannot exist without the other entity.    
Lets take example of Library.    

> Java program to illustrate the concept of Composition.    

```` 
public class Book 
{
    public String title;
    public String author;
     
    Book(String title, String author)
    {      
        this.title = title;
        this.author = author;
    }
}
````    

````    
import java.util.*;

public class Library 
{
 
    // The books in the Library.
    private ArrayList<Book> books;
    
    public void addBook(Book book){
       books.add(book);
    }
     
    public ArrayList<Book> getTotalBooksInLibrary(){      
       return books;  
    }
     
}

````    

````    
public class GFG 
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
````    

Output
````    
Title : EffectiveJ Java and  Author : Joshua Bloch
Title : Thinking in Java and  Author : Bruce Eckel
Title : Java: The Complete Reference and  Author : Herbert Schildt
````    

In above example a library can have no. of books on same or different subjects. So, If Library gets destroyed then All books within that particular library will be destroyed. i.e. book can not exist without library. That’s why it is composition.
