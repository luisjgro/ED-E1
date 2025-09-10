package eva1_3_heap;

public class EVA1_3_HEAP {

    public static void main(String[] args) {
       int x=5;
        Ejemplo try1 = new Ejemplo();
        Ejemplo try2 = new Ejemplo();
        System.out.println("x: "+x);
        System.out.println("Ejemplo: "+try1);
        System.out.println("Ejemplo 2:"+try2);
        System.out.println("Ejemplo 1 valor= "+try1.valor);
      try1=null;
      try2=null;
    }
    
}

class Ejemplo{
    int valor=10;
}
