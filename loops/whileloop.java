package loops;
import java.util.*;

public class whileloop {
    public static void main(String[] args){
// basic while loop
        // Scanner sc = new Scanner(System.in);
        // int counter = 0;
        // while(counter<100){
        //     System.out.println("Hello World");
        //     counter++; 
        // }

// while loop to print numbers from 1 to n
        // Scanner sc = new Scanner(System.in);
        // int range = sc.nextInt();
        // int counter = 1;

        // while(counter<=range){
        //     System.out.print(counter+" ");
        //     counter++;
        // }
        // System.out.println();

// print sum of first n natural numbers
        // Scanner sc = new Scanner(System.in);
        // int n = sc.nextInt();
        // int sum = 0;

        // int i = 1;
        // while(i<=n){
        //     sum +=i;
        //     i++;
        // }
        // System.out.println(sum);

// print reverse of a number
        // int n = 10899;
        // while(n>0){
        //     int lastdigit = n%10;
        //     System.out.print(lastdigit);
        //     n = n/10;
        // }
// reverse the given number
        int n = 10899;
        int rev = 0;

        while(n>0){
            int lastdigit = n % 10;
            rev = (rev*10) + lastdigit;
            n = n/10;

        }
        System.out.println(rev);
    }
    
}
