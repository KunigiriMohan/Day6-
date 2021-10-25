import java.util.*;
public class Fibonacci_Series {

    public static void main(String[] args) {
        Fibonacci_Series object = new Fibonacci_Series();
        object.fibonacci();


    }
        void fibonacci()
        {
            int n1=0,n2=1,n3=0,i;
            System.out.println("Enter a number upto which we need find Fibonaccii series");
            Scanner sc = new Scanner(System.in);
            int count = sc.nextInt();
            System.out.println(n1);
            System.out.println(n2);

            while( n3 <= count)
            {
                System.out.println(n3);
                n3=n1+n2;
				/*if (n3 <= count)
				{*/
                /*System.out.println(n3);*/
                n1=n2;
                n2=n3;
                /*}*/

            }
        }

}
