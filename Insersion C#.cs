using System;
using System.Collections.Generic;

class Program {
    static void Main() {
        List<int> numeros = new List<int>() {1, 3, 5};

        Console.Write("Ingrese un número a insertar al inicio: ");
        int nuevo = int.Parse(Console.ReadLine());

        numeros.Insert(0, nuevo); // inserta en la posición 0

        Console.WriteLine("Arreglo actualizado: " + string.Join(", ", numeros));
    }
}
