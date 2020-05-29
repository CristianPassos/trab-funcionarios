package aplication;

import java.util.Locale;
import java.util.Scanner;

public class Programa {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        String funcionario;
        char digitOutro = 'S';
        double vlrHora;
        int horasTrab;
        while (digitOutro == 'S') {
        System.out.println("Nome: ");
        funcionario = sc.nextLine();
        
        System.out.println("Horas trabalhadas: ");
        horasTrab = sc.nextInt();
        while (horasTrab < 0) {
        	System.out.println("A hora trabalhada não deve ser negativa. Tente novamente: ");
        	horasTrab = sc.nextInt();			
		}
        System.out.println("Valor por hora: ");
        vlrHora = sc.nextDouble();        
       
        while (vlrHora < 0) {
        	System.out.println("O valor da hora não deve ser negativa. Tente novamente: ");
        	vlrHora = sc.nextDouble();			
		}
        System.out.println("Digitar outro (S/N)? ");
        digitOutro = sc.next().charAt(0);
        
        }
        System.out.println("MENU:");
		System.out.println("1 - Total de horas trabalhadas ");
		System.out.println("2 - Custo total ");
		System.out.println("3 - Nome da pessoa que ganhou mais ");
		System.out.println("4 - Sair ");
		
		sc.close();

	}

}
