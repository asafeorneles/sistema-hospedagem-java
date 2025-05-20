package servico;

import dominio.*;

import java.time.format.DateTimeFormatter;

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

        DateTimeFormatter DataForrmatterBR = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        DateTimeFormatter TimeForrmatterBR = DateTimeFormatter.ofPattern("HH:mm");

        System.out.println("Data do checkin: " + reserva.getDataCheckin().format(DataForrmatterBR));
        System.out.println("Horário do checkin: " + reserva.getDataCheckin().format(TimeForrmatterBR));

        System.out.println("Data do checkout: " + reserva.getDataCheckout().format(DataForrmatterBR));
        System.out.println("Horário do checkout: " + reserva.getDataCheckout().format(TimeForrmatterBR));

        System.out.println("Quantidade de diárias: " + reserva.getDiarias());

        System.out.printf("Total a pagar: R$ %.2f", quarto.getValorTotal());

    }
}
