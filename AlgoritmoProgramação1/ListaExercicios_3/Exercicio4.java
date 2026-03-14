//Mariane Santana da Silva RA:1143431607

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        // Exercicio 4
        
        System.out.println("Qual é seu plano de trabalho \n Exitem o plano A - B - C");
        String P = ler.nextLine();

        System.out.print(" Informe seu atual salário:");
        double S = ler.nextDouble();

        switch (P) {
            case "A":
                System.out.println("Com o plano A, seu salário se torna:"+(S+(S/100)*10));
            break;
            
            case "B":
                System.out.println("Com o plano B, seu salário se torna:"+(S+(S/100)*15));
            break;
            
            case "C":
                System.out.println("Com o plano A, seu salário se torna:"+(S+(S/100)*20));
            break;
            
            default:
                System.out.print("Não possui este plano de trabalho.");
        }
    }
}
