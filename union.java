import java.util.*;
public class union {
   public static void main(String[] args) {
     int arr1[] = {1,2,2,3,4,5,6};
     int arr2[] = {1,2,3,4,5,6,7};
     Set <Integer> set = new HashSet<>();
    for(int i=0; i<arr1.length; i++){
        set.add(arr1[i]);
    } for(int i=0; i<arr2.length; i++){
        set.add(arr2[i]);
    }
    ArrayList<Integer> unionn= new ArrayList<>(set);
     Collections.sort(unionn);
    System.out.println(unionn);

   } 
}
