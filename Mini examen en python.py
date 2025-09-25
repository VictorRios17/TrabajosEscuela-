

numeros = [] 

for i in range(10):
    entrada_usuario = input("Ingresa el número " + str(i + 1) + ": ")
    numero = int(entrada_usuario)
    numeros.append(numero)

print("El arreglo de números es:", numeros)