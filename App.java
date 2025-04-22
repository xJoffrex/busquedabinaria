import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int cantidad = -1; 


        while (cantidad <= 0) {
            System.out.print("Ingrese la cantidad de personas: ");
            cantidad = scanner.nextInt();
            scanner.nextLine();
        }

        Persona[] personas = new Persona[cantidad];


        for (int i = 0; i < cantidad; i++) {
            System.out.println("Ingrese Persona:");
            System.out.print(" Nombre: ");
         

            String nombre = scanner.nextLine();

            int edad = -1; 
            while (edad < 0) {
                System.out.print(" Edad: ");
                edad = scanner.nextInt();
                scanner.nextLine();  
                if (edad < 0) {
                    System.out.println(" La edad no puede ser negativa");
                }
            }

            personas[i] = new Persona(nombre, edad);
        }

  
        MetodoInsercion.ordenarPorEdad(personas);

        System.out.print("Valor de la persona de la edad: ");
        int edadBuscada = scanner.nextInt();

        int indiceEncontrado = BusquedaBinaria.buscarPersonaPorEdad(personas, edadBuscada);

        if (indiceEncontrado != -1) {
            System.out.println("La persona con la edad " + edadBuscada + " es " + personas[indiceEncontrado].getNombre());
        } else {
            System.out.println("No se encontro una persona con la edad " + edadBuscada);
        }
        scanner.close();
    }
}
