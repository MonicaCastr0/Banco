package repository;

import model.Conta;

import java.util.HashMap;
import java.util.Map;

public class ContaRepository {
    private Map<String, Conta> contas = new HashMap<>();

    public void salvar(Conta conta){
        contas.put(conta.getNumero(), conta);
    }
    public Conta buscar(String numero){
        return contas.get(numero);
    }
}
