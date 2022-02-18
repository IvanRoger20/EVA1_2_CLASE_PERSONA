
package eva1_2_clase_persona;

public class EVA1_2_CLASE_PERSONA {

    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Hola mundo");
        Persona estudiante = new Persona();
        estudiante.id = "21550379";
        estudiante.nombre = "Juan Perez Jolote";
        estudiante.edad = 18;
    }

}

class Persona {

    String id;
    String nombre;
    int edad;
    
    
}
