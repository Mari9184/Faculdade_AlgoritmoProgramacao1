//Mariane Santana da Silva RA:1143431607

import java.util.Scanner;
class Main {
    public static void main (String [] args) {
        Scanner ler = new Scanner(System.in);

            // Exercício 7

        System.out.println(" Quanto tempo está na empresa? ");
        double J = ler.nextDouble();

        System.out.println(" Quanto é o seu salario?");
        double s = ler.nextDouble();

        double NovoS = s + (100 / s) * 20;

        if (J >= 5) {
            System.out.println("Você recebeu um aumento seu salário passou a ser: " + NovoS);
        }
        else {
            System.out.println("Este numero não é divísivel");
        }
    }
}
