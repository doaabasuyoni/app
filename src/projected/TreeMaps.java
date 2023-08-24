
package projected;
import java.util.TreeMap;
import java.util.ArrayList;
import java.util.Map;
import java.util.Set;

public class TreeMaps {
    TreeMap<Integer,Book> map;
    
    public TreeMaps(){
      map  = new TreeMap<>();
    }
    
    public Book insert(int book_id,Book book){
       return map.put(book_id, book);
    }
    
    public Book get(int id){
        return map.get(id);
    }
    
    public Book searchById(int id){
        Book book = this.get(id);
        if(book == null) return book;
        this.toString(book);
        return book;
    }
    
    public ArrayList<Book> searchByTitle(String title){
        ArrayList<Book> list = new ArrayList<>();
            for (Map.Entry<Integer, Book> entry : map.entrySet()){
                Book book = entry.getValue();
                if(title.equals(book.getTitle())){
                    this.toString(book);
                    list.add(book);
                    System.out.println("*****");
                }
        }     
            return list;
    }

    public ArrayList<Book> searchByAuthor(String author){
         ArrayList<Book> list = new ArrayList<>();
            for (Map.Entry<Integer, Book> entry : map.entrySet()){
                Book book = entry.getValue();
                if(author.equals(book.getAuthor())){
                    this.toString(book);
                    list.add(book);
                    System.out.println("*****");
                }
        }     
           return list;
    }
    public Book delete(int id){
       return map.remove(id);
    }
    
    public void toString (Book book){
        System.out.println("book_id = " + book.getBook_Id());
        System.out.println("title = " + book.getTitle());
        System.out.println("author = " + book.getAuthor());
        System.out.println("quantity = " + book.getQuantity());
        System.out.println("isbn = " + book.getIsbn());
        System.out.println("publisher = " + book.getPublisher());
        System.out.println("total_pages = " + book.getTotal_Pages());
        System.out.println("rating = " + book.getRating());
        System.out.println("published_date = " + book.getPublished_Date());
    }

 public Set<Map.Entry<Integer,Book>> entrySet(){
        return map.entrySet();
    }
    
}  

