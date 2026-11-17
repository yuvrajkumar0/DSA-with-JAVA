public class prime {
    public static void main(String[] args) {
        //Check this number is Prime or Not:
        int n=70;
        boolean check = true;
        for(int i=2; i<n-1; i++){
            if(n%i ==0){
            check = false;
                break;
                 
            }
            
        }
        if(check){
            System.out.println("This number is Prime:");
        }else{
            System.out.println("This number is not Prime:");
        }

    }
}
