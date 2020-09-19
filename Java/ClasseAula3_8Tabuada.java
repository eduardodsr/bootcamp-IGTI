package PacoteExemplo;

import java.math.*;
import java.util.Scanner;

public class ClasseAula3_8Tabuada {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int index = 0, num = 0;
		
		Scanner entradaDados = new Scanner(System.in);
		
		System.out.println("****** Programa que calcula a Tabuada ******");
		
		System.out.println("Digite um número inteiro: ");
		num = entradaDados.nextInt();
		
		System.out.printf("Resultado da tabuada do %d é: \n", num);
				
		for (index = 1; index <= 10; index++) {
			System.out.printf("%d * %d = %d \n", num, index, num * index);
		}
	}

}
