package servico;

import dominio.*;

public class FazerRelatorio {
    public static void imprimeRelatorio(Reserva reserva) {
        System.out.println("=== RELATÓRIO DE RESERVA ===");
        Quarto quarto = reserva.getQuarto();
        Residencia residencia = quarto.getResidencia();
        System.out.println("Residencia: " + residencia.getNome());
        if (quarto instanceof QuartoSolteiro) {
            System.out.println("Quarto: Solteiro");
        } else if (quarto instanceof QuartoCasal) {
            System.out.println("Quarto: Casal");
        }

        System.out.printf("Data da entrada: %d/%d/%d\n", reserva.getDiaIn(), reserva.getMesIn(), reserva.getAnoIn());
        System.out.println("Hora da entrada: " + reserva.getHorarioIn());
        System.out.printf("Data da saída: %d/%d/%d\n", reserva.getDiaOut(), reserva.getMesOut(), reserva.getAnoOut());
        System.out.println("Hora da saida: " + reserva.getHorarioOut());
        System.out.println("Total de diarias: " + reserva.getDiarias());

        System.out.println("Total a pagar: " + quarto.getValorTotal());

    }
}
