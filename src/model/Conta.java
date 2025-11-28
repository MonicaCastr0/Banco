package model;

import java.util.ArrayList;
import java.util.List;

public class Conta {
    private String numero;
    private double saldo;
    private String titular;
    private List<String> trancacoes =  new ArrayList<>();


    public Conta(String numero, String titular) {
        this.saldo = 0;
        this.numero = numero;
        this.titular = titular;
        trancacoes.add("Conta criada para: " + this.titular);
    }
    public void adicinartrancacoes(String descricao){
        trancacoes.add(descricao);
    }

    public List<String> getTrancacoes() {return trancacoes;}
    public String getNumero() {return numero;}
    public String getTitular() {return titular;}
    public double getSaldo() {return saldo;}

    public void setSaldo(double saldo){
        this.saldo = saldo;
    }


}
