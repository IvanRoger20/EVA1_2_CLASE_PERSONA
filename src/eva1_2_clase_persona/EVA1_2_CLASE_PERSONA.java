
package eva1_2_clase_persona;

public class EVA1_2_CLASE_PERSONA {

    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Hola mundo");
        Persona estudiante = new Persona();
        estudiante.id = "21550379";
        estudiante.nombre = "Juan Perez Jolote";
        estudiante.edad = 18;
        estudiante.imprimirDatos();
        System.out.println("Año de nacimiento: " + estudiante.calcularAnioNacimiento());
        
        Persona estudiante2 = new Persona();
        estudiante2.nombre = "Ruben";
        estudiante2.id = "112133";
        estudiante2.edad = 40;
        estudiante2.imprimirDatos();
        System.out.println("Año de nacimiento: " + estudiante2.calcularAnioNacimiento());
        
        Persona estudiante3 = new Persona();
        estudiante3.nombre = "Pedro";
        estudiante3.id = "12412334";
        estudiante3.edad = 30;
        estudiante3.imprimirDatos();
        System.out.println("Año de nacimiento: " + estudiante3.calcularAnioNacimiento());
    }

}

class Persona {

    String id;
    String nombre;
    int edad;
    
    void imprimirDatos() {
        
        System.out.println("El nombre es: " + nombre);
        System.out.println("Su id es: " + id);
        System.out.println("Su edad es: " + edad);  
        
    }
    
    int calcularAnioNacimiento() {
        
        int anioNac = 2022 - edad;
        return anioNac;
        
    }
}
