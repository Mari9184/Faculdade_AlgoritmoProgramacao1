//Mariane Santana da Silva RA:1143431607

import java.util.Scanner;

class Main {
    public static void main (String [] args){
        Scanner ler = new Scanner(System.in);

        //6° Exercício

        System.out.println("1° nota:");
        double V1 = ler.nextDouble();

        System.out.println("2° nota:");
        double V2 = ler.nextDouble();

        System.out.println("3° nota:");
        double V3 = ler.nextDouble();

        double media = (V1+V2+V3)/3;
        System.out.printf("Sua nota é %f",media);

    }
}
