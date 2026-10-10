package functions;

public class FuncOverload {

// sum of 2 numbers
    public static int sum(int a, int b){
        return a+b;
    }

//sum of 3  numbers
    public static int sum(int a, int b, int c){
        return a+b+c;
    }

    public static void main(String [] args){
        System.out.println(sum(2,3));
        System.out.println(sum(2,3,4));
    }
}
