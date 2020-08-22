var carros = ["GOL", "PALIO", "UNO"];
console.log (carros);

console.log("primeira posicao: " + carros[0]);
console.log("segunda posicao: " + carros[1]);
console.log("terceira posicao: " + carros[2]);

// outra forma passar o resultao para uma variavel

var primeiroCarro = carros[0];
var segundoCarro = carros[1];
var terceiroCarro = carros[2];
var quartoCarro = carros[3]; // imprime undefined

console.log(primeiroCarro);
console.log(segundoCarro);
console.log(terceiroCarro);
console.log(quartoCarro);

// trocar terceiroCarro no arrey (lista)
// troca de "UNO" para "ARGO"
carros[2] = "ARGO"
console.log("Troca do terceiroCarro: " + carros[2]);

// tamanho do array
console.log("tamanho do array: " + carros.length);

// imprime o ultimo carro do array (lista de carros)
console.log("ultimo carro do array: " + carros[carros.length - 1])

// uma forma de adicionar um novo elemento no array (lista de carros)
carros[3] = "SANDERO";
console.log(carros[carros.length - 1])

// outra forma de adicionar um novo elemento no array (lista de carros)
carros[carros.length] = "FIT";
console.log(carros[carros.length - 1])

// utilizando push, adicionar um novo elemento no array (lista de carros)
carros.push("POLO");
// Imprime todos os carros do Array:
console.log(carros);

