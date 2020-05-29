package aplication;

import java.util.Locale;
import java.util.Scanner;

public class Programa {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        String funcionario;
        char digitOutro;
        double vlrHora;
        int horasTrab;
        
        System.out.println("Nome: ");
        funcionario = sc.nextLine();
        System.out.println("Horas trabalhadas: ");
        horasTrab = sc.nextInt();
        System.out.println("Valor por hora: ");
        vlrHora = sc.nextDouble();
        
        while (horasTrab < 0) {
        	System.out.println("A hora trabalhada não deve ser negativa. Tente novamente: ");
        	horasTrab = sc.nextInt();			
		}
        while (vlrHora < 0) {
        	System.out.println("O valor da hora não deve ser negativa. Tente novamente: ");
        	vlrHora = sc.nextDouble();			
		}
		sc.close();

	}

}
