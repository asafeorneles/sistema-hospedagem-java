package dominio;

public abstract class Quarto implements Acressimo {
    protected double valorDiaria;
    protected boolean arCondicionado;
    protected boolean hidromassagem;
    protected double valorAcressimo;
    protected double valorTotal;
    protected Residencia residencia;

    public Quarto(double valorDiaria, boolean arCondicionado, boolean hidromassagem) {
        this.valorDiaria = valorDiaria;
        this.arCondicionado = arCondicionado;
        this.hidromassagem = hidromassagem;
    }

    public Quarto(double valorDiaria, boolean arCondicionado, boolean hidromassagem, Residencia residencia) {
        this(valorDiaria, arCondicionado, hidromassagem);
        this.residencia = residencia;
    }

    @Override
    public abstract void calcularAcressimo(int quantidade);

    public abstract void calcularValorFinal(long diarias);

    public double getValorDiaria() {
        return valorDiaria;
    }

    public double getValorAcressimo() {
        return valorAcressimo;
    }

    public double getValorTotal() {
        return valorTotal;
    }

    public Residencia getResidencia() {
        return residencia;
    }
}
