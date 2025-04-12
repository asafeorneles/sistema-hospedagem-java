package servico;

import dominio.*;

import java.util.Scanner;

public class ReservaController {

    public static void iniciar(Scanner entrada) {

        Residencia residenciaA = new Residencia("Residencia A", "Rua a", "30", "3189009", "31 985928022", "residenciaa@gmail.com");
        Residencia residenciaB = new Residencia("Residencia B","Rua b", "15", "3164382", "31 989384392", "residenciab@gmail.com");
        Residencia residenciaC = new Residencia("Residencia C","Rua c", "40", "3105983", "31 993212043", "residenciac@gmail.com");

        QuartoSolteiro quartoSolteiroA = new QuartoSolteiro(150, true, true, 60, residenciaA);
        QuartoSolteiro quartoSolteiroB = new QuartoSolteiro(120, true, false, 50, residenciaA);
        QuartoSolteiro quartoSolteiroC = new QuartoSolteiro(100, false, false, 40, residenciaC);

        QuartoCasal quartoCasalA = new QuartoCasal(200, true, true, 50, residenciaA);
        QuartoCasal quartoCasalB = new QuartoCasal(180, true, false, 40, residenciaB);
        QuartoCasal quartoCasalC = new QuartoCasal(150, false, false, 30, residenciaC);

        Quarto[] quartosA = {quartoSolteiroA, quartoCasalA};
        Quarto[] quartosB = {quartoSolteiroB, quartoCasalB};
        Quarto[] quartosC = {quartoSolteiroC, quartoCasalC};

        residenciaA.setQuartos(quartosA);
        residenciaB.setQuartos(quartosB);
        residenciaC.setQuartos(quartosC);

        cadastroCliente(entrada);
        escolherResidencia(residenciaA, residenciaB, residenciaC, entrada);
    }

    public static void cadastroCliente(Scanner entrada) {
        System.out.println("Bem vindo! Por favor, informe os dados do cliente:");
        System.out.println("Nome:" );
        String nome = entrada.nextLine();
        System.out.println("Cpf: ");
        String cpf = entrada.nextLine();
        System.out.println("Endereco:" );
        String endereco = entrada.nextLine();
        System.out.println("Telefone:" );
        String telefone = entrada.nextLine();
        System.out.println("Email:" );
        String email = entrada.nextLine();

        Cliente cliente = new Cliente(nome, cpf, endereco, telefone, email);
    }

    public static void escolherResidencia(Residencia a, Residencia b, Residencia c, Scanner entrada) {
        int opcao;
        do {
            System.out.println("Escolha um residencia:");
            System.out.println("1 - Residencia A");
            System.out.println("2 - Residencia B");
            System.out.println("3 - Residencia C");
            opcao = entrada.nextInt();

            switch (opcao) {
                case 1: escolherQuarto(a.getQuartos(), entrada); break;
                case 2: escolherQuarto(b.getQuartos(), entrada); break;
                case 3: escolherQuarto(c.getQuartos(), entrada); break;
                default:
                    System.out.println("Selecione apenas 1, 2 ou 3!");
                    break;
            }
        }
        while (opcao < 1 || opcao > 3);
    }

    public static void escolherQuarto(Quarto [] quartos, Scanner entrada) {
        int opcao;
        Quarto quartoSolteiro = null;
        Quarto quartoCasal = null;
        do {
            System.out.println("Quartos disponiveis nesta residencia: ");
            for (int i = 0; i < quartos.length; i++) {
                Quarto quarto = quartos[i];
                if (quarto instanceof QuartoSolteiro) {
                    QuartoSolteiro solteiro = (QuartoSolteiro) quarto;
                    System.out.println("1 - Quarto de solteiro:\nValor da diaria: " + solteiro.getValorDiaria() + "\nValor do acrescimo de camas: " + solteiro.getValorCamaExtra());
                    System.out.println();
                    quartoSolteiro = solteiro;
                    continue;
                } else if (quarto instanceof QuartoCasal) {
                    QuartoCasal casal = (QuartoCasal) quarto;
                    System.out.println("2 - Quarto de casal:\nValor da diaria: " + casal.getValorDiaria() + "\nValor do acrescimo de bercos: " + casal.getValorBercoExtra());
                    quartoCasal = casal;
                }
            }
            opcao = entrada.nextInt();
            switch (opcao) {
                case 1:
                    adicionarCamasExtras(quartoSolteiro, entrada);
                    break;
                case 2:
                    adicionarBercosExtras(quartoCasal, entrada);
                    break;
                default: System.out.println("Selecione apenas 1, ou 2!");
                break;
            }
        }
        while (opcao < 1 || opcao > 2);
    }

    public static void adicionarCamasExtras(Quarto quarto, Scanner entrada) {
        int opcao;
        do {
            System.out.println("1 - Adicionar camas extras");
            System.out.println("2 - Fazer reserva");
            opcao = entrada.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("Informe a quantidade de camas extra: ");
                    int quantidade = entrada.nextInt();
                    quarto.calcularAcressimo(quantidade);
                    break;
                case 2:
                    fazerReserva(entrada, quarto);
                    break;
                default: System.out.println("Selecione apenas 1, ou 2!");
                break;
            }
        }
        while (opcao != 2);
    }

    public static void adicionarBercosExtras(Quarto quarto, Scanner entrada) {
        int opcao;
        do {
            System.out.println("1 - Adicionar bercos extras");
            System.out.println("2 - Fazer reserva");
            opcao = entrada.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("Informe a quantidade de bercos extra: ");
                    int quantidade = entrada.nextInt();
                    quarto.calcularAcressimo(quantidade);
                    break;
                case 2:
                    fazerReserva(entrada, quarto);
                    break;
                default: System.out.println("Selecione apenas 1, ou 2!");
                break;
            }
        }
        while (opcao !=2);
    }

    public static void fazerReserva(Scanner entrada, Quarto quarto) {
        System.out.println("Cadastro do checkin");
        System.out.println("Informe o dia do checkin: ");
        int diaIn = entrada.nextInt();
        System.out.println("Informe o mes do checkin: ");
        int mesIn = entrada.nextInt();
        System.out.println("Informe o ano do checkin: ");
        int anoIn = entrada.nextInt();
        System.out.println("Informe o horario do checkin (\".\" representa \":\"): ");
        double horarioIn = entrada.nextDouble();

        System.out.println("Cadastro do checkout");
        System.out.println("Informe o dia do checkout: ");
        int diaOut = entrada.nextInt();
        System.out.println("Informe o mes do checkout: ");
        int mesOut = entrada.nextInt();
        System.out.println("Informe o ano do checout: ");
        int anoOut = entrada.nextInt();
        System.out.println("Informe o horario do checkout (\".\" representa \":\"): ");
        double horarioOut = entrada.nextDouble();

        Reserva reserva = new Reserva(diaIn, mesIn, anoIn, horarioIn, diaOut, mesOut, anoOut, horarioOut, quarto);

        int diarias = CalcularDiaria.CalcularDiaria(diaIn, mesIn, anoIn, horarioIn, diaOut, mesOut, anoOut, horarioOut);
        reserva.setDiarias(diarias);

        quarto.calcularValorFinal(diarias);
        FazerRelatorio.imprimeRelatorio(reserva);
    }
}
