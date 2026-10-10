package functions;
 
public class binCoeff {
    public static int bincoeff(int n, int r){
        int fact_n = factorial.factorial(n);
        int fact_r = factorial.factorial(r);
        int fact_nmr = factorial.factorial(n-r);

        int  bincoeff = fact_n/(fact_r*fact_nmr);
        return bincoeff;
    }
    public static void main(String[] args){
        System.out.println(bincoeff(5,2));
    }
}
