//Mariane Santana da Silva RA:1143431607

import java.util.Scanner;
class Main {
    public static void main (String [] args) {
        Scanner ler = new Scanner(System.in);

            //Execício 1

        System.out.println("Digite um numero");
        double N = ler.nextDouble();

        if (N > 20) {
            System.out.println("A metade dets numero é:" + N / 2);
        }
    }
}
