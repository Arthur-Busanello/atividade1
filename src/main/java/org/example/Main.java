package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner myInput = new Scanner(System.in);
        List<Pessoas> pessoas = new ArrayList<>();

        int option;
        boolean exit = false;

        do {
            System.out.println("\nBem-vindo(a)");
            System.out.println("1 - Cadastrar nome, idade e até 2 endereços");
            System.out.println("2 - Listar pessoas e endereços");
            System.out.println("3 - Pesquisar pessoas");
            System.out.println("4 - Sair");

            option = myInput.nextInt();
            myInput.nextLine();

            switch (option) {
                case 1:
                    System.out.println("Cadastre um nome, idade e até 2 endereços.");

                    System.out.print("Nome: ");
                    String nome = myInput.nextLine();

                    System.out.print("Idade: ");
                    int idade = myInput.nextInt();
                    myInput.nextLine();

                    List<Endereco> enderecos = new ArrayList<>();
                    for (int i = 0; i < 2; i++) {
                        System.out.print("Endereço " + (i + 1) + " - Rua: ");
                        String rua = myInput.nextLine();

                        System.out.print("Endereço " + (i + 1) + " - Número: ");
                        int numero = myInput.nextInt();
                        myInput.nextLine();

                        enderecos.add(new Endereco(rua,numero));
                    }

                    Pessoas.cadastrarPessoa(nome, idade, enderecos,pessoas);
                    break;

                case 2:
                    System.out.println("Listando pessoas e endereços:");
                    Pessoas.listarPessoas(pessoas);
                    break;

                case 3:
                    System.out.println("Digite o nome para pesquisar:");
                    String searchName = myInput.nextLine();
                    Pessoas.pesquisarPessoas(searchName,pessoas);
                    break;

                case 4:
                    System.out.println("Encerrando atividades...");
                    exit = true;
                    break;

                default:
                    System.out.println("Opção inválida");
                    break;
            }
        } while (!exit);
    }
}
