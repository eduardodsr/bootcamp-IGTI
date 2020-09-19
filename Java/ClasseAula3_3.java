package PacoteExemplo;

import java.math.*;
import java.util.*;

public class ClasseAula3_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double n1, n2, n3, total, media, frequencia;
		String situacao;
		
		Scanner entradaDados = new Scanner(System.in); // leitura da entradaDados (Scanner)
		
				
		System.out.println("======Início do Programa======");
		System.out.print("Digite o nome do aluno: "); 			
		String nomeAluno = entradaDados.nextLine();	//String nomeAluno = entradaNomeAluno.nextLine(); 
		
		System.out.println("Digite a Nota1: "); // entrada de dados = Nota1
		n1 = entradaDados.nextDouble();
		
		System.out.println("Digite a Nota2: "); // entrada de dados = Nota2
		n2 = entradaDados.nextDouble();
		
		System.out.println("Digite a Nota3: "); // entrada de dados = Nota3
		n3 = entradaDados.nextDouble();
		
		total = n1 + n2 + n3;
		media = total / 3;
		
		System.out.println("Digite a frequência: "); // entrada de dados = frequencia
		frequencia = entradaDados.nextDouble();			
		
		if (media >= 70 && frequencia >= 0.75)	// Se Media for maior que 70 && (AND) frequencia maior ou igual a 75%, retorna True (Aprovado) ou False(Reprovado)
			situacao = "Aprovado";
		else
			situacao = "Reprovado";
		
		System.out.printf("O aluno %s obteve a média final %.2f. A frequencia %.2f %%. Situação Final: %s !", nomeAluno, media, frequencia, situacao );
		System.out.println("\n======Fim do Programa======");
	}

}
