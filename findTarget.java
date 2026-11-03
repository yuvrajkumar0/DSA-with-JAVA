import java.util.*;
public class findTarget {
    public static void main(String[] args) {
        int arr[] = {2,6,5,8,11,9};
        int target = 14;
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0; i<arr.length; i++){
            int required = target - arr[i];
            if(map.containsKey(required)){
                System.out.println(map.get(required) + " " + i);
                break; 
            }
             map.put(arr[i],i);

        }
        

    }
}
