import java.util.Scanner;
public class gcd {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        int min = 0;

        if(a<b) {
            min = a;

        }else {
            min = b;
        }

        for (  int i = min ; i>=1; i--) {
            
            if(a%i==0 && b%i == 0) {
                System.out.println(i);
                break;
            }
        }
    }

    
}