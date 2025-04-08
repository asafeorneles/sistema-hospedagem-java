package test;

import dominio.*;

import java.util.Scanner;

public class HospedagemTest01 {

    // AGORA, FALTA FAZER O METODO STATIC PARA FAZER CHECKIN E CHECKOUT

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        QuartoSolteiro quartoSolteiro1 = new QuartoSolteiro(150, true, true, 60);
        QuartoSolteiro quartoSolteiro2 = new QuartoSolteiro(120, true, false, 50);
        QuartoSolteiro quartoSolteiro3 = new QuartoSolteiro(100, false, false, 40);

        QuartoCasal quartoCasal1 = new QuartoCasal(200, true, true, 50);
        QuartoCasal quartoCasal2 = new QuartoCasal(180, true, false, 40);
        QuartoCasal quartoCasal3 = new QuartoCasal(150, false, false, 30);

        Quarto[] quartosA = {quartoSolteiro1, quartoCasal1};
        Quarto[] quartosB = {quartoSolteiro2, quartoCasal2};
        Quarto[] quartosC = {quartoSolteiro3, quartoCasal3};

        Residencia residenciaA = new Residencia("Rua a", "30", "3189009", "31 985928022", "residenciaa@gmail.com", quartosA);
        Residencia residenciaB = new Residencia("Rua b", "15", "3164382", "31 989384392", "residenciab@gmail.com", quartosB);
        Residencia residenciaC = new Residencia("Rua c", "40", "3105983", "31 993212043", "residenciac@gmail.com", quartosC);

        int opcaoResidencia;
        int opcaoQuarto;

        cadastroCliente(entrada);

        do {
            System.out.println("Escolha sua residencia: (No momento, possuimos 3)");
            System.out.println("1 - Residencia A");
            System.out.println("2 - Residencia B");
            System.out.println("3 - Residencia C");
            opcaoResidencia = entrada.nextInt();

            if (opcaoResidencia == 1) {
                do {
                    System.out.println("Temos os seguintes quartos disponiveis na Residencia A: ");
                    System.out.printf("1 - Quarto de solteiro - Valor da diária: R$ %.2f / Preco por cama extra: R$ %.2f\n", quartoSolteiro1.getValorDiaria(), quartoSolteiro1.getValorCamaExtra());
                    System.out.printf("2 - Quarto de casal - Valor da diária: R$ %.2f / Preco por adicional de berco: R$ %.2f\n", quartoCasal1.getValorDiaria(), quartoCasal1.getValorBercoExtra());
                    System.out.println("Qual te atenderia melhor?");
                    opcaoQuarto = entrada.nextInt();
                    if (opcaoQuarto == 1) {
                        adicionarCamasExtras(quartoSolteiro1, entrada);
                    }
                    else if (opcaoQuarto == 2) {
                        adicionarBercosExtras(quartoCasal1, entrada);
                    }
                    else {
                        System.out.println("Nao temos essa opçao! selecione 1, 2 ou 3.");
                    }
                }
                while (opcaoQuarto != 1 && opcaoQuarto != 2);

            }
            else if (opcaoResidencia == 2) {
                do {
                    System.out.println("Temos os seguintes quartos disponiveis Residencia B: ");
                    System.out.printf("1 - Quarto de solteiro - Valor da diária: R$ %.2f / Preco por cama extra: R$ %.2f\n", quartoSolteiro2.getValorDiaria(), quartoSolteiro2.getValorCamaExtra());
                    System.out.printf("2 - Quarto de casal - Valor da diária: R$ %.2f / Preco por adicional de berco: R$ %.2f\n", quartoCasal2.getValorDiaria(), quartoCasal2.getValorBercoExtra());
                    System.out.println("Qual te atenderia melhor?");
                    opcaoQuarto = entrada.nextInt();
                    if (opcaoQuarto == 1) {
                        adicionarCamasExtras(quartoSolteiro1, entrada);
                    }
                    else if (opcaoQuarto == 2) {
                        adicionarBercosExtras(quartoCasal1, entrada);
                    }
                    else {
                        System.out.println("Nao temos essa opçao! selecione 1, 2 ou 3.");
                    }
                }
                while (opcaoQuarto != 1 && opcaoQuarto != 2);

            }
            else if (opcaoResidencia == 3) {
                do {
                    System.out.println("Temos os seguintes quartos disponiveis Residencia C: ");
                    System.out.printf("1 - Quarto de solteiro - Valor da diária: R$ %.2f / Preco por cama extra: R$ %.2f\n", quartoSolteiro3.getValorDiaria(), quartoSolteiro3.getValorCamaExtra());
                    System.out.printf("2 - Quarto de casal - Valor da diária: R$ %.2f / Preco por adicional de berco: R$ %.2f\n", quartoCasal3.getValorDiaria(), quartoCasal3.getValorBercoExtra());
                    System.out.println("Qual te atenderia melhor?");
                    opcaoQuarto = entrada.nextInt();
                    if (opcaoQuarto == 1) {
                        adicionarCamasExtras(quartoSolteiro1, entrada);
                    }
                    else if (opcaoQuarto == 2) {
                        adicionarBercosExtras(quartoCasal1, entrada);
                    }
                    else {
                        System.out.println("Nao temos essa opçao! selecione 1, 2 ou 3.");
                    }
                }
                while (opcaoQuarto != 1 && opcaoQuarto != 2);

            }
            else {
                System.out.println("Nao temos essa opçao! selecione 1, 2 ou 3.");
            }
        }
        while (opcaoResidencia != 1 && opcaoResidencia !=2 && opcaoResidencia != 3);

    }

    // PERGUNTAR AO DON SE ESSES METODOS DEVERIAM ESTAR NO PACOTE SERVIÇO

    public static void cadastroCliente(Scanner entrada) {
        System.out.println("Bem vindo! Por favor, informe os dados do cliente:");
        System.out.println("Nome:" );
        String nome = entrada.nextLine();
        System.out.println("Cpg: ");
        String cpf = entrada.nextLine();
        System.out.println("Endereco:" );
        String endereco = entrada.nextLine();
        System.out.println("Telefone:" );
        String telefone = entrada.nextLine();
        System.out.println("Email:" );
        String email = entrada.nextLine();

        Cliente cliente = new Cliente(nome, cpf, endereco, telefone, email);
    }

    public static void adicionarCamasExtras(Quarto quarto, Scanner entrada) {
        int quantidade;
        int opcao;
        do {
            System.out.println("Trabalhamos com camas extras: ");
            System.out.println("1 - Adicionar cama extra");
            System.out.println("2 - Fazer reserva");
            opcao = entrada.nextInt();

            if (opcao == 1) {
                System.out.println("Informe a quantidade de camas extra: ");
                quantidade = entrada.nextInt();
                quarto.calcularAcressimo(quantidade);
                System.out.println("Valor extra: " +  quarto.getValorAcressimo());
            }
            else if (opcao == 2) {
                return;
            }
            else {
                System.out.println("Opcao invalida!");
            }
        }
        while (opcao != 1 && opcao != 2);
    }

    public static void adicionarBercosExtras(Quarto quarto, Scanner entrada) {
        int quantidade;
        int opcao;
        do {
            System.out.println("Possuimos bercos tabém: ");
            System.out.println("1 - Adicionar berco extra");
            System.out.println("2 - Fazer reserva");
            opcao = entrada.nextInt();

            if (opcao == 1) {
                System.out.println("Informe a quantidade de bercos extra: ");
                quantidade = entrada.nextInt();
                quarto.calcularAcressimo(quantidade);
            }
            if (opcao == 2) {
                return;
            }
        }
        while (opcao != 1 && opcao != 2);
    }
}
