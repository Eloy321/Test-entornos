package ejercicio.entornos;

/**
 * Clase EjercicioEntornos suma.
 *
 * @author elolop
 */
public class EjercicioEntornos {

    /**
     * Método principal
     *
     * @param args Argumento de linea de comandos
     */
    public static void main(String[] args) {
        int x = suma(1, 8);
        System.out.println(x);
    }

    /**
     * Método suma para que sume dos números
     *
     * @param a Primer número a sumar
     * @param b Segundo número a explicar
     * @return Devuelve el resultado de la suma
     */
    public static int suma(int a, int b) {
        return a + b;
    }

}
