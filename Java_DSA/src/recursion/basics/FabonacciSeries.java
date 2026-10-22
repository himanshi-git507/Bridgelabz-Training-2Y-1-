package recursion.basics;

public class FabonacciSeries {
    public static int fib(int n){
       if(n==0 || n==1){
           return n;

       }
       int small1 =fib(n-1);
       int small2 = fib(n-2);
       return small1+small2;

   }
   public static void main(String[]args){
       System.out.println(fib(9));
   }
}
