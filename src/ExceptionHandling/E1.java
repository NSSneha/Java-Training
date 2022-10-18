package ExceptionHandling;

// try and catch is used to handle exception handling
public class E1 {
    public static void main(String[] args) {
       /* int p = 10;
        int q = 2;
        int k = p/q;
        System.out.println(k); //ans = 5   */

        // infinity is not allowed in java
        int i,j,k = 0;
        try {
             i = 10;
             j = 0;
             k = i / j;
            int[] numbers = {1,2,3,4,5,6};
            System.out.println(numbers[7]);
            System.out.println("Exiting the code//Releasing the memory");//this will not work as the exception abruptly stops the execution once exception is met
        }
        catch (ArithmeticException e) { //another method to write catch (Exception e)
            System.out.println("Invalid division");
        }
        catch (ArrayIndexOutOfBoundsException e){ //multiple catch statements
            System.out.println("Invalid limit for the array");
        }
        finally {
            System.out.println("Exiting the code//Releasing the memory");
        }
        System.out.println(k);
    }
}
