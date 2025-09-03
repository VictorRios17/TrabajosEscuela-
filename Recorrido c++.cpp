
#include <iostream>
using namespace std;
int main() {
    int numeros[] = {10, 20, 30, 40, 50};

    cout << "Recorriendo" << endl;
    for (int numero : numeros) {
        cout << numero << endl;
    }

    return 0;
}