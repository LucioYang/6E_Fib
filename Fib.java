/**
  Calculate Fibonacci number n
  3 implementations
  @precondition: n >= 1

  Use type "long" instead of "int", because rabbits.
 */

public class Fib {
    /**
      @return the nth Fibonacci number
              by implementing the recurrence relation
     */
    public static long fib_recurrence( int n) {
      if (n <= 1)
        return n;
      return fib_recurrence(n-1) + fib_recurrence(n-2);
    }
     /* These are class methods because they are designed to be shared among all Objects created from the same class
    */


    /**
      @return the nth Fibonacci number
              calculated via the 8th-grade algorithm
     */
     public static long fib_grade8( int n) {
       if (n <= 2) return 1;
       if (n > 2) {
         int current = 1;
         int previous = 1;
         for (int i = 2; i < n; i++) {
           int temp = current;
           current = current + previous;
           previous = temp;
         }
         return current;
       }
       return -2;
     }
    /* Time complexity:
       Consider the size of the problem to be n

       As the proxy for the time required, count the number of loops that must occur until the result is returned

       Then cost of the the recurrence algorithm
       grows linearly
       as the size of the problem increases,
       because every time n is increases by 1, the number of loops also increases by 1
     */


    /**
      @return the nth Fibonacci number
              calculated via Binet's formula.
              Type is double so that this exercise can
              ignore rounding issues.
     */
    public static double fib_Binet( int n) {
      return ((1 / Math.sqrt(n)) * (Math.pow(((1 + Math.sqrt(5)) / 2), n) - Math.pow(((1 - Math.sqrt(5)) / 2), n)));
    }
    /* Time complexity:
       Consider the size of the problem to be n

       As the proxy for the time required, count the number of implementation that must be made to calculate the result

       Then cost of the the recurrence algorithm
       grows constant
       as the size of the problem increases,
       because the number of calculations does not depend on n
     */
}
