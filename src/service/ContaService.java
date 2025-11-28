package service;

import model.Conta;
import repository.ContaRepository;

import java.util.List;

public class ContaService {
    private ContaRepository repositorio = new ContaRepository();

    public Conta criarConta(String numero, String titular){
        Conta conta = new Conta(numero, titular);
        repositorio.salvar(conta);
        return conta;
    }
    public Conta buscarConta(String numero){
       return  repositorio.buscar(numero);
    }
    public void depositar (String numero, double valor){
        Conta conta = repositorio.buscar(numero);
        if(conta == null){
            throw new IllegalArgumentException("Conta não encontrada!");
        }
        conta.setSaldo(conta.getSaldo()+valor);
        conta.adicinartrancacoes("Deposito de: R$"+valor);
    }
    public void sacar(String numero, double valor){
        Conta conta = repositorio.buscar(numero);
        if(conta == null){
            throw new IllegalArgumentException("Conta não encontrada!");
        }
        if(valor > conta.getSaldo()){
            throw new IllegalArgumentException("Saldo insuficiente!");
        }
        conta.setSaldo(conta.getSaldo()-valor);
        conta.adicinartrancacoes("Saque de: R$"+valor);
    }
    public List<String> extrato(String numero){
        Conta conta = repositorio.buscar(numero);
        if(conta == null){
            throw new IllegalArgumentException("Conta não encontrada!");
        }
        return conta.getTrancacoes();
    }
}
