package dominio;

public abstract class Quarto implements Acressimo {
    protected double valorDiaria;
    protected boolean arCondicionado;
    protected boolean hidromassagem;
    protected double valorAcressimo;

    public Quarto(double valorDiaria, boolean arCondicionado, boolean hidromassagem) {
        this.valorDiaria = valorDiaria;
        this.arCondicionado = arCondicionado;
        this.hidromassagem = hidromassagem;
    }

    @Override
    public abstract void calcularAcressimo(int quantidade);

    public abstract void calcularDiariaFinal();

    public double getValorDiaria() {
        return valorDiaria;
    }

    public double getValorAcressimo() {
        return valorAcressimo;
    }
}
