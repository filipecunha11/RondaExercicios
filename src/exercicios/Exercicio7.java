package exercicios;

import java.util.Scanner;

public class Exercicio7 {

	public Exercicio7() {
		float[] time = new float[3];
		System.out.println("Insira os 3 tempos dos pilotos: ");
		
		float max = 0.0f, min = 0.0f;
		
		for (int i = -1 ; ++i < 3;){
			do
			time[i] = new Scanner(System.in).nextFloat();
			while (time[i] < 0.0);
			if (i == 0) min = time[i];
			if (time[i] > max ) max = time[i];
			if (time[i] < min ) max = time[i];
		}
		
		System.out.println("O piloto mais rápido fez: " + min);
		System.out.println("O piloto mais lento fez: " + max);
		System.out.println("Total de tempos: " + (time[0] + time[1] + time[2]));
	}

}
