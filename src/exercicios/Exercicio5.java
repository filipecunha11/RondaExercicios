package exercicios;

import java.util.Scanner;

public class Exercicio5 {

	public Exercicio5() {
		int n, tot = 0;
		System.out.println("Insira numeros (0 para sair): ");
		do
			tot+= n = new Scanner(System.in).nextInt();
		while (n != 0);
		System.out.println("Total: " + tot);
	}

}
