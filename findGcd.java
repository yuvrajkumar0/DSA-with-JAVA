public class findGcd{
    public int gcd(int a, int b){
        while(a>0 && b>0){
        if(a>b){
            a = a % b;
        }else{
            b = b % a;
        }
      }
      if(a==0){
        return b;
      }
      return a;
       }
        public static void main(String[] args){
        findGcd obj = new findGcd();
        System.out.println(obj.gcd(20,28));
    }
}