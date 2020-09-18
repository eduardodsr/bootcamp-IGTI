package PacoteExemplo;

public class ClasseExemplo {

	public static void main(String[] args) {
		
		String nome1, nome2;
		nome1 = "Jos�";
		nome2 = "Maria";
		
		System.out.println("Nome1: "+ nome1);
		System.out.println("Nome2: "+ nome2);
		
		int tamanhoDoNome1 = nome1.length();
		int tamanhoDoNome2 = nome2.length();
		
		System.out.println("Tamanho do Nome1: " + tamanhoDoNome1 + " caracteres.");
		System.out.println("Tamanho do Nome2: " + tamanhoDoNome2 + " caracteres.");
		
		int totalCaracteres = tamanhoDoNome1 + tamanhoDoNome2;
		
		System.out.println("O total de caracteres das duas vari�veis � : " + totalCaracteres + " caracteres.");
		
		// concat() - fun��o realiza concatena��o
		String nomesConcatenados = nome1.concat(nome2);
		System.out.println(nomesConcatenados);
		
		// replace() - fun��o que realiza substitui��o
		String nomeSemA = nome2.replace('a', '@');
		System.out.println(nomeSemA);
		
		// substring() - fun��o que realiza manipula��o da String
		String nomeCompleto = "Joaquim Jos� da Silva Xavir";
		nomeCompleto = nomeCompleto.substring(0,12); // Retorna a String "Joaquim Jos�", posi��o inical 0 at� 12.
		System.out.println(nomeCompleto);
		
		// toUpperCase() - fun��o que retorna a String em MAIUSCULA.
		nomeCompleto = nomeCompleto.toUpperCase();
		System.out.println(nomeCompleto);
		
		// toLowerCase() - fun��o que retorna a String em minuscula.
		nomeCompleto = nomeCompleto.toLowerCase();
		System.out.println(nomeCompleto);
	}

}
