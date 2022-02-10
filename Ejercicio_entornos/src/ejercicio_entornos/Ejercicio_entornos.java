package ejercicio_entornos;

/**
 *Clase test de programas de opración.
 * @author Eloy Beltrán
 */
public class Ejercicio_entornos {
/**
 * Metodo multiplica multiplica a por b
 * @param a primer número introducido
 * @param b segundo número introducido
 * @return resultado de la multiplicación
 */
    public static int multiplica(int a, int b) {
        return a * b;

    }
/**
 * Metodo factorial multiplica todos los numeros que introduzcan.
 * @param a numero número el cual le vas 
 * @return La multiplcación de todos los número introducidos.
 */
    public static int factorial(int a) {
        int factorial = a;
        for (int i = (a - 1); i > 1; i--) {
            factorial = factorial * i;
        }
        return factorial;
    }

    /**
     * @param args Argumentos de linea de comandos
     */
    public static void main(String[] args) {
        

    }

}
