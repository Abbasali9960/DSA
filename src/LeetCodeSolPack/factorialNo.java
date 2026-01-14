package LeetCodeSolPack;

class factorialNo {
   
    public int factorial(int num) {
       int factorial=1;
       for(int i =1; i <=num;i++)
       {
           factorial = factorial*i;
       }

       return factorial;
    }
    public static void main(String[] args) {
          factorialNo fact = new factorialNo();
          System.out.println(fact.factorial(3));

     }
}
       
                                               