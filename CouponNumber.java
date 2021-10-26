

import java.util.*;
    public class CouponNumber {

        void couponGenerator(int number) {
            int randomCouponNumber;
            int index=0;
            int[] duplicateArray=new int[number];
            int[] distinctArray=new int[number];
            int previousCouponNumber;
            Random ran=new Random();
            for(int i=0;i<number;i++) {
                duplicateArray[i]=ran.nextInt(99999)+10000;
            }


            System.out.println("Distinct coupon Numbers are");
            for(int i = 0; i < number; i++)
                System.out.print("  "+ duplicateArray[i] );
            }



        public static void main(String[] args) {
            Scanner inp=new Scanner(System.in);
            CouponNumber rv = new CouponNumber();
            System.out.println("Enter The Value of N For N Distinct Coupon Number");
            int number=inp.nextInt();
            rv.couponGenerator(number);


        }
    }
