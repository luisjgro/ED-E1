package eva1_14_factorial;

public class EVA1_14_FACTORIAL {

    public static void main(String[] args) {
        System.out.println(factorial(7));
        
    }
    
    
    public static int factorial(int valor){
        if(valor==0){
            return  1;
    }else{
            return valor*factorial(valor-1);
        }  
    }
}
