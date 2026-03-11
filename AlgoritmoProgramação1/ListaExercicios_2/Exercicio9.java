//Mariane Santana da Silva RA:1143431607

import java.util.Scanner;
class Main {
    public static void main (String [] args) {
        Scanner ler = new Scanner(System.in);
        
            // Exercício 9

        System.out.print("Informe o valor do emprestimo:");
        double E = ler.nextDouble();

        if (E <= (1200/100)*30){
            System.out.print("Você pode receber o emprestimo!!");
        }
        else {
            System.out.print("Você não pode receber o emprestimo :/");
        }
    }
}
