package test;

import servico.ReservaController;

import java.util.Scanner;

public class HospedagemTest {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        ReservaController.iniciar(entrada);
    }
}
