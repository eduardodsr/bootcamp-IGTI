package PacoteExemplo;

import java.math.*; 
import java.util.*;

public class ClasseAula3_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		char sexo;
				
		Scanner entradaCaracteres = new Scanner(System.in);
		
		System.out.print("Digite o nome do aluno: "); // entrada de dados
		String nomeAluno = entradaCaracteres.nextLine(); // nomeAluno
		
		System.out.print("Digite o sexo do aluno (M ou F): "); // entrada de dados
		sexo = entradaCaracteres.nextLine().charAt(0);	// sexo (M ou F)
		
		System.out.printf("\nNome: %s \nSexo: %c", nomeAluno, sexo);
			
	}

}
