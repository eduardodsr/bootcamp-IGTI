package PacoteExemplo;

import java.math.*; 

public class Classe2_13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double nota, frequencia;
		char sexo;
		boolean aprovado;
		String nomeAluno;
		
		nomeAluno = "Joaquim Jos� da Silva Xavier";
		sexo = 'M';
		
		nota = 75.50;
		
		frequencia = 0.60; // � a mesma coisa que 60%
		
		aprovado = ( (nota >= 70) && (frequencia >= 0.75) );
		
		System.out.printf("O aluno %s, sexo %c, obteve nota: %.2f e frequ�ncia: %.2f %%.  \n"
				+ "Aluno Aprovado? %b", nomeAluno, sexo, nota, frequencia*100,  aprovado);	
			
		
			

	}

}
