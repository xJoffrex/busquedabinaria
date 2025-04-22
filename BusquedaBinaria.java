public class BusquedaBinaria {
    public static int buscarPersonaPorEdad(Persona[] personas, int edad) {
        int bajo = 0;
        int alto = personas.length - 1;

        while (bajo <= alto) {
            int centro = (bajo + alto) / 2;
            int valorCentro = personas[centro].getEdad();

  
            for (int i = bajo; i <= alto; i++) {
                System.out.print(personas[i].getEdad());
                if (i < alto) {
                    System.out.print(" | ");
                }
            }
            System.out.println();
            System.out.println("bajo=" + bajo + " alto=" + alto + " centro=" + centro + " valorCentro=" + valorCentro);

            if (valorCentro == edad) {
                System.out.println("--> encontrada");
                return centro;
            } else if (valorCentro < edad) {
                System.out.println("--> derecha");
                bajo = centro + 1;
            } else {
                System.out.println("--> izquierda");
                alto = centro - 1;
            }
        }

        return -1;
    }
}
