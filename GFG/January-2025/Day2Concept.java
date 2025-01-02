
import java.util.*;
public class Day2Concept {
    public static void main(String[] args) {
        //country(key) population(value)
        //creating HashMap : 
        HashMap<String , Integer> map =new HashMap<>();

        //insertion :

        map.put("India",120);
        map.put("China",130);
        map.put("US",90);

        System.out.println(map); //{China=130, US=90, India=120} --HashMap is an unordered map 
        
        map.put("China",180); //updating the value of existing key 
        System.out.println(map);

        //to search a key :

        if(map.containsKey("India")){
            System.out.println("exists");
        }
        //to search a value :
        if(map.containsValue(120)){
            System.out.println("true");
        }

        //to get the value of key :

        System.out.println(map.get("India")); //value of passed key is printed
        //if we pass a key which doesnt exist then null is printed


        // int arr[]={1,2,3,4};
        // for(int val:arr){
        //     System.out.println(val);
        // }

        for(Map.Entry<String,Integer> e : map.entrySet()){ //here map.entrySet() turns all the entries of a hashmap to a set
            System.out.println(e);
            e.getKey();
            e.getValue();
        }

        //to make a set of only keys : 
        Set<String> keys=map.keySet();
        for(String key : keys){
            System.out.println(key + " "+map.get(key));
        }
    }
}
