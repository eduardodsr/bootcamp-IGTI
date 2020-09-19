package PacoteExemplo;

import java.math.*; 
import java.util.*;

public class ClasseAula3_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		char sexo;
				
		Scanner entradaCaracteres = new Scanner(System.in);
		
		System.out.print("Digite o nome do aluno: ");
		String nomeAluno = entradaCaracteres.nextLine();
		
		System.out.print("Digite o sexo do aluno (M ou F): ");
		sexo = entradaCaracteres.nextLine().charAt(0);
		
		System.out.printf("\nNome: %s \nSexo: %c", nomeAluno, sexo);
			
	}

}
