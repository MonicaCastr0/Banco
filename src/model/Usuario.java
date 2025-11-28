package model;

public class Usuario {
    private String nomeCompleto;
    private String cpf;
    private String rg;


    public Usuario(String nomeCompleto, String cpf, String rg){
        this.nomeCompleto = nomeCompleto;
        this.cpf = cpf;
        this.rg = rg;
    }

    public String getNomeCompleto() {return nomeCompleto;}

    public String getCpf() {return cpf;}

    public String getRg() {return rg;}
}
