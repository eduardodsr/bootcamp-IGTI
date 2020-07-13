// node.js - calculadora
// console.log(process.argv);

var operacao = process.argv[2]; // 'soma', 'subtracao', etc.
var num1 = parseInt(process.argv[3]); // '4'
var num2 = parseInt(process.argv[4]); // '3'
var resultado = 0;

// switch

switch (operacao){
    case "soma":
        resultado = num1 + num2;
        break;
    case "subtracao":
            resultado = num1 - num2;
        break;
    case "multiplicacao":
            resultado = num1 * num2;
        break;
    case "divisao":
            resultado = num1 / num2;
        break;
    case "resto":
        resultado = num1 % num2;
        break;
    case "porcetagem":
        resultado = num1 * num2 / 100;
        break;   
    default: 
        resultado=0;
}

console.log(resultado);
// Por exemplo, no terminal digitar o seguinte comando:
// node calculadora.js soma 30 20
// node calculadora.js subtracao 30 20
// node calculadora.js divisao 10 2