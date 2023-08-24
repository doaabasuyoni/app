
package projected;

import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class Usertreemap {
    TreeMap<Integer,Users> map;
    
    public Usertreemap(){
      map  = new TreeMap<>();
    }
    
    public Users insert(int user_id,Users user){
       return map.put(user_id, user);
    }
    
    public Users get(int id){
        return map.get(id);
    }
    
    public Users delete(int id){
       return map.remove(id);
    }
    
 public Set<Map.Entry<Integer,Users>> entrySet(){
        return map.entrySet();
    }
    
}  

 

