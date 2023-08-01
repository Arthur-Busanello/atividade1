package org.example;

import java.util.List;

public class Pessoas {
    private String nome;
    private int idade;
    private List<Endereco> enderecos;

    public Pessoas(String nome, int idade, List<Endereco> enderecos) {
        this.nome = nome;
        this.idade = idade;
        this.enderecos = enderecos;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public List<Endereco> getEnderecos() {
        return enderecos;
    }

    public void setEnderecos(List<Endereco> enderecos) {
        this.enderecos = enderecos;
    }
    public static void cadastrarPessoa(String nome, int idade, List<Endereco> enderecos, List<Pessoas> pessoas) {
        pessoas.add(new Pessoas(nome, idade, enderecos));
    }


    public static void listarPessoas(List<Pessoas> pessoas) {
        for (Pessoas pessoa : pessoas) {
            System.out.println("Nome: " + pessoa.getNome());
            System.out.println("Idade: " + pessoa.getIdade());

            List<Endereco> enderecos = pessoa.getEnderecos();
            for (int i = 0; i < enderecos.size(); i++) {
                Endereco endereco = enderecos.get(i);
                System.out.println("Endereço " + (i + 1) + ":");
                System.out.println("  Rua: " + endereco.getRua());
                System.out.println("  Número: " + endereco.getNumero());
            }

            System.out.println();
        }
    }
    public static void pesquisarPessoas(String searchName, List<Pessoas> pessoas) {
        boolean found = false;

        for (Pessoas pessoa : pessoas) {
            if (pessoa.getNome().equalsIgnoreCase(searchName)) {
                System.out.println("}-CLIENTE ENCONTRADO-{");
                System.out.println("Nome: " + pessoa.getNome());
                System.out.println("Idade: " + pessoa.getIdade());

                List<Endereco> enderecos = pessoa.getEnderecos();
                for (int i = 0; i < enderecos.size(); i++) {
                    Endereco endereco = enderecos.get(i);
                    System.out.println("Endereço " + (i + 1) + ":");
                    System.out.println("  Rua: " + endereco.getRua());
                    System.out.println("  Número: " + endereco.getNumero());
                }

                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("}-CLIENTE NÃO ENCONTRADO-{");
        }
    }
}
