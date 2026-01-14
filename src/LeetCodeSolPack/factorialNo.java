package LeetCodeSolPack;

import java.math.BigInteger;

class factorialNo {
   
    public BigInteger factorial(int num) {
       BigInteger factorial=BigInteger.ONE;
       for(int i =1; i <=num;i++)
       {
           factorial = factorial.multiply(BigInteger.valueOf(i));
       }

       return factorial;
    }
    public static void main(String[] args) {
          factorialNo fact = new factorialNo();
          System.out.println(fact.factorial(15));

     }
}
       
                                               