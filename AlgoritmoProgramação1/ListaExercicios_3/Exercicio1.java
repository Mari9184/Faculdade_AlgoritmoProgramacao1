//Mariane Santana da Silva RA:1143431607

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        // Exercicio 1

        System.out.print("escolha um número de 1 a 7:");
        int X = ler.nextInt();

        switch (X) {
            case 1:
                System.out.print("O 1° dia da semana é domingo.");
            break;
            
            case 2:
                System.out.print("O 2° dia da semana é segunda.");
            break;
            
            case 3:
                System.out.print("O 3° dia da semana é terça.");
            break;
            
            case 4:
                System.out.print("O 4° dia da semana é quarta.");
            break;
            
            case 5:
                System.out.print("O 5° dia da semana é quinta.");
            break;
            
            case 6:
                System.out.print("O 6° dia da semana é sexta.");
            break;
            
            case 7:
                System.out.print("O 7° dia da semana é sabado.");
            break;
            
            default:
                System.out.print("Não possui dia da semana com este número.");
        }
    }
}
