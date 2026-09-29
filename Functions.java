import java.util.*;

public class Functions {
    // public static int calculateSum(int a, int b){
    //     int sum = a + b;
    //     return sum;
    // }
    // public static int calculateProduct(int a, int b){
    //     return a*b;
    // }
    public static void printFactorial(int n){
        int factorial = 1;

        for(int i=n; i>=1; i--){
            factorial = factorial * i;
        }

        System.out.println(factorial);
        return;  //return is not nneeded when the return type is void
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
       
       
        printFactorial(n);
    }
    // public static void printMyName(String name){
    //     System.out.println(name);
    //     return;
    // }
    // public static void main(String[] args){
    //     Scanner sc = new Scanner(System.in);
    //     String name = sc.next();
    //     printMyName(name);  // calling the function
    // }
    
}
