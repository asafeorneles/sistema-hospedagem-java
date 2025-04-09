package dominio;

public class Reserva {
    private int diaIn;
    private int mesIn;
    private int anoIn;
    private double horarioIn;
    private int diaOut;
    private int mesOut;
    private int anoOut;
    private double horarioOut;
    private int diarias;
    private Quarto quarto;

    public Reserva(int diaIn, int mesIn, int anoIn, double horarioIn, int diaOut, int mesOut, int anoOut, double horarioOut, Quarto quarto) {
        this.diaIn = diaIn;
        this.mesIn = mesIn;
        this.anoIn = anoIn;
        this.horarioIn = horarioIn;
        this.diaOut = diaOut;
        this.mesOut = mesOut;
        this.anoOut = anoOut;
        this.horarioOut = horarioOut;
        this.quarto = quarto;
    }

    public int getDiaIn() {
        return diaIn;
    }

    public int getMesIn() {
        return mesIn;
    }

    public int getAnoIn() {
        return anoIn;
    }

    public double getHorarioIn() {
        return horarioIn;
    }

    public int getDiaOut() {
        return diaOut;
    }

    public int getMesOut() {
        return mesOut;
    }

    public int getAnoOut() {
        return anoOut;
    }

    public double getHorarioOut() {
        return horarioOut;
    }

    public Quarto getQuarto() {
        return quarto;
    }

    public int getDiarias() {
        return diarias;
    }

    public void setDiarias(int diarias) {
        this.diarias = diarias;
    }
}
