public class binomialFuction {

    // Factorial Number  function
public static int factNumber(int n){
    int fact=1;
    for(int i=1;i<=n;i++){
        fact=fact*i;
    }
    return fact;
}

// Binomial Number Function

public static int binCoff(int n, int r){
    int fac_n=factNumber(n);
    int fac_r=factNumber(r);
    int fac_nmr=factNumber( n-r);
    int bincoff= fac_n / (fac_r * fac_nmr);
    
return bincoff;
}

// Main Function
    public static void  main(String args[]){
    System.out.println(factNumber(5));// cll by factorial number 
        System.out.println(binCoff( 5, 2));//Call by BinomialCofficient 
    }
}
