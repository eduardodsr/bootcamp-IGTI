var soma = 4 + 2;
var subtracao = 5 - 3;
var multiplicacao = 5 * 3;
var divisao = 20 / 4;
var resto = 20 % 3;
console.log("soma: "+soma)
console.log("subtracao: "+subtracao)
console.log("multiplicacao: "+multiplicacao)
console.log("divisao: "+divisao)
console.log("resto: "+resto)

var incremento = 1;
// incremento = incremento + 1;
incremento ++;
console.log("incremento: " + incremento);

var decremento = 5
// decremento = decremento - 1;
decremento --;
console.log("decremento: " + decremento);

var atribuicaoComAdicao = 5;
// o mesmo que a = a + 6
atribuicaoComAdicao += 6; 
console.log("atribuicaoComAdicao: " + atribuicaoComAdicao);

var atribuicaoComSubtracao = 10;
// o mesmo que a = a - 4
atribuicaoComSubtracao -= 4; 
console.log("atribuicaoComSubtracao: " + atribuicaoComSubtracao );

var a = 4;
var b = 5;
var adicaoIncrementoPosterior = a + b++;
console.log("adicaoIncrementoPosterior: " + adicaoIncrementoPosterior);

var c = 5;
var d = 6;
var adicaoIncrementoAnterior = c + ++d;
console.log("adicaoIncrementoAnterior : " + adicaoIncrementoAnterior);