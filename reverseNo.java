public class reverseNo{
    
    public static void main(String[] args){
        int n = 6789;
        int reverse = 0;
        while(n !=0){
            int digit = n % 10;
            if(reverse>Integer.MAX_VALUE/10 || reverse<Integer.MIN_VALUE/10){
                System.out.println("Integer overflow");
                return;
            }
            reverse = (reverse * 10) + digit; 
            n = n/10;
        }
        System.out.println(reverse);
    }
}