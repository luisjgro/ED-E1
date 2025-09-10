package eva1_17_numero_primo;

public class EVA1_17_NUMERO_PRIMO {

    public static void main(String[] args) {       
        int num=20;
        
        System.out.print("su numero ");
         if(verificarPrimoNoEficiente(num)==true){
             System.out.print("es primo");
             System.out.println("");
         }else{
             System.out.print("no es primo");
             System.out.println("");
         }  
    }
    
    
    public static boolean verificarPrimoEficiente(long num){
       
        if(num<=1){
            return false;
        }
        
        for (int i = 2; i < Math.sqrt(num); i++) {
            if(num%i==0){
                return false;
            }
        }
        
        return true; 
    }
    
    public static boolean verificarPrimoNoEficiente(long num){
     
        if (num<=1){
            return false;
        }
        
        for (int i = 2; i < num-1; i++) {
            if(num%i==0){
                return false;
            }
            
        }
            return true;
        
    }
}
