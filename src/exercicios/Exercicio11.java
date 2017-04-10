package exercicios;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercicio11 {

	public Exercicio11() {
		double[] notas = new double[5];
		System.out.println("Insira as notas dos modulos: ");
		for (int i = 0 ; i < 5 ; i++){
			System.out.print(i+1 + "º - ");
			do
				notas[i] = new Scanner(System.in).nextInt();
			while(notas[i] < 0);
		}
		
		double media = 0;
		
		for (double d : notas)
			media+=d;
		System.out.println("Media de curso: " + ((media/5)/1000) + " valores.");
	}
}
