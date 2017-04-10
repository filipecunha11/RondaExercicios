package exercicios;

import java.util.Random;

public class Exercicio3 {

	public Exercicio3() {
		int[] n = new int[20];
		int[] cont = new int[9];
		Random rand = new Random();
		
		for(int i = 0 ; i < 20 ; i++)
		{
			n[i] = rand.nextInt(9)+1;
			cont[n[i]-1]++;
		}
		
		for (int i = 0 ; i++ < 9;)
			System.out.println("Nº " + i + " - " + cont[i-1] + " vezes");
			
	}

}
