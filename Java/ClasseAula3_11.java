package PacoteExemplo;

import java.util.Scanner;

public class ClasseAula3_11 {

	public static void main(String[] args) {
		
		// Declara��o do Array
		// tipo [] nome = new tipo[tamanho];
		
		int [] num = new int[5];
		int total = 0, i;
		
		Scanner entradaDados = new Scanner(System.in);
		
		for (i = 0; i < 5; i++) {
			System.out.printf("Digite o %d n�mero inteiro: ", i+1);
			num[i] = entradaDados.nextInt();
			total += num[i]; // total = total + num[i]
		}
		System.out.printf("O valor total (somatorio dos numeros digitados) �: %d", total);
	}

}