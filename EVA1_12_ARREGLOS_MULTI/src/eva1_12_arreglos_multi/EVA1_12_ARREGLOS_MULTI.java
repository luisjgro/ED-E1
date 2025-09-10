package eva1_12_arreglos_multi;

public class EVA1_12_ARREGLOS_MULTI {

    public static void main(String[] args) {
        int [][] arreglos= new int [5][3];
        arreglos[0][0]=100;
        System.out.println(arreglos.length);
        System.out.println(arreglos[0].length);
        System.out.println(arreglos[1].length);
        System.out.println(arreglos[2].length);
        System.out.println(arreglos[3].length);
        System.out.println(arreglos[4].length);
        
        
        int [][] datos= new int [3][];
        
        datos[0]=new int [10];
        datos[1]=new int [5];
        datos[2]=new int [1];
        
        for (int i = 0; i < datos.length; i++) {
            for (int j = 0; j < datos[i].length; j++) {
                datos[i][j]=(int)(Math.random()*100);
            }
        }
        
        
        for (int i = 0; i < datos.length; i++) {
            for (int j = 0; j < datos[i].length; j++) {
                System.out.print("["+datos[i][j]+"]");
                System.out.print("");
            }
                            System.out.println("");
        }
                
    }
    
}