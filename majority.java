import java.util.*;
public class majority {
    public static void main(String[] args) {
        int arr[] = {2,2,3,3,4,2,2};
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int x : arr){
             int count = map.getOrDefault(x,0) + 1 ;
             map.put(x,count);
             if(count> arr.length/ 2){
                System.out.println(x);
                break;
             }
        }
        
    }
}
