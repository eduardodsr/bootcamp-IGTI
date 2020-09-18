package PacoteExemplo;

public class ClasseExemplo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int idade = 30;
		double altura = 1.81;
		String nome = "Joaquim José da Silva Xavier";
		boolean estudante = true; 
		char sexo = 'M';
		
		// System.out.println("Idade: " + idade);
		// System.out.println("Altura: " + altura);
		
		// printf - exemplos de argumentos:
		
		// %s 	String
		// %d 	Int
		// %.2f Float ou Double com 2 casas decimais
		// %b 	Bolean
		// %c	Char (caractere)
		
		// \n	Quebra de linha
		
		System.out.printf("Seu nome é %s. \n É estudante? %b. \n Sexo? %c. \n A sua idade é %d e a altura é %.2f.", nome, estudante, sexo, idade, altura);
	}

}
