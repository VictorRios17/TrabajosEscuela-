
#include <iostream>
using namespace std;

int main()
{
   int numeros[] = {1, 3, 5 , 7, 9};
   int buscando = 7;
   bool encontrado = false;
   
   for (int num : numeros) {
       if (num == buscando){
           encontrado = true;
           break;
       }
   }
   if (encontrado)
     cout << "Numero encontrado" << endl;
   else
     cout << "Numero no encontrado" << endl;
    
    return 0;
}