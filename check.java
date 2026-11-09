// print the reverse Number = 7789
/* 
public class check {
    public static void main(String[] args) {
        int a = 7789;
        int lastDigit = 0;
        while (a>0) {
            lastDigit = a%10;
            
            a = a/10;
            System.out.print(lastDigit);
        }
       
    }
}

// check prime number or not?
import java.util.Scanner;
public class check {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter your number:");
        int n = sc.nextInt();
        boolean found = false;
        for(int i=2; i<n; i++){
             if(n%i==0){
                found= true;
                break;
             } 
        } 
        if(found){
            System.out.println("not prime");
        }else{
            System.out.println("prime");
        }
    }
}
    

// find GDC greastest common divider?
public class check{
    public static void main(String[] args) {
        int a = 30;
        int b = 32;
        int gdc = 0;
        
        if(a==0){
            System.out.println("Gdc is " + b);
        }else if(b==0){
            System.out.println("Gdc is " +a);
        }else if(a==b){
            System.out.println("Gdc is "+ a);
        }
        for(int i=1; i<Math.min(a,b);  i++){
            if(a%i==0 && b%i==0){
                gdc = i;
            }
        }
        System.out.println("GCD is " + gdc);
    }
}


// check Palindram Number.

public class check {
    public static void main(String[] args) {
        int a = 353;
        int original = a;
        int palindram = 0;
        while (a>0) {
             int lastDigit = a%10;
             palindram = palindram * 10 + lastDigit;
             a = a/10;
             
        }
        if(original == palindram){
            System.out.println(" This number is plindram " + original);
        }else{
            System.out.println("Not Palidram Numbr:");
        }
        
    }
}
    
// find Largest Number in an Array.
public class check {
public static void main(String[] args) {
    int arr[] = {1,4,5,2,36,7,8,9};
        int largest = 0; 
        for(int i=0; i<arr.length; i++){
            if(arr[i] > largest){
                largest = arr[i];
            }
        }
        System.out.println(largest);
    }
    
}
    

public class check {
public static void main(String[] args) {
    int arr[] = {1,4,5,2,36,7,8,9};
        int largest = 0; 
        int seconLargest = 0; 
        for(int i=0; i<arr.length; i++){
            if(arr[i] > largest){
                largest = arr[i];
            }
        }
        for(int i = 0; i <arr.length; i++){

        
        if(arr[i]> seconLargest && arr[i] < largest){
            seconLargest = arr[i];
        }
    }
    System.out.println(seconLargest);

    }
    
}
    */
import java.util.*;
public class check {

    public static void main(String[] args) {
       int arr[] = {1,2,2,3,4,5,6,7,7,7,7,7,};  
       Set <Integer> set = new HashSet<>();
       for(int i=0; i<arr.length; i++){
        set.add(arr[i]);
       }
       System.out.println(set);
    }
}


 


