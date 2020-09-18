package PacoteExemplo;

public class ClasseExemplo {

	public static void main(String[] args) {
		
		String nome1, nome2;
		nome1 = "José";
		nome2 = "Maria";
		
		System.out.println("Nome1: "+ nome1);
		System.out.println("Nome2: "+ nome2);
		
		int tamanhoDoNome1 = nome1.length();
		int tamanhoDoNome2 = nome2.length();
		
		System.out.println("Tamanho do Nome1: " + tamanhoDoNome1 + " caracteres.");
		System.out.println("Tamanho do Nome2: " + tamanhoDoNome2 + " caracteres.");
		
		int totalCaracteres = tamanhoDoNome1 + tamanhoDoNome2;
		
		System.out.println("O total de caracteres das duas variáveis é : " + totalCaracteres + " caracteres.");
		
		// concat() - função realiza concatenação
		String nomesConcatenados = nome1.concat(nome2);
		System.out.println(nomesConcatenados);
		
		// replace() - função que realiza substituição
		String nomeSemA = nome2.replace('a', '@');
		System.out.println(nomeSemA);
		
		// substring() - função que realiza manipulação da String
		String nomeCompleto = "Joaquim José da Silva Xavir";
		nomeCompleto = nomeCompleto.substring(0,12); // Retorna a String "Joaquim José", posição inical 0 até 12.
		System.out.println(nomeCompleto);
		
		// toUpperCase() - função que retorna a String em MAIUSCULA.
		nomeCompleto = nomeCompleto.toUpperCase();
		System.out.println(nomeCompleto);
		
		// toLowerCase() - função que retorna a String em minuscula.
		nomeCompleto = nomeCompleto.toLowerCase();
		System.out.println(nomeCompleto);
	}

}
