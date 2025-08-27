/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva1_7_arreglos;

/**
 *
 * @author invitado
 */
public class EVA1_7_ARREGLOS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int[] arreglo = new int [3];
        arreglo[0] = 100;
        arreglo[1] = 200;
        arreglo[2] = 300;
        System.out.println(arreglo);
        imprimir(arreglo);
        
        arreglo = new int[2];
        System.out.println(arreglo);
        imprimir(arreglo);
    }
    
    public static void llenar (int[] datos){
    for(int i = 0; i < datos.length; i++){
        datos[i] = (int) (Math.random() * 100);
    }
}
public static void imprimir (int[] datos){
    for(int i = 0; i < datos.length; i++){
        System.out.println("[" + datos[i] + "]");
    }
    System.out.println("");
}
    
}
