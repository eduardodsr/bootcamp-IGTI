// node.js - calculadora
// console.log(process.argv);

var operacao = process.argv[2]; // 'soma', 'subtracao', etc.
var num1 = parseInt(process.argv[3]); // '4'
var num2 = parseInt(process.argv[4]); // '3'
var resultado = 0;

// if e else
if (operacao === "soma"){
    resultado = num1 + num2;
} else if (operacao === "subtracao"){
    resultado = num1 - num2;
} else if (operacao === "multiplicacao"){
    resultado = num1 * num2;
} else if (operacao === "divisao"){
    resultado = num1 / num2;
} else if (operacao === "resto"){
    resultado = num1 % num2;
} else if (operacao === "porcetagem"){
    resultado = num1 * num2 / 100;
}
console.log(resultado);
// Por exemplo, no terminal digitar o seguinte comando:
// node calculadora.js soma 30 20
// node calculadora.js subtracao 30 20
// node calculadora.js divisao 10 2
