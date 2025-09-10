package eva1_11_copia_arreglo_obj;

public class EVA1_11_COPIA_ARREGLO_OBJ {

    public static void main(String[] args) {
        Persona [] perso1= new Persona[2];
        perso1 [0]= new Persona("Juan", "Perez");
        System.out.println(perso1[0]);
        perso1[1]= new Persona("Aletz", "Ibarra");
        System.out.println(perso1[1]);
        imprimir(perso1);
        Persona [] respaldo= new Persona [perso1.length];
        respaldo[0]= new Persona();
        System.out.println(respaldo[0]);
        respaldo[1]= new Persona();
        System.out.println(respaldo[1]);
                
        copyArrayOfClasses(perso1,respaldo);
        imprimir(respaldo);
    }
    
    public static void copyArrayOfClasses(Persona[] origen, Persona[] copia){
        for (int i = 0; i < origen.length; i++) {
            copia[i].setNombre(origen[i].getNombre());
            copia[i].setApellido(origen[i].getApellido());
            
        }
        
    }
    
    public static void imprimir (Persona[] datos){
        for (int i = 0; i <datos.length; i++) {
            System.out.print("          "+datos[i].getNombre()+", "+datos[i].getApellido());
        }
        System.out.println("");
    }
}

class Persona {
private String nombre;
private String apellido;

    public Persona(String nombre, String apellido) {
        this.nombre = nombre;
        this.apellido = apellido;
    }
    
    public Persona() {
        
    }


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }



}
