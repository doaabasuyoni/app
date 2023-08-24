
package projected;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.logging.Level;
import java.util.logging.Logger;
public class Projected {
    //map is 
public static TreeMaps map = new TreeMaps();
public static Usertreemap usermap = new Usertreemap();
    public static void main(String[] args) throws Exception{
        readFile();
       Set mySet = map.entrySet();
        Iterator it = mySet.iterator();
        while(it.hasNext()){
            Map.Entry entry = (Map.Entry) it.next();
            int id = (int) entry.getKey();
            Book b=(Book) entry.getValue();
            System.out.println("The key"+id);
            System.out.println(b.title+b.author+b.publisher+b.quantity+b.isbn+b.published_date+b.rating+
                    b.total_pages);
        }
        
        Library from = new Library();
        from.setVisible(true);
        
        
        
        
        
        
        
        
        
      /* File file =new File("C:\\Users\\Ma\\Downloads\\homework4\\books_file.txt");
       if(file.canRead()){
          BufferedReader br  = new BufferedReader(new FileReader(file));
      String sd= br.readLine();
        int totalbook=Integer.parseInt(sd);
        Book [] list=new Book[totalbook];
        LinkedList<Book> list1 = new LinkedList();
      int  count=0;
      String st="";
      int book_id;
       String title;
       String author;
        long isbn;
        String publisher;
        int total_pages;
        float rating;
        String published_date;
        while ( st != null){
             try{
            book_id=Integer.parseInt(br.readLine());
             } catch(Exception e){
                 book_id=0;
          }
            
             try{
            String titelfile=br.readLine();
          String [] arraytitel=  titelfile.split(" -> ");
             title=arraytitel[1];
                } catch(Exception e){
                 title=null;
          }
             
              try{
             String authorfile=br.readLine();
          String [] arrayauthor=  authorfile.split(" -> ");
              author=arrayauthor[1];
         } catch(Exception e){
                author=null;
          }

                try{
                String isbnfile=br.readLine();
          String [] arrayisbn= isbnfile.split(" -> ");
             isbn=Long.parseLong(arrayisbn[1]);
            } catch(Exception e){
                isbn=0L;
          }

                     try{
                 String publisherfile=br.readLine();
          String [] arraypublisher= publisherfile.split(" -> ");
              publisher=arraypublisher[1];
             } catch(Exception e){
                 publisher=null;
          } 
                     
               
                 try{
                String total_pagesfile=br.readLine();
          String [] arraytotal_pages= total_pagesfile.split(" -> ");
          total_pages=Integer.parseInt(arraytotal_pages[1]);
     } catch(Exception e){
                total_pages=0;
          } 
                 
               try{
         String ratingfile=br.readLine();
          String [] arrayrating= ratingfile.split(" -> ");
          rating=Float.parseFloat(arrayrating[1]); 
     } catch(Exception e){
                 rating=0.0f;
          }  
               
                try{
                  String published_datefile=br.readLine();
          String [] arraypublished_date= published_datefile.split(" -> ");
             published_date=arraypublished_date[1];
                } catch(Exception e){
                  published_date=null;
          }  
               
               
           list[count]=new Book(book_id,title,author,isbn,publisher,total_pages,rating,published_date);
            list1.addFirst(list[count]);
            System.out.println("The id Book:"+list1.getFirst().book_id+"  The Title:"+list1.getFirst().title+
              "  The author:"+ list1.getFirst().author+"  The isbn:"+
            +list1.getFirst().isbn+"  The Publisher:"+list1.getFirst().publisher+
          "  The total_pages:" +list1.getFirst().total_pages+"  The rating:"+list1.getFirst().rating
          +"  The Published_date:" +list1.getFirst().published_date );
              count++;
            st= br.readLine();
    }
          

       }*/
    }     
        
public static String readFile() throws IOException{
    File file =new File("BOOK.txt");
     BufferedReader br = null;
     String z = null;
       if(file.canRead()){
        try {
            br = new BufferedReader(new FileReader(file));
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Admin.class.getName()).log(Level.SEVERE, null, ex);
        }
       int count=0;
      String st="";
      int book_id1 = 0,quantity1;
      long isbn;
      int total_pages;
      float rating;
      String  publisher,title,author,published_date;
        while ( st != null){
             try{
            String book_id=br.readLine();
          String [] arrayid=  book_id.split(":");
            book_id1=Integer.parseInt(arrayid[1]);
            count++;
                } catch(Exception e){
                 book_id1 = 0;
                 break;
          }
             try{
            String titel=br.readLine();
          String [] arraytitel=  titel.split(":");
          title=arraytitel[1];
                } catch(Exception e){
                 title=null;
          }
              try{
             String authorfile=br.readLine();
          String [] arrayauthor=  authorfile.split(":");
            author=arrayauthor[1];
         } catch(Exception e){
                author=null;
          } 
          try{
             String quantity=br.readLine();
          String [] arrayquantity=  quantity.split(":");
            quantity1=Integer.parseInt(arrayquantity[1]);
         } catch(Exception e){
               quantity1=0;
          }  
                try{
                String isbnfile=br.readLine();
          String [] arrayisbn= isbnfile.split(":");
              isbn=Long.parseLong(arrayisbn[1]);
            } catch(Exception e){
                isbn=0L;
          }
                     try{
                 String publisherfile=br.readLine();
          String [] arraypublisher= publisherfile.split(":");
              publisher=arraypublisher[1];
             } catch(Exception e){
                 publisher=null;
          } 
                 try{
                String total_pagesfile=br.readLine();
          String [] arraytotal_pages= total_pagesfile.split(":");
          total_pages=Integer.parseInt(arraytotal_pages[1]);
     } catch(Exception e){
                total_pages=0;
          } 
               try{
         String ratingfile=br.readLine();
          String [] arrayrating= ratingfile.split(":");
          rating=Float.parseFloat(arrayrating[1]); 
     } catch(Exception e){
                 rating=0.0f;
          }  
                try{
                  String published_datefile=br.readLine();
          String [] arraypublished_date= published_datefile.split(":");
             published_date=arraypublished_date[1];
                } catch(Exception e){
                  published_date=null;
          } 
    Book book = new Book(title,author,quantity1,isbn,publisher,total_pages,rating,published_date);
             map.insert(book_id1,book);
           st= br.readLine();
    }
          
      z=  Integer.toString(count+1);
  
       }  
    return z;  
}   
        
 public static String readFileUser() throws IOException{
    File file =new File("User.txt");
     BufferedReader br = null;
     String z = null;
       if(file.canRead()){
        try {
            br = new BufferedReader(new FileReader(file));
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Admin.class.getName()).log(Level.SEVERE, null, ex);
        }
       int count=0;
      String st="";
      int id = 0,age;
      String  email,password,first_name,last_name;
        while ( st != null){
             try{
            String id1=br.readLine();
          String [] arrayid=  id1.split(":");
            id=Integer.parseInt(arrayid[1]);
            count++;
                } catch(Exception e){
                 id = 0;
                 break;
          }
             try{
            String email1=br.readLine();
          String [] arraytitel=  email1.split(":");
          email=arraytitel[1];
                } catch(Exception e){
                 email=null;
          }
              try{
             String passwordfile=br.readLine();
          String [] arraypassword=  passwordfile.split(":");
           password=arraypassword[1];
         } catch(Exception e){
                password=null;
          } 
                try{
                String first_namefile=br.readLine();
          String [] arrayfirst_name= first_namefile.split(":");
              first_name=arrayfirst_name[1];
            } catch(Exception e){
                first_name=null;
          }
                     try{
                 String last_namefile=br.readLine();
          String [] arraylast_name= last_namefile.split(":");
              last_name=arraylast_name[1];
             } catch(Exception e){
                 last_name=null;
          } 
                 try{
                String agefile=br.readLine();
          String [] arrayage= agefile.split(":");
          age=Integer.parseInt(arrayage[1]);
     } catch(Exception e){
                age=0;
          }          
     Users user = new  Users(email,password,first_name,last_name,age);
             usermap.insert(id,user);
           st= br.readLine();
    }   
      z=  Integer.toString(count+1);
       }  
    return z;  
}          
        
        
    }
    

