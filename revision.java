
/*public class revision {
    public static void main(String[] args) {
        // sum of all element in the array:
        int arr[] = {1,2,3,4,5,6,7,8,9,10};
        int sum=0; 
        for(int i=0; i<arr.length; i++){
            sum += arr[i];
        }
        System.out.println(sum);
    }
}
    

 public class revision {
    public static void main(String[] args) {
    
        // find even element in the given array:
         int arr[] = {1,2,3,4,5,6,7,8,9,10};
         for(int i=0; i<arr.length; i++){
            if(arr[i] % 2==0){
                System.out.println(arr[i]);
            }
         }
    }
}
    


 public class revision {
    public static void main(String[] args) {
         // find odd element in the given array:
         int arr[] = {1,2,3,4,5,6,7,8,9,10};
         for(int i=0; i<arr.length; i++){
            if(arr[i] % 2==1){
                System.out.println(arr[i]);
            }
         }
    }

}
    
public class revision {
    public static void main(String[] args) {
        // add two arrays:
         int arr1[] = {1,2,3,4,5};
         int arr2[] = {1,2,3,4,5};
         
         for(int i=0; i<arr1.length; i++){
            
              arr1[i]=  arr1[i] + arr2[i];
            System.out.println(arr1[i]);
         }
          
    }
}
    
public class revision {
    public static void main(String[] args) {
        // subtract arrays:
         int arr1[] = {1,2,3,4,5};
         int arr2[] = {11,21,23,44,55};
          
         for(int i=0; i<arr1.length; i++){
            
              arr1[i]=  arr2[i] - arr1[i];
            System.out.println(arr1[i]);
         }
          
    }
}
    
    
public class revision {
    public static void main(String[] args) {
        // do bobble sort:
        int arr[] = {111,21,223,4,55};
        for(int i=0; i<arr.length-1; i++){
            for(int j=0; j<arr.length-1-i; j++){
                if(arr[j]>arr[j+1]){
                int temp = arr[j];
                arr[j] = arr[j+1];
                arr[j+1] = temp;
                }
                  
            }
            
        }
        for(int i=0; i<arr.length; i++){
            System.out.println(arr[i]);
        }

    }
}


public class revision {
    public static void main(String[] args) {

        // check this array is sorted or not:
        int arr[] = {1,2,3,4,5,6,7,8,9};
        boolean check =true;
        for(int i=0; i<arr.length-1; i++){
            if(arr[i]>arr[i+1]){
                check =false;
                break;
            }
        }
        if(check){
            System.out.println("This array is  sorted:");
        }else{
            System.out.println("This array is not sorted:");
        }
    }
}
    

import  java.util.*;
public class revision {
    public static void main(String[] args) {
        int arr1 [] = {1,9,1,2,3,4,5,7,3};
        int arr2 []= {2,3,4,4,5,6};

        Set<Integer> set = new HashSet<>();
        for(int i=0; i<arr1.length; i++){
            set.add(arr1[i]);

        }
        for(int i=0; i<arr2.length; i++){
            set.add(arr2[i]);

        }
        ArrayList <Integer> union  = new ArrayList<>(set);
         System.out.println(union);
    }
}
    
import  java.util.*;
public class revision {
    public static void main(String[] args) {
        int arr1 [] = {1,2,3,4,5,6,3};
        int arr2 []= {3,4,5,6,7};

        ArrayList<Integer> intersection = new  ArrayList<>();
         int i=0; 
         int j=0;
         while (i<arr1.length && j<arr2.length) {
            if(arr1[i]<arr2[j]){
                i++;
            }else if(arr1[i]>arr2[j]){
                j++;
            }else{
                intersection.add(arr1[i]);
                i++;
                j++;
            }
         }
         System.out.println("Intersection " + intersection);
    }
}
// Find The Missing Number:

public class revision {
    public static void main(String[] args) {
        int num [] = {1,2,4,5};
        int sum1 = 0;
        int sum2 = 0;
        
        for(int i=1; i<=5; i++){
             sum1 = sum1+i;
        }

           for(int i=0; i<num.length; i++){
             sum2 = sum2+num[i];
        }
        int missingNumber = sum1-sum2;
         System.out.println("Missing Number is " + missingNumber);
  

    }
}
    
   // Find Missing Number:
   public class revision {
    public static void main(String[] args) {
        int num []= {1,2,4,5};
        int n = 5;
        int sum = n*(n+1)/2;
        int s2 = 0;
        for(int i=0; i<num.length; i++){
         s2 = s2+num[i];
        }
        System.out.println("Missing Number is: " + (sum-s2));
    }
}
    
   public class  revision{

    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 2, 4, 5, 3, 6};

        System.out.print("Duplicate elements: ");

        for (int i = 0; i < arr.length; i++) {

            for (int j = i + 1; j < arr.length; j++) {

                if (arr[i] == arr[j]) {
                    System.out.print(arr[i] + " ");
                    break;
                }
            }
        }
    }
}
    
   public class revision {

    public static void main(String[] args) {

        int[] arr = {1, 2, 2, 3, 1, 4, 2};

        boolean[] visited = new boolean[arr.length];

        for (int i = 0; i < arr.length; i++) {

            if (visited[i]) {
                continue;
            }

            int count = 1;

            for (int j = i + 1; j < arr.length; j++) {

                if (arr[i] == arr[j]) {
                    count++;
                    visited[j] = true;
                }
            }

            System.out.println(arr[i] + " → " + count);
        }
    }
}
    
   import java.util.Scanner;

public class revison{

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of terms: ");
        int n = sc.nextInt();

        int a = 0;
        int b = 1;

        System.out.print("Fibonacci Series: ");

        for (int i = 1; i <= n; i++) {

            System.out.print(a + " ");

            int c = a + b;
            a = b;
            b = c;
        }
    }
}

public class revision {

    public static void main(String[] args) {

        int[] arr = {45, 12, 78, 23, 9, 56};

        int max = arr[0];
        int min = arr[0];

        for (int i = 1; i < arr.length; i++) {

            if (arr[i] > max) {
                max = arr[i];
            }

            if (arr[i] < min) {
                min = arr[i];
            }
        }

        System.out.println("Maximum = " + max);
        System.out.println("Minimum = " + min);
    }
}
    */

public class revision  {

    public static void main(String[] args) {

        int[] arr = {2, 7, 11, 15};
        int target = 9;

        for (int i = 0; i < arr.length; i++) {

            for (int j = i + 1; j < arr.length; j++) {

                if (arr[i] + arr[j] == target) {
                    System.out.println(
                        arr[i] + " + " + arr[j] + " = " + target
                    );
                }
            }
        }
    }
}





