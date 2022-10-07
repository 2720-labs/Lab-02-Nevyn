import java.util.*;
    
    public class Lab2{
        
        static int add(int a, int b){
            int sum = a + b;
            return sum;
        }

        static int subtract(int a, int b){
            int diff = a - b;
            return diff;
        }

        static int multiply(int a, int b){
            int prod = a * b;
            return prod;
        }
        
        
        public static void main(String[] args){
            Scanner in = new Scanner(System.in);
            System.out.println("Enter first number: ");
            int a = in.nextInt();
            System.out.println("Enter second number: ");
            int b = in.nextInt();
            int sum = add(a,b);
            int diff = subtract(a, b);
            int prod = multiply(a, b);

            System.out.println(a + " + " + b + " = " + sum);
            System.out.println(a + " - " + b + " = " + diff);
            System.out.println(a + " * " + b + " = " + prod);
    }
}