package exercicios;

import java.util.Scanner;

public class Exercicio1 {

	public Exercicio1() {
		int[] n = new int[5];
		System.out.println("Insira 5 valores entre 1 e 100: ");
		for (int i = 0 ; i < 5 ; i++){
			System.out.print(i+1 + "º - ");
			do
				n[i] = new Scanner(System.in).nextInt();
			while(n[i] < 1 || n[i] > 100);
		}
		
		System.out.println("Maior: " + getMaior(n));
		System.out.println("Menor: " + getMenor(n));
	}
	
	public int getMaior(int[] n){
		int max = n[0];
		for(int i = 0 ; i++ < 4;)
			if (max < n[i]) max = n[i];
		return max;
	}

	public int getMenor(int[] n){
		int min = n[0];
		for(int i = 0 ; i++ < 4;)
			if (min > n[i]) min = n[i];
		return min;
	}
}
