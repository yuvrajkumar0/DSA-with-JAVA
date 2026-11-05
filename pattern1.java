import java.util.*;
public class pattern1 {
    public void pattern(){
        Scanner sc = new Scanner(System.in);
        System.out.print("gime me size of * ");
        int n = sc.nextInt();
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                System.out.print(" * ");

            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
          pattern1 pt = new pattern1();
          pt.pattern();
    }
}

