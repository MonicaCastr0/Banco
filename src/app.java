import controller.ContaController;

import java.util.Scanner;


public class app {
    public static void main(String[] args) {
        ContaController c = new ContaController();
        Scanner entrada = new Scanner(System.in);
        int opcao;
        do {
            System.out.println("------------------------------------------------------");
            System.out.println("Digite a operação que você deseja realizar: ");
            System.out.println("1 - Cadastrar Conta");
            System.out.println("2 - Buscar Conta");
            System.out.println("3 - Sacar");
            System.out.println("4 - Depositar");
            System.out.println("5 - Extrato");
            System.out.println("6 - Sair");
            System.out.println("------------------------------------------------------");
            opcao = entrada.nextInt();
            entrada.nextLine(); // limpa buffer

            switch (opcao) {
                case 1:
                    System.out.println("Digite numero do conta: ");
                    String num = entrada.nextLine();
                    if(c.validarConta(num)){
                        System.out.println("Conta já cadastrada");
                        break;
                    }
                    System.out.println("Digite o nome completo do titular da conta");
                    String titular = entrada.nextLine();
                    c.criarConta(num, titular);
                    break;
                case 2:
                    System.out.println("Digite o numero da conta");
                    String num1 = entrada.nextLine();
                    c.buscarConta(num1);
                    break;
                case 3:
                    System.out.println("Digite numero do conta: ");
                    String num2 = entrada.nextLine();
                    if(c.validarConta(num2) == false) {
                        System.out.println("Conta Não encontrada!");
                        break;
                    }
                        System.out.println("Digite valor do saque");
                        double valor = entrada.nextDouble();
                        c.sacar(num2, valor);
                    break;
                case 4:
                    System.out.println("Digite o numero da conta");
                    String num3 = entrada.nextLine();
                    if(c.validarConta(num3) == false) {
                        System.out.println("Conta Não encontrada!");
                        break;
                    }
                    System.out.println("Digite o valor do deposito");
                    double valor1 = entrada.nextDouble();
                    c.depositar(num3, valor1);
                    break;
                case 5:
                    System.out.println("Digite numero do conta: ");
                    String num4 = entrada.nextLine();
                    if(c.validarConta(num4) == false) {
                        System.out.println("Conta não encontrada");
                    }
                    c.trancacoes(num4);
                    break;
                case 6:
                    System.out.println("Saindo...");
                    opcao = 0;
            }
        } while (opcao != 0);
    }
}