public class MetodoInsercion {
    public static void ordenarPorEdad(Persona[] personas) {
        for (int i = 1; i < personas.length; i++) {
            Persona key = personas[i];
            int j = i - 1;
            while (j >= 0 && personas[j].getEdad() > key.getEdad()) {
                personas[j + 1] = personas[j];
                j = j - 1;
            }
            personas[j + 1] = key;
        }
    }
}
