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




