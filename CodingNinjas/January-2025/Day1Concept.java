import java.util.ArrayList;
import java.util.Collections;

/*instead of importing different classes of java.util package 
    we can simply  import java.util.*;
*/
public class Day1Concept {
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<Integer>();
        
        //ArrayList<String> list2=new ArrayList<String>();
        
        //Adding objects to list
        list.add(0);
        list.add(3);
        list.add(23);
        System.out.println(list);

        //to retrieve a particular of list 

        int ele = list.get(2); //index is passed
        System.out.println(ele);

        //add element in between : 
        list.add(1,4); //first index then element is passed
        System.out.println(list);

        //to change the value of existing element :
        list.set(2,12);  //first index then new element is passed
        System.out.println(list);

        //to delete a particular element :
        list.remove(2);
        System.out.println(list);

        //size of arrayList : 

        System.out.println(list.size());

        //to sort theh arryList :
        Collections.sort(list); //for this Collection class is imported
        
        //to iterate an arrayList :

        for(int i=0;i<list.size();i++){
            System.out.print(list.get(i)+" ");
        }
        
        //enhanced for loop OR for-each loop
        for(int i :list){
            System.out.println(i);
        }
    }
}
