package eva1_8_copia_arreglos;

public class EVA1_8_COPIA_ARREGLOS {

    public static void main(String[] args) {
        int [] arreglo= new int [10];
        int [] copia_arreglo= new int[arreglo.length];
        
        llenar(arreglo);
        imprimir(arreglo);
        System.out.println(arreglo);
        System.out.println("    ");
        System.out.println("COPIA");
        System.out.println("    ");
        
        copiarArreglo(arreglo, copia_arreglo);
        imprimirCopia(copia_arreglo);
        System.out.println(copia_arreglo);
       
    }
    
     public static void llenar (int[] datos){
        
        for (int i = 0; i < datos.length; i++) {
            datos[i]= (int) (Math.random()*100);
        }
    }
    
    
    public static void imprimir (int[] datos){
        for (int i = 0; i <datos.length; i++) {
            System.out.print("["+datos[i]+"]");
        }
        System.out.println("");
    }
    
    
    public static void copiarArreglo(int[] datos, int[] datos_copia){
        for (int i = 0; i < datos.length; i++) {
            datos_copia[i]=datos[i];
        }
    
        
        
}
    
    public static void imprimirCopia (int[] datos_copia){
        for (int i = 0; i <datos_copia.length; i++) {
            System.out.print("["+datos_copia[i]+"]");
        }
        System.out.println("");
    }
    
}
