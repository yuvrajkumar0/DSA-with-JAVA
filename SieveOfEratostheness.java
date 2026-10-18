public class SieveOfEratostheness{
    public static void main(String[] args){
        int n = 50;
        boolean[] isPrime = new boolean[n+1];
        for(int i=2; i<50; i++){
            isPrime[i]=true;
        }
        for(int i=2; i*i<n; i++){
            if(isPrime[i]){
                for(int j= i* i; j<n; j=j+i){
                    isPrime[j]=false;
                }
            }
        }
        for(int i=2; i<n;i++){
            if(isPrime[i]){
                System.out.print(i+ " ");
            }
        }
    }
}