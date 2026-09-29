package conditions;
import java.util.*;
public class Bonjour {
    public static void main(String[] aregs){
        Scanner sc = new Scanner(System.in);
        int button = sc.nextInt();

        //if(button==1){
          //  System.out.println("Hello");
        //}else if(button==2){
          //  System.out.println("Namaste");
        //}else if(button==3){
          //  System.out.println("Bounjour");
        //}else{
          //  System.out.println("invalid");
        //}
        switch(button){
            case 1 : System.out.println("Hello");
            break;
            case 2 : System.out.println("Namaste");
            break;
            case 3 : System.out.println("Bounjour");
            break;
            default : System.out.println("invalid");
        }
    }
    
}
