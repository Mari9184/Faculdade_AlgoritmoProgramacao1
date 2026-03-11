//Mariane Santana da Silva RA:1143431607

import java.util.Scanner;
class Main {
    public static void main (String [] args){
      Scanner ler = new Scanner(System.in);

        //Execício 1
         System.out.println("Digite um numero");
          double N = ler.nextDouble();
          
          if (N>20){
              System.out.println("A metade dets numero é:"+N/2);
      
        // Exercício 2
        System.out.println("Informe Sua idade");
          double x = ler.nextDouble();
  
          if (x >= 18) {
              System.out.println("Você é maior de idade.");
          } else {
              System.out.println("Você é menor de idade.");

          // Exercício 3
            System.out.println("Informe um numero");
          double x = ler.nextDouble();
  
          System.out.println("Informe um numero");
          double y = ler.nextDouble();
  
          double M = x-y;
  
          if (x == y) {
              System.out.println("Estes números são iguais, não ah diferença.");
          }
            else {
                System.out.println("A diferença entre esses numero é de:"+M);
            }

          // Exercício 4
          System.out.println("Informe um numero");
          float x = ler.nextFloat();
  
          System.out.println("Informe um numero");
          float y = ler.nextFloat();
  
          if (x > y) {
              System.out.printf(" %f,%f",x,y);
          }
          else if (y >= x) {
              System.out.printf(" %f,%f",y,x);
          }
  
          // Exercício 5
          Scanner ler = new Scanner(System.in);
  
          System.out.println("Informe um numero");
          double x = ler.nextDouble();
  
          if (100 >= x & 50 <= x) {
              System.out.println("Este número pertence ao intervalo");
          } else {
              System.out.println("Não pertence ao intervalo");
          }
  
          // Exercício 6
          Pedir ajudad para prof
  
          // Exercício 7
          System.out.println(" Quanto tempo está na empresa? ");
          double x = ler.nextDouble();
  
          System.out.println(" Quanto é o seu salario?");
          double s = ler.nextDouble();
          
          double NovoS = s+(100/s)*20;
          
          if (x >= 5) {
              System.out.println("Você recebeu um aumento seu salário passou a ser: "+NovoS);
          } else {
              System.out.println("Este numero não é divísivel");
          }
  
          // Exercício 8
          System.out.print("Informe a senha");
          String senha = ler.nextLine();
          
          if (senha.equals("R10p5")){
            System.out.print("Sua senha esta correta!!");
          }
          else {
            System.out.print("Sua senha esta incorreta :/");
          }
  
          // Exercício 9
          System.out.print("Informe o valor do emprestimo:");
          double E = ler.nextDouble();
          
          if (E <= (1200/100)*30){
            System.out.print("Você pode receber o emprestimo!!");
          }
          else {
            System.out.print("Você não pode receber o emprestimo :/");
          }
    
          //Exercicio 10
          System.out.print("Informe o 1° numero");
          double q = ler.nextDouble();
            
          System.out.print("Informe o 2° numero");
          double w = ler.nextDouble();
            
          System.out.print("Informe o 3° numero");
          double e = ler.nextDouble();
            
          if ( q == w & w == e){
            System.out.print("Todos os numero são iguais");
          }
          else if (q > w & q> e){
            System.out.println("Este é o maior numero:"+q);
          }
          else if (w > q & w> e){
            System.out.println("Este é o maior numero:"+w);
          }
          else{
            System.out.println("Este é o maior numero:"+e);
          }
  
          // Exercício 11
          System.out.print("Informe sua idade");
          double idade = ler.nextDouble();
          
          
          if ( idade >= 5 & idade <= 7 ){
            System.out.print("infantil-A");
          }
          else if ( idade >= 8 & idade <= 10 ){
            System.out.print("infantil-B");
          }
          else if ( idade >= 11 & idade <= 13 ){
            System.out.print("Juvenil-A");
          } 
          else if ( idade >= 14 & idade <= 17 ){
            System.out.print("Juvenil-B");
          }
          else if ( idade >= 18 ){
            System.out.print("Sênior");
          } 
          else{
            System.out.print("Não tem idade para nadar");
          }
  
          // Exercicio 12
          System.out.print("Informe seu Salário");
          double salario = ler.nextDouble();
          
          if (salario <= 600) {
            System.out.print("Isento");
          }
          else if 

          // Exercicio 13
          System.out.print("Digite a operação (+, -, *, /): ");
          String operador = ler.nextLine();
            
          System.out.print("Digite o primeiro número: ");
          double n1 = ler.nextDouble();
      
          System.out.print("Digite o segundo número: ");
          double n2 = ler.nextDouble();
  
          if (operador.equals("+")){
              System.out.println("O resultado é:"+ (n1+n2));
          }
          else if (operador.equals("-")){
              System.out.println("O resultado é:"+ (n1-n2));
          }
          else if (operador.equals("*")){
              System.out.println("O resultado é:"+ (n1*n2));
          }
          else if (operador.equals("/")){
              System.out.println("O resultado é:"+ (n1/n2));
          } 
          else {
              System.out.print("Não é possivel identificar a operação.")
        }
          
    }
