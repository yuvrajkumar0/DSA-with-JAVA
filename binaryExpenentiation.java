public class binaryExpenentiation {
    public static long power(long x, long n){
        long ans=1;
        while(n>0){
            if(n%2==1){
                ans= ans * x;
            }
            x = x * x;
            n = n/2;
        }
        return  ans;
    }


    public static void main(String[] args) {
         System.out.println(power(3,5 ));
    }
}
