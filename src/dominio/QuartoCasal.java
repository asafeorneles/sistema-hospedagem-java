package dominio;

public class QuartoCasal extends Quarto {
    private double valorBercoExtra;

    public QuartoCasal(double valorDiaria, boolean arCondicionado, boolean hidromassagem, double valorBercoExtra) {
        super(valorDiaria, arCondicionado, hidromassagem);
        this.valorBercoExtra = valorBercoExtra;
    }

    public QuartoCasal(double valorDiaria, boolean arCondicionado, boolean hidromassagem, double valorBercoExtra, Residencia residencia) {
        super(valorDiaria, arCondicionado, hidromassagem, residencia);
        this.valorBercoExtra = valorBercoExtra;
    }

    @Override
    public void calcularAcressimo(int quantidade) {
        this.valorAcressimo += quantidade * this.valorBercoExtra;
    }

    @Override
    public void calcularValorFinal(long diarias) {
        this.valorTotal = (this.valorDiaria + this.valorAcressimo) * diarias;
    }

    public double getValorBercoExtra() {
        return valorBercoExtra;
    }

}
