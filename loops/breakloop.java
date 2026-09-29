package loops;

import java.util.Scanner;

public class breakloop {
    public static void main(String[] args){

// basic break
        // for(int i=1;i<=10;i++){
        //     if(i==3){
        //         break;
        //     }
        //     System.out.println(i);
        // }
        // System.out.println("i am out of the loop");

// keep entering numbers until user enters a multiple of 10
        Scanner sc = new Scanner(System.in);
        do{
            int n = sc.nextInt();
            if(n%10==0){
                break;
            }
            System.out.println(n);
        }while(true);
        System.out.println("i am out of the loop");
    }
    
}
