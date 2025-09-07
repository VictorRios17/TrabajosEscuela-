let r = 3, c = 3;

let TwoDArr = [
  [1, 2, 3],
  [4, 5, 6],
  [7, 8, 9]
];

let arr = new Array(r * c);
let k = 0;


for (let i = 0; i < r; i++) {
  for (let j = 0; j < c; j++) {
    arr[k++] = TwoDArr[i][j];
  }
}

console.log("Los elementos del array bidimensional son:");
for (let i = 0; i < r; i++) {
  console.log(TwoDArr[i].join(" "));
}

console.log("\nLos elementos del array unidimensional son:");
console.log(arr.join(" "));
