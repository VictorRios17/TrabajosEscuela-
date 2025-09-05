#include <iostream>
#include <vector>
using namespace std;

int main() {
    vector<int> numeros = {1, 3, 5};
    int nuevo;

    cout << "Ingrese un número a insertar al inicio: ";
    cin >> nuevo;

    numeros.insert(numeros.begin(), nuevo); // inserta en la primera posición

    cout << "Arreglo actualizado: ";
    for (int num : numeros) {
        cout << num << " ";
    }
    cout << endl;

    return 0;
}
