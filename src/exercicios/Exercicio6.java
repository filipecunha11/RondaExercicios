package exercicios;

import java.util.Scanner;

public class Exercicio6 {

	public Exercicio6() {
		System.out.println("Insira 2 numeros: ");
		int a = new Scanner(System.in).nextInt();
		int b = new Scanner(System.in).nextInt();
		
		System.out.println("Nº pares entre " + a + " e " + b + ": ");
		for (int i = a ; ++i < b;)
			if (i % 2 == 0)
				System.out.println(i);
	}

}
