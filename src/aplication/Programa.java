package aplication;

import java.util.Locale;
import java.util.Scanner;

public class Programa {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        String funcionario, auxFuncionario = null;
        char digitOutro = 'S';
        double vlrHora, valorTotalHoras = 0, auxValorHora = 0 ;
        int horasTrab, totalHoras = 0, auxHoras = 0, opcao = 1   ;
        while (digitOutro == 'S') {
        System.out.println("Nome: ");
        funcionario = sc.next();
        
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
        
        totalHoras += vlrHora;
		valorTotalHoras += vlrHora * horasTrab;
		if (vlrHora * horasTrab > auxValorHora * auxHoras) {
			auxFuncionario = funcionario;
		}

		auxHoras = horasTrab;
		auxHoras = totalHoras;
		
        System.out.println("Digitar outro (S/N)? ");
        digitOutro = sc.next().charAt(0);        
        }		
        
        while (opcao < 4) {
			System.out.println();
			System.out.println("MENU");
			System.out.println("1 - Total de horas trabalhadas");
			System.out.println("2 - Custo total");
			System.out.println("3 - Nome da pessoa que ganhou mais");
			System.out.println("4 - Sair");
			System.out.println("Digite uma opcão: ");
			opcao = sc.nextInt();
			while (opcao < 1 || opcao > 4) {
				System.out.println();
				System.out.println("OPÇÃO INVÁLIDA! ");

				System.out.println();
				System.out.println("MENU");
				System.out.println("1 - Total de horas trabalhadas");
				System.out.println("2 - Custo total");
				System.out.println("3 - Nome da pessoa que ganhou mais");
				System.out.println("4 - Sair");
				System.out.println("Digite uma opcão: ");
				opcao = sc.nextInt();
			}
			
			if (opcao == 1) {
				System.out.println();
				System.out.println("Total de horas = " + totalHoras);
			} else if (opcao == 2) {
				System.out.println();
				System.out.printf("Custo total = R$ %.2f%n", valorTotalHoras);
			} else if (opcao == 3) {
				System.out.println();
				System.out.println("Pessoa que ganhou mais: " + auxFuncionario);
			} else {
				System.out.println();
				System.out.println("FIM DO PROGRAMA! ");
			}
		}
        sc.close();
	}

}
