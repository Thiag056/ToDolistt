package ucb.view;

import ucb.service.Tarefaservico;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Tarefaservico servico = new Tarefaservico();

        int opcao;
        do {
            System.out.println("\n=== MENU TO-DO LIST ===");
            System.out.println("1 - Criar tarefa");
            System.out.println("2 - Listar tarefas");
            System.out.println("3 - Atualizar tarefa");
            System.out.println("4 - Remover tarefa");
            System.out.println("5 - Concluir tarefa");
            System.out.println("0 - Sair");
            System.out.print("Escolha: ");

            try {
                opcao = sc.nextInt();
                sc.nextLine();
            } catch (java.util.InputMismatchException e) {
                System.out.println(" Entrada inválida. Digite um número.");
                sc.nextLine();
                opcao = -1;
            }

            switch (opcao) {
                case 1:
                    System.out.print("Título: ");
                    String titulo = sc.nextLine();
                    System.out.print("Descrição: ");
                    String descricao = sc.nextLine();
                    servico.criar(titulo, descricao);
                    break;
                case 2:
                    servico.listar();
                    break;
                case 3:
                    System.out.print("ID da tarefa para atualizar: ");
                    int idUpdate = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Novo título: ");
                    String novoTitulo = sc.nextLine();
                    System.out.print("Nova descrição: ");
                    String novaDescricao = sc.nextLine();
                    servico.atualizar(idUpdate, novoTitulo, novaDescricao);
                    break;
                case 4:
                    System.out.print("ID da tarefa para remover: ");
                    int idRemove = sc.nextInt();
                    servico.remover(idRemove);
                    break;
                case 5:
                    System.out.print("ID da tarefa para concluir: ");
                    int idConcluir = sc.nextInt();
                    servico.concluir(idConcluir);
                    break;
                case 0:
                    System.out.println(" Saindo...");
                    break;
                default:
                    System.out.println(" Opção inválida! Escolha uma opção de 0 a 5.");
            }
        } while (opcao != 0);

        sc.close();
    }
}



