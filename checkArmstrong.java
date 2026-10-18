public class checkArmstrong{
    public static void main(String[] args){
        int n = 371;
        int copyN=n;
        int sumOfCube=0;
        
        while(n !=0){
            int digit = n%10;
            sumOfCube += digit*digit*digit;
            n = n/10;
             
        } 
         if(copyN==sumOfCube){
            System.out.println("This number is ArmStrjong");
         }else{
             System.out.println("This number is not ArmStrjong");
         }
    }
}