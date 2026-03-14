//Mariane Santana da Silva RA:1143431607

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        // Exercicio 6
        
        System.out.println("===========Lanchonete===========\n");
        System.out.println(" 100 - Cachorro Quente - R$1,20 \n 101 - Bauru           - R$1,30 \n 102 - Bauru com ovo   - R$1,50\n 103 - Hambúrguer      - R$1,20 \n 104 - Cheeseburguer   - R$1,30\n 105 - Refrigerante    - R$1,00 \n");
        
        System.out.print("Digite o codigo do produto: ");
        int P = ler.nextInt();
        
        System.out.print("Quantidade de produtos que deseja: ");
        int Q = ler.nextInt();

        switch (P) {
            case 100:
                double T1 = 1.20*Q;
                System.out.printf(" Você comprou %d Cachorro(s) Quente - Valor da compra: %.2f ", Q, T1);
            break;
            
            case 101:
                double T2 = 1.30*Q;
                System.out.printf(" Você comprou %d Bauru - Valor da compra: %.2f ", Q, T2);
            break;
            
            case 102:
                double T3 = 1.50*Q;
                System.out.printf(" Você comprou %d Bauru com ovo - Valor da compra: %.2f ", Q, T3);
            break;
            
            case 103:
                double T4 = 1.20*Q;
                System.out.printf(" Você comprou %d Hambúrguer - Valor da compra: %.2f ", Q, T4);
            break;
           
            case 104:
                double T5 = 1.30*Q;
                System.out.printf(" Você comprou %d Cheeseburguer - Valor da compra: %.2f ", Q, T5);
            break;
            
            case 105:
                double T6 = 1.00*Q;
                System.out.printf(" Você comprou %d Hambúrguer - Valor da compra: %.2f ", Q, T6);
            break;
           
           
            default:
                System.out.print("Não possui este lanche.");
        }
    }
}
