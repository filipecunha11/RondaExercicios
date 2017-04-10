package exercicios;

import java.util.Random;

public class Exercicio12 {

	public Exercicio12() {
		int[] notas = new int[10];
		int nPositivas = 0;
		for (int i : notas){
			i = new Random().nextInt(21);
			if (i >= 10) nPositivas++;
		}
		
		System.out.println("Existem " + nPositivas + " positivas na turma.");
	}

}
