const readline = require("readline");

const rl = readline.createInterface({
  input: process.stdin,
  output: process.stdout
});

let numeros = [1, 3, 5];

rl.question("Ingrese un número a insertar al inicio: ", (input) => {
  let nuevo = parseInt(input);

  numeros.unshift(nuevo); // inserta al inicio

  console.log("Arreglo actualizado:", numeros);

  rl.close();
});
