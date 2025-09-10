package eva1_13_falso_for;

public class EVA1_13_FALSO_FOR {

    public static void main(String[] args) {
        falsoFor(5);//5-4-3-2-1
        System.out.println("");
        falsoForUp(10,1);
    }
    
    public static void falsoFor(int val){
        System.out.print(val+"-");
       if(val>1) falsoFor(val-1);
    }
    
    
    public static void falsoForUp(int val, int start){
       
         
        System.out.print(start+"-");
              
        
        
        if(start<val) {
                  falsoForUp(val,start+1);
              }
    }
}
