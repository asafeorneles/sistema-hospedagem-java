package servico;

import dominio.Quarto;

public class CalcularDiaria {

    public static int CalcularDiaria(int diaIn, int mesIn, int anoIn, double horarioIn, int diaOut, int mesOut, int anoOut, double horarioOut) {
        int diarias = 0;
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

        return diarias == 0 ? 1 : diarias;
        // “Se a variável diarias for igual a 0, então retorne 1. Caso contrário, retorne o valor de diarias.”
    }

    public static int diasMeses(int mesIn) {
        int[] dias = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        return dias[mesIn - 1];
    }
}
