package PacoteExemplo;

import java.math.*;
import java.util.*;

public class ClasseAula3_7Calculadora {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		char operacao = ' ';
		double n1 = 0, n2 = 0, resultado=0;
		
		Scanner entradaDados = new Scanner(System.in);
		
		System.out.println("********** Calculadora **********");
		
		System.out.println("Digite o valor do primeiro número: ");
		n1 = entradaDados.nextInt(); // entrada de dados para tipo inteiro
		
		System.out.println("Digite o valor do segundo número: ");
		n2 = entradaDados.nextInt(); // entrada de dados para tipo inteiro
		
		entradaDados.nextLine(); // Limpar o buffer de mémoria do programa. Para não dar ERRO no JAVA, conflito de entrada de dados (SCANNER) do tipo STRING com o tipo CHAR.
		
		System.out.println("Digite a operação matemática desejada ( + , - , * , / , % ): ");
		
		operacao = entradaDados.nextLine().charAt(0);  // entrada de dados para tipo char
		// operacao é uma variavel do tipo char, ou seja, aceita somente um caractere digitado para entrada de dados.
		
		switch (operacao) {
			case '+':
				resultado = n1 + n2;
				break;				
			case '-':
				resultado = n1 - n2;
				break;
			case '/':
				resultado = n1 / n2;
				break;
			case '*':
				resultado = n1 * n2;
				break;
			case '%':
				resultado = n1 % n2;
				break;
			default: 
				System.out.println("Operação Desconhecida!");									
		}
		System.out.println("O resultado da operação matemática é: ");
		System.out.printf("%.2f %c %.2f = %.2f", n1, operacao, n2, resultado);
	}

}
