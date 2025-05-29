package model;

public class QuartoSolteiro extends Quarto {
    private double valorCamaExtra;

    public QuartoSolteiro(double valorDiaria, boolean arCondicionado, boolean hidromassagem, double valorCamaExtra) {
        super(valorDiaria, arCondicionado, hidromassagem);
        this.valorCamaExtra = valorCamaExtra;
    }

    public QuartoSolteiro(double valorDiaria, boolean arCondicionado, boolean hidromassagem, double valorCamaExtra, Residencia residencia) {
        super(valorDiaria, arCondicionado, hidromassagem, residencia);
        this.valorCamaExtra = valorCamaExtra;
    }

    @Override
    public void calcularAcressimo(int quantidade) {
        this.valorAcressimo += quantidade * valorCamaExtra;
    }

    @Override
    public void calcularValorFinal(long diarias) {
        this.valorTotal = (this.valorDiaria + this.valorAcressimo) * diarias;
    }

    public double getValorCamaExtra() {
        return valorCamaExtra;
    }

}
