package dominio;

public class QuartoCasal extends Quarto {
    private double valorBercoExtra;

    public QuartoCasal(double valorDiaria, boolean arCondicionado, boolean hidromassagem, double valorBercoExtra) {
        super(valorDiaria, arCondicionado, hidromassagem);
        this.valorBercoExtra = valorBercoExtra;
    }

    @Override
    public void calcularAcressimo(int quantidade) {
        this.valorAcressimo = quantidade * this.valorBercoExtra;
    }

    @Override
    public void calcularDiariaFinal() {
        this.valorDiaria += this.valorAcressimo;
    }

    public double getValorBercoExtra() {
        return valorBercoExtra;
    }
}
