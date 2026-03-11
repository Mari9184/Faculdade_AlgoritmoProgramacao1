//Mariane Santana da Silva RA:1143431607

import java.util.Scanner;
class Main {
    public static void main (String [] args) {
        Scanner ler = new Scanner(System.in);

            // Exercicio 12

        System.out.print("Informe seu salário:");
        double salario = ler.nextDouble();

        if (salario <= 600.0) {
            System.out.print("Você está isento de pagar o INSS");
        }
        else if (salario > 600.01 & salario <= 1200.0){
            System.out.println("Você deve pagar 20% do INSS, com o descunto seu saldo fica:" + (salario-(salario/100) * 20));
        }
        else if (salario > 1200.01 & salario <= 2000.0) {
            System.out.println("Você deve pagar 25% do INSS, com o descunto seu saldo fica:" + (salario-(salario/100) * 25));
        }
        else if (salario >= 2000.01 ) {
            System.out.println("Você deve pagar 30% do INSS, com o descunto seu saldo fica:" + (salario-(salario/100) * 30));
        }
        else {
            System.out.print("Não é possivel identificar o que disse");
        }   
    }
}
