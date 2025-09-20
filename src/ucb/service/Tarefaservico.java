package ucb.service;

import ucb.model.Tarefa;

import java.util.ArrayList;

public class Tarefaservico {
    private ArrayList<Tarefa> Tarefas;
    private int contadorId;

    public Tarefaservico() {
        this.Tarefas = new ArrayList<>();
        this.contadorId = 1;
    }

    public void criar(String titulo, String descricao) {
        Tarefa t = new Tarefa(contadorId++, titulo, descricao);
        Tarefas.add(t);
        System.out.println("Tarefa criada com sucesso!");
    }

    public void listar() {
        if (Tarefas.isEmpty()) {
            System.out.println("Nenhuma tarefa cadastrada.");
            return;
        }
        System.out.println("\n--- Lista de Tarefas ---");
        for (Tarefa t : Tarefas) {
            System.out.println(t);
        }
        System.out.println("------------------------");
    }

    public void atualizar(int id, String novoTitulo, String novaDescricao) {
        for (Tarefa t : Tarefas) {
            if (t.getId() == id) {
                t.setTitulo(novoTitulo);
                t.setDescricao(novaDescricao);
                System.out.println("Tarefa atualizada!");
                return;
            }
        }
        System.out.println("Tarefa com ID " + id + " não encontrada.");
    }

    public void remover(int id) {
        boolean removida = Tarefas.removeIf(t -> t.getId() == id);
        if (removida) {
            System.out.println("Tarefa com ID " + id + " removida.");
        } else {
            System.out.println("Tarefa com ID " + id + " não encontrada.");
        }
    }

    public void concluir(int id) {
        for (Tarefa t : Tarefas) {
            if (t.getId() == id) {
                t.setCompleta(true);
                System.out.println(" Tarefa com ID " + id + " concluída!");
                return;
            }
        }
        System.out.println(" Tarefa com ID " + id + " não encontrada.");
    }
}