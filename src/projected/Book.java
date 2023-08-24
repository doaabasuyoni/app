
package projected;

public class Book {
   public  int book_id ;
public String title ;
public String author;
public int quantity ;
public long isbn ;
public String publisher ;
public int total_pages ;
public float rating ;
public String published_date ;


public Book (int book_id,String title, String author,int quantity,long isbn,String publisher,
        int total_pages,float rating,String published_date){
        this.book_id = book_id;
        this.title  = title;
        this.author  = author;
        this.quantity=quantity;
        this.isbn  = isbn;
        this. publisher  =  publisher;
        this.total_pages  = total_pages;
         this.rating  = rating;
         this.published_date  = published_date;
    }
public Book (String title, String author,int quantity,long isbn,String publisher,
        int total_pages,float rating,String published_date){
        this.title  = title;
        this.author  = author;
        this.quantity=quantity;
        this.isbn  = isbn;
        this. publisher  =  publisher;
        this.total_pages  = total_pages;
         this.rating  = rating;
         this.published_date  = published_date;
    }

    public void setBook_Id( int book_id ) {
        this.book_id = book_id;
    }
 
    public int getBook_Id() {
        return  this.book_id;
    }
  public void setTitle( String title) {
        this.title  = title;
    }
 
    public String getTitle() {
        return   this.title ;
    }
   
  public void setAuthor(  String author ) {
       this.author  = author;
    }
    public String getAuthor() {
        return  this.author;
    }

  public void setIsbn( long isbn) {
        this.isbn  = isbn;
    }
 
    public long getIsbn() {
        return   this.isbn ;
    }
  
  public void setPublisher( String publisher ) {
         this. publisher  =  publisher;
    }
 
    public String getPublisher() {
        return   this. publisher ;
    }
  
  public void setTotal_Pages( int total_pages ) {
        this.total_pages  = total_pages;
    }
 
    public int getTotal_Pages() {
        return  this.total_pages;
    }
  
  public void setRating( float  rating ) {
        this.rating  = rating;
    }
    public float getRating() {
        return   this.rating ;
    }
 
   public void setPublished_Date( String published_date ) {
        this.published_date  = published_date;
    }
    public String getPublished_Date() {
        return   this.published_date ;
    }  
    public int getQuantity() {
        return quantity;
    }
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}