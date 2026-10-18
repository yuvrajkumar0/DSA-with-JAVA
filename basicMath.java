public class basicMath{
    public static void main(String [] args){
        int n = 7789;
        int last_degit;
        int count=0;
        while(n>0){
            last_degit = n%10;
            count= count+1;

            System.out.println(last_degit);
            n = n / 10;

        }
        System.out.println("your number of element is: " + count);
    }
}