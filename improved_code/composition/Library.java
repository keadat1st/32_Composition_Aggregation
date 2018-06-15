// Java program to illustrate 
// the concept of Composition
import java.util.*;
 
// Libary class contains 
// list of books.
class Library 
{
 
    // reference to refer to list of books.
    private ArrayList<Book> books;
    
    public void addBook(Book book){
       books.add(book);
    }
     
    public ArrayList<Book> getTotalBooksInLibrary(){
         
       return books;  
    }
     
}
