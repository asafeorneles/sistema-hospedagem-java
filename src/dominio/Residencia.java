package dominio;

public class Residencia {
    private String endereco;
    private String numero;
    private String cep;
    private String telefone;
    private String email;
    private Quarto [] quarto;

    public Residencia(String endereco, String numero, String cep, String telefone, String email, Quarto[] quarto) {
        this.endereco = endereco;
        this.numero = numero;
        this.cep = cep;
        this.telefone = telefone;
        this.email = email;
        this.quarto = quarto;
    }
}
