package eva1_16_fibonacci;

public class EVA1_16_FIBONACCI {

    public static void main(String[] args) {
        System.out.println(fibon(6));
    }
    
    
    public static  int fibon (int posi){
   
        if (posi==0||posi==1){
            return 1;
        }else{
            return fibon(posi-2)+ fibon( posi-1);
        }
        
    }
}
