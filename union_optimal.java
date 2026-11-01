import java.util.*;
public class union_optimal {
    public static void main(String[] args) {
        int arr1[]= {1,2,3,3,4,5,6};
         int arr2[]= {1,2,3,3,4,5,6,7};
         int i=0; 
         int j=0;
         ArrayList<Integer>union = new ArrayList<>();
         while(i<arr1.length && j<arr2.length){
            int value;
            if(arr1[i]<arr2[j]){
                value=arr1[i];
                i++;
            }
            else if(arr1[i]>arr2[j]){
                value=arr2[j];
                j++;
            }
            else{
                value=arr1[i];
                i++;
                j++;
            }
            if(union.isEmpty() || union.get(union.size()-1) !=value){
                union.add(value);
            }

         }
         while (i < arr1.length) {
            if (union.isEmpty() || union.get(union.size() - 1) != arr1[i]) {
                union.add(arr1[i]);
            }
            i++;
        }

        // Remaining elements of arr2
        while (j < arr2.length) {
            if (union.isEmpty() || union.get(union.size() - 1) != arr2[j]) {
                union.add(arr2[j]);
            }
            j++;
        }

        System.out.println("Union: " + union);
    }
}
