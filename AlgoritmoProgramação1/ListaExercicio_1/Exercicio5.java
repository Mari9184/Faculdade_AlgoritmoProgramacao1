//Mariane Santana da Silva RA:1143431607

import java.util.Scanner;

class Main {
    public static void main (String [] args){
        Scanner ler = new Scanner(System.in);

        // 5° Exercício

        System.out.println("1° numero:");
        int N1 = ler.nextInt();

        System.out.println("2° numero:");
        int N2 = ler.nextInt();

        System.out.println("3° numero:");
        int N3 = ler.nextInt();

        System.out.println("4° numero:");
        int N4 = ler.nextInt();

        int soma = N1+N2+N3+N4;
        System.out.printf("\nA soma destes numeros é %d\n",soma);

    }
}
