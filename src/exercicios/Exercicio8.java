package exercicios;

import java.util.Random;
import java.util.Scanner;

public class Exercicio8 {

	public Exercicio8() {
		int acert = 0;
		
        while (true) {
            Random rnd = new Random();
            int n1 = rnd.nextInt(11), n2;            
            System.out.println("\n\nNumero -> " + n1);
            
            char opc;
            do
            {
                System.out.println("Insira c se acha que o numero irá ser maior que o mostrado");
                System.out.println("Insira b se acha que o numero irá ser menor que o mostrado");
                opc =  (new Scanner(System.in)).next().charAt(0);
            }while (opc != 'c' && opc != 'b');
            
            do 
            	n2 = rnd.nextInt(11);
            while (n2 == n1);
            
            if ((opc == 'c' && n2 > n1) || (opc == 'b' && n1 > n2))
            {
                System.out.println("Acertou! O numero era " + n2);
                acert++;
            }
            else
            {
                System.out.println("Errou... O numero era " + n2);
                break;
            }
        }
        
        System.out.println("Acertou " + acert + " jogadas.");
	}

}
