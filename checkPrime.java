
public class checkPrime{

    public void checkPrime(int n){
        
            if(n<=1){
                System.out.println("non prime:");
                return;
            }        
          for(int i=2; i*i<=n; i++){
            if(n%i==0){
                System.out.println("non prime:");
                return ;
            }
        }
         System.out.println(" prime:");
    }
     public static void main(String[] args){
         checkPrime ck = new checkPrime();
         ck.checkPrime(1);
        
       
    }
}

/*
public class checkPrime{
    public static void main(String[] args){
        int n = 7; 
        for(int i = 2; i<=6; i++){
            if(n%i==0){
            System.out.print("not prime");
            }
        }
          System.out.print(" prime");
    }
}
*/
