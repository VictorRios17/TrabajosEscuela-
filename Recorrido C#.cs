
using System;
class Recorrido  {
  static void Main() {
 int[] numeros = {10, 20, 30, 40, 50};

        Console.WriteLine("Recorriendo");
        foreach (int numero in numeros) {
            Console.WriteLine(numero);
        }
  }
}