package conditions;

public class largestof3 {
    public static void main(String[] args){
        int A=3;int B=6;int C=19;

        if((A>=B)&&(A>=C)){
            System.out.println("largest is A");
        }
        else if(B>=C){
            System.out.println("Largest is B");
        }
        else{
            System.out.println("largest is C");
        }
    }
    
}
