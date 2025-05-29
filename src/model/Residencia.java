package model;

public class Residencia {
    private String nome;
    private String endereco;
    private String numero;
    private String cep;
    private String telefone;
    private String email;
    private Quarto [] quartos;

    public Residencia(String nome, String endereco, String numero, String cep, String telefone, String email) {
        this.nome = nome;
        this.endereco = endereco;
        this.numero = numero;
        this.cep = cep;
        this.telefone = telefone;
        this.email = email;
    }

    public Residencia(String nome, String endereco, String numero, String cep, String telefone, String email, Quarto[] quarto) {
        this(nome, endereco, numero, cep, telefone, email);
        this.quartos = quarto;
    }

    public String getEndereco() {
        return endereco;
    }

    public String getNumero() {
        return numero;
    }

    public String getCep() {
        return cep;
    }

    public String getTelefone() {
        return telefone;
    }

    public String getEmail() {
        return email;
    }

    public Quarto[] getQuartos() {
        return quartos;
    }

    public void setQuartos(Quarto[] quartos) {
        this.quartos = quartos;
    }

    public String getNome() {
        return nome;
    }
}
