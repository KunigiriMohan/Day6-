import java.util.*;
public class Perfect_Number {
    public static void main(String[] args) {

        System.out.println("Enter a number that we need to find Perfect or not ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int a=0;



        for (int i=1;i<=num-1;i++) {
            if (num % i == 0) {
                a = a + i;
            }
        }
            if ( a == num ){
                System.out.println("The Given number is a Perfect Number");
            }
            else
            {
                      System.out.println("The number is not a perfect number ");
            }
            }
}
