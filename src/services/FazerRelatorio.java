package services;

import model.*;

import java.io.*;
import java.time.format.DateTimeFormatter;

public class FazerRelatorio {
    public static void imprimeRelatorio(Reserva reserva) {

        File file = new File("src/data/relatorio.txt");
        try (FileWriter fw = new FileWriter(file);
        BufferedWriter bw = new BufferedWriter(fw)){

            bw.write("=== DADOS DO CLIENTE ===");
            bw.newLine();

            String nome = reserva.getCliente().getNome();
            bw.write("Nome: " + nome);
            bw.newLine();

            String cpf = reserva.getCliente().getCpf();
            bw.write("Cpf: " + cpf);
            bw.newLine();

            String email = reserva.getCliente().getEmail();
            bw.write("Email: " + email);
            bw.newLine();

            String telefone = reserva.getCliente().getTelefone();
            bw.write("Número de contato: " + telefone);
            bw.newLine();

            String endereco = reserva.getCliente().getEndereco();
            bw.write("Endereço: " + endereco);
            bw.newLine();bw.newLine();

            bw.write("=== RELATÓRIO DE RESERVA ===");
            bw.newLine();

            Quarto quarto = reserva.getQuarto();
            Residencia residencia = quarto.getResidencia();
            String tipoResidencia = "Residencia: " + residencia.getNome();
            bw.write(tipoResidencia);
            bw.newLine();

            String tipoQuarto = null;
            if (quarto instanceof QuartoSolteiro) {
                tipoQuarto = "Quarto: Solteiro";
            } else if (quarto instanceof QuartoCasal) {
                tipoQuarto = "Quarto: Casal";
            }

            bw.write(tipoQuarto);
            bw.newLine();

            DateTimeFormatter DataForrmatterBR = DateTimeFormatter.ofPattern("dd/MM/yyyy");
            DateTimeFormatter TimeForrmatterBR = DateTimeFormatter.ofPattern("HH:mm");

            String dataCheckin = "Data do checkin: " + reserva.getDataCheckin().format(DataForrmatterBR);
            String horaCheckin = "Horário do checkin: " + reserva.getDataCheckin().format(TimeForrmatterBR);

            bw.write(dataCheckin);
            bw.newLine();
            bw.write(horaCheckin);
            bw.newLine();

            String dataCheckout = "Data do checkout: " + reserva.getDataCheckout().format(DataForrmatterBR);
            String horaCheckout = "Horário do checkout: " + reserva.getDataCheckout().format(TimeForrmatterBR);

            bw.write(dataCheckout);
            bw.newLine();
            bw.write(horaCheckout);
            bw.newLine();

        String Sdiarias = "Quantidade de diárias: " + reserva.getDiarias();
        String valorTotal = String.format("Total a pagar: R$ %.2f", quarto.getValorTotal());

            bw.write(Sdiarias);
            bw.newLine();
            bw.write(valorTotal);

            bw.flush();

        } catch (IOException e) {
            throw new RuntimeException("Erro ao escrever relatório");
        }

        try (FileReader fr = new FileReader(file);
        BufferedReader br = new BufferedReader(fr)) {
            String line;
            while ((line = br.readLine()) != null){
                System.out.println(line);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
