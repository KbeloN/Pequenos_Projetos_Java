package Inicio;

import Cliente.Fisica;
import Cliente.Juridica;
import Cliente.Pessoa;
import Livros.Livro;
import java.util.Scanner;

public class Principal {
    
    //Métodos
    static void cadastrarPessoas() {
        Scanner esco = new Scanner(System.in);

        int escolha = 0;

        while (escolha != 3) {
            System.out.println("""
               Quem quer cadastrar?
               1 - Pessoa fisica
               2 - Pessoa Juridica
               3 - Voltar para o menu anterior
               """);
            escolha = esco.nextInt();

            switch (escolha) {
                case 1:
                    p[ultimoP] = new Fisica();
                    p[ultimoP].cadastro();
                    ultimoP++;
                    break;

                case 2:
                    p[ultimoP] = new Juridica();
                    p[ultimoP].cadastro();
                    ultimoP++;
                    break;

                case 3:
                    System.out.println("Retornando ao menu anterior");
                    break;

                default:
                    System.out.println("Valor invalido");
                    break;
            }
        }
    }
    
    static void imprimirPessoas() {
        int x = 0;       
        while (x != ultimoP) {
            p[x].imprimirInformacoes();
            x++;
        }
    }

    //Variáveis
    public static int ultimoP = 0;

    //Objetos / Classes pai.
    static Pessoa p[] = new Pessoa[10];

    public static void main(String[] args) {
        //Funções
        Scanner sc = new Scanner(System.in);

        //Variaveis
        int opcaoInicial = 0;

        while (opcaoInicial != 4) {
            System.out.println("""
                         1 - Comprar um livro
                         2 - Cadastrar uma pessoa no banco de dados
                         3 - imprimir pessoas cadastradas
                         4 - Sair do programa
                         """);
            opcaoInicial = sc.nextInt();

            switch (opcaoInicial) {
                case 1:
                    System.out.println("Cadastrando livro...");
                    break;

                case 2:
                    cadastrarPessoas();
                    break;

                case 3:
                    imprimirPessoas();
                    break;

                case 4:
                    System.out.println("Saindo do programa");
                    break;

                default:
                    System.out.println("Valor invalido");
                    break;
            }
        }
    }
}
