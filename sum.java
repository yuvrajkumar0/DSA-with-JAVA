public class sum{
    public static void main(String[] args){
        int n = 67899;
        int last_digit;
        int sum=0;
        while(n>0){
            last_digit =  n%10;
             //System.out.println(last_digit);
             sum=sum+last_digit;
            n = n/10;
        }
        System.out.println(sum);
        
    }
}