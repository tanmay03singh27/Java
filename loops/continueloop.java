package loops;
import java.util.*;
// this is used to skip n iteration

public class continueloop {
    public static void main(String[] args){
        // for(int i=1;i<=10;i++){
        //     if(i==3){
        //         continue;
        //     }
        //     System.out.println(i);
        // }
// Display all numbers entered by user except multiples of 10
        Scanner sc = new Scanner(System.in);
        do{
            int n = sc.nextInt();
            if(n%10==0){
                continue;
            }
            System.out.println(n);
        }while(true);

    }

    
}
