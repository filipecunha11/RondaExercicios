package exercicios;

import java.util.Scanner;

public class Exercicio2 {

	public Exercicio2() {
		char[] c = new char[5];
		
		System.out.println("Insira 5 caracteres: ");
		
		for (int i = 0 ; i < 5 ; i++){
			System.out.print(i+1 + "º - ");
			c[i] = new Scanner(System.in).next().charAt(0);
		}
		
		System.out.println("Quantidade de nº: " + getNumbers(c));
	}
	
	public int getNumbers(char[] car){
		int i = 0;
		for(char c : car)
			if (c >= 48 && c <= 57)
				i++;
		return i;
	}

}
