import java.util.*;
public class Prime_number {

    public static void main(String[] args) {
        System.out.println("Eneter a number to check number is a Prime or not ");

        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int k=0;

        for (int i = 1; i <=a; i++) {
            if (a%i==0){
                    k=k+1;
            }
        }
            if (k==2){
                System.out.println("The number is a prime number");
            }
            else{
                System.out.println("The number is a not a Prime number");
            }
    }
}
