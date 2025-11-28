package controller;
import model.Conta;
import service.ContaService;

import java.util.List;

public class ContaController {
    private ContaService servico = new ContaService();

    public void criarConta(String numero, String titular) {
        servico.criarConta(numero, titular);
        System.out.println("Conta crianda com sucesso");
    }

    public void buscarConta(String numero) {
        try {
            Conta conta = servico.buscarConta(numero);
            System.out.println("Numero da conta: " + conta.getNumero());
            System.out.println("Titular: " + conta.getTitular());
            System.out.println("Saldo: " + conta.getSaldo());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    public boolean validarConta(String numero) {
        Conta Conta = servico.buscarConta(numero);
        if (Conta == null) {
            return false;
        }
        return true;
    }

    public void sacar(String numero, double valor) {
        try {
            servico.sacar(numero, valor);
            System.out.println("Saque realizada com sucesso");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public void depositar(String numero, double valor) {
        try {
            servico.depositar(numero, valor);
            System.out.println("Deposito realizado com sucesso");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    public void trancacoes(String numero){
        try{
            List<String> lista = servico.extrato(numero);
            System.out.println("----Extrato da conta----");
            lista.forEach(item -> System.out.println(item));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
