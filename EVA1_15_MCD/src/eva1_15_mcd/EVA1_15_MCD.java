package eva1_15_mcd;

public class EVA1_15_MCD {

    public static void main(String[] args) {
        System.out.println("El maximo comun divisor es: "+mcd(11, 180)); 
    }
    
    public static int mcd (int dividendo, int division){
       
        int modulo= dividendo%division;
        int resu= dividendo/division;
        if (modulo==0){
            return division;
            
        }
        return mcd(division, modulo);
    }
    
    
    
}