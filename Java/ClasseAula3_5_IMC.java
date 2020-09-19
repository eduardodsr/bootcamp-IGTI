package PacoteExemplo;

import java.math.*;
import java.util.*;

public class ClasseAula3_5_IMC {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double peso, altura, imc;
		
		Scanner entradaDados = new Scanner(System.in);
		
		System.out.println("****** Programa que calcula o IMC (índice de massa corporal) ******");
		
		System.out.println("Digite o peso: ");
		peso = entradaDados.nextFloat();
		
		System.out.println("Digite o altura: ");
		altura = entradaDados.nextFloat();
		
		imc = peso/(altura*altura); // calculo do IMC
		
		System.out.printf("\n O seu IMC é: %.2f. ", imc);
		
		if (imc <= 19)
			System.out.println("\n Abaixo do peso!");
		
		else if (imc > 19 && imc <= 25)
			System.out.println("\n Peso ideal!");
		
		else if (imc > 25 && imc <= 30)
			System.out.println("\n Acima do peso!");
		
		else if (imc > 30 && imc <= 35)
			System.out.println("\n Obesidade leve!");
		
		else
			System.out.println("\n Obesidade!");				
		
		System.out.println("****** Fim do Programa ******");
	}

}
