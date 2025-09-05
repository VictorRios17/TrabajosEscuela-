import java.util.ArrayList;
import java.util.Scanner;

public class Incercion  {
    public static void main(String[] args) {
        ArrayList<Integer> numeros = new ArrayList<>();
        numeros.add(1);
        numeros.add(3);
        numeros.add(5);

        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese un número a insertar al inicio: ");
        int nuevo = sc.nextInt();

        numeros.add(0, nuevo); // inserta en la posición 0

        System.out.println("Arreglo actualizado: " + numeros);
        sc.close();
    }
}
