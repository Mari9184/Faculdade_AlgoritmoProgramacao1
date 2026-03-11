//Mariane Santana da Silva RA:1143431607

import java.util.Scanner;
class Main {
    public static void main (String [] args) {
        Scanner ler = new Scanner(System.in);

            // Exercício 8

        System.out.print("Informe a senha");
        String senha = ler.nextLine();

        if (senha.equals("R10p5")) {
            System.out.print("Sua senha esta correta!!");
        } else {
            System.out.print("Sua senha esta incorreta :/");
        }
    }
}
