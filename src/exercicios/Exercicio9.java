package exercicios;

import java.util.Scanner;

public class Exercicio9 {

	public Exercicio9() {
		int n1, n2;
		char op;
		while (true) {
			System.out.print("Insira o primeiro num: ");
			n1 = new Scanner(System.in).nextInt();
			
			System.out.print("Insira a operação a efetuar (0 para sair): ");
			op = new Scanner(System.in).next().charAt(0);
			if (op == '0') break;
			
			System.out.print("Insira o segundo num: ");
			n2 = new Scanner(System.in).nextInt();
			
			switch (op) {
			case '+': System.out.print("Resultado: " + (n1+n2) + "\n\n");
				break;
			case '-': System.out.print("Resultado: " + (n1-n2) + "\n\n");
				break;
			case '*': System.out.print("Resultado: " + (n1*n2) + "\n\n");
				break;
			case '/': System.out.print("Resultado: " + ((float)n1/(float)n2) + "\n\n");
				break;
			}
		}
	}

}
