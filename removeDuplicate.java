import java.util.Set;
import java.util.HashSet;
public class removeDuplicate {
    public static void main(String[] args) {
        int arr[]= {1,2,2,2,3,3,3,3,4,5,5};
        Set<Integer> set = new HashSet<>();
        for(int i=0; i<arr.length; i++){
            set.add(arr[i]);
        }
        System.out.println(set);
    }
}
