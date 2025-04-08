package dominio;

public class QuartoSolteiro extends Quarto {
    private double valorCamaExtra;

    public QuartoSolteiro(double valorDiaria, boolean arCondicionado, boolean hidromassagem, double valorCamaExtra) {
        super(valorDiaria, arCondicionado, hidromassagem);
        this.valorCamaExtra = valorCamaExtra;
    }

    @Override
    public void calcularAcressimo(int quantidade) {
        this.valorAcressimo = quantidade * valorCamaExtra;
    }

    @Override
    public void calcularDiariaFinal() {
        this.valorDiaria += this.valorAcressimo;
    }

    public double getValorCamaExtra() {
        return valorCamaExtra;
    }
}
