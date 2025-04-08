package servico;

public class CalcularDiaria {
    private int diaIn;
    private int diaOut;
    private int mesIn;
    private int mesOut;
    private int anoIn;
    private int anoOut;
    private double horarioIn;
    private double horarioOut;
    private int diarias;

    public void CalcularDiaria() {
        while (anoIn < anoOut || mesIn < mesOut || diaIn < diaOut) {
            diarias++;
            diaIn++;

            if (diaIn > diasMeses(mesIn)) {
                mesIn++;
                diaIn = 1;
            }

            if (mesIn > 12) {
                anoIn++;
                mesIn = 1;
            }
        }
        if (horarioOut >= 12) {
            diarias++;
        }

        if (diarias == 0) {
            diarias = 1;
        }
    }

    public static int diasMeses(int mesOut) {
        int[] dias = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        return dias[mesOut - 1];
    }

    public int getDiaIn() {
        return diaIn;
    }

    public void setDiaIn(int diaIn) {
        this.diaIn = diaIn;
    }

    public int getDiaOut() {
        return diaOut;
    }

    public void setDiaOut(int diaOut) {
        this.diaOut = diaOut;
    }

    public int getMesIn() {
        return mesIn;
    }

    public void setMesIn(int mesIn) {
        this.mesIn = mesIn;
    }

    public int getMesOut() {
        return mesOut;
    }

    public void setMesOut(int mesOut) {
        this.mesOut = mesOut;
    }

    public double getHorarioIn() {
        return horarioIn;
    }

    public void setHorarioIn(double horarioIn) {
        this.horarioIn = horarioIn;
    }

    public double getHorarioOut() {
        return horarioOut;
    }

    public void setHorarioOut(double horarioOut) {
        this.horarioOut = horarioOut;
    }

    public int getAnoIn() {
        return anoIn;
    }

    public void setAnoIn(int anoIn) {
        this.anoIn = anoIn;
    }

    public int getAnoOut() {
        return anoOut;
    }

    public void setAnoOut(int anoOut) {
        this.anoOut = anoOut;
    }

    public int getDiarias() {
        return diarias;
    }
}
