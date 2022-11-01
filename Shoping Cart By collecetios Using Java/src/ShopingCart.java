import java.text.Collator;
import java.util.*;
import java.util.List;
public class ShopingCart {
    //Shopin Cart 
    public static void main(String[] args) {     
        LinkedList<String> list=new LinkedList();
        
        list.add("Nokia-1200");
        list.add("handsFree");
        list.add("Charger");
        list.add("cover");
        list.add("Screen proteccter");
        list.add("camera");
        list.add("base-charge");
        list.add("botton");
        list.add("CPU");
        list.add("ringer");
        list.add("sensor");
        list.add("Cable");
        list.add("Ascar");
        
        
        //Print all the lists
       for(int i=0; i<list.size(); i++){
          System.out.println(list.get(i));
        }
       
        System.out.println("---------------------------Remove methot----------------------------------");
      
      list.remove("camera");  //we can also remove by index and by methot of  clear()
      
                   //Print all the lists
       for(int i=0; i<list.size(); i++){
          System.out.println(list.get(i));
        }
       
        list.push("Voice-recoreder");
        
       
         System.out.println("-------------------------------------------------------------");
          for(int i=0; i<list.size(); i++){
          System.out.println(list.get(i));
        }
          
            System.out.println("-----------------------Sorting By alphabet------------------------------------");
                   Collections.sort(list, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return Collator.getInstance().compare(o1, o2);
               
            }
             });
                     
         System.out.println("------------------------------------------------------------");
          for(int i=0; i<list.size(); i++){
          System.out.println(list.get(i));
        }        
                   
    }
    
}
