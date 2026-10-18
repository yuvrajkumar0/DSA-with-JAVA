public class palindromeNo{
    public static void main(String[] args){
        int x =353;
       int original = x;
         int reverseNo = 0;
        while(x>0){
            int degit = x % 10;
            reverseNo = reverseNo * 10 + degit;
            x = x/10;
        }
        if(original == reverseNo){
            System.out.println("This number is Palindrome");

        }else{
              System.out.println("This number is not Palindrome");
        }
    }
}