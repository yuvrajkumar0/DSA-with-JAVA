public class checkPrme {
    public static void main(String[] args) {
        int num = 112;
        boolean found = false;
        for(int i=2; i<=num-1; i++){
            if(num % i == 0){
                found = true;
                break;
                 
            }
        }
         if(found){
         System.out.println("this number is not prime:");
         }else{
            System.out.println("this numberis prime ");
         }

    }
}
