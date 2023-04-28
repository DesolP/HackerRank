import java.io.*;
import java.math.BigInteger;
import java.util.*;

public class InnerPrivate {
    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        InnerPrivate innerPrivate = new InnerPrivate();
        InnerPrivate.Inner inner = innerPrivate.new Inner();
        BigInteger num = sc.nextBigInteger();
        inner.powerof2(num);
    }

    private class Inner {

        public void powerof2(BigInteger num) {
            BigInteger copy = num;
            BigInteger remainder = num.remainder(BigInteger.valueOf(2));
            while(!num.equals(BigInteger.valueOf(1))){

                if(num.equals(BigInteger.valueOf(1))){
                    System.out.println(copy + " is the power of 2");
                    System.out.println("An instance of class: Solution.Inner.Private has been created");
                    break;
                }
                //System.out.println(remainder);
                if(!remainder.equals(BigInteger.valueOf(0))){
                    System.out.println(copy + " is not the power of 2");
                    System.out.println("An instance of class: Solution.Inner.Private has been created");
                    break;
                }
                num = num.divide(BigInteger.valueOf(2));
                remainder = num.remainder(BigInteger.valueOf(2));
            }

        }

    }
}
