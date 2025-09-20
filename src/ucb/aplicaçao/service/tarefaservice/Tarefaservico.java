package ucb.model.tarefas.Tarefa;

import java.util.List;
import java.util.Optional;

import java.util.ArrayList;

public class TarefaServico {
    private ArrayList<Tarefa> tarefas;
    private int contadorId;

    public TarefaServico() {
        this.tarefas = new ArrayList<>();
        this.contadorId = 1;
    }

    public void criar(String titulo, String descricao) {
        Tarefa t = new Tarefa(contadorId++, titulo, descricao);
        tarefas.add(t);
        System.out.println("✅ Tarefa criada com sucesso!");
    }

    public void listar() {
        if (tarefas.isEmpty()) {
            System.out.println("Nenhuma tarefa cadastrada.");
            return;
        }
        System.out.println("\n--- Lista de Tarefas ---");
        for (Tarefa t : tarefas) {
            System.out.println(t);
        }
        System.out.println("------------------------");
    }

    public void atualizar(int id, String novoTitulo, String novaDescricao) {
        for (Tarefa t : tarefas) {
            if (t.getId() == id) {
                t.setTitulo(novoTitulo);
                t.setDescricao(novaDescricao);
                System.out.println("✏️ Tarefa atualizada!");
                return;
            }
        }
        System.out.println("⚠️ Tarefa com ID " + id + " não encontrada.");
    }

    public void remover(int id) {
        boolean removida = tarefas.removeIf(t -> t.getId() == id);
        if (removida) {
            System.out.println("🗑️ Tarefa com ID " + id + " removida.");
        } else {
            System.out.println("⚠️ Tarefa com ID " + id + " não encontrada.");
        }
    }

    public void concluir(int id) {
        for (Tarefa t : tarefas) {
            if (t.getId() == id) {
                t.setCompleta(true);
                System.out.println("✅ Tarefa com ID " + id + " concluída!");
                return;
            }
        }
        System.out.println("⚠️ Tarefa com ID " + id + " não encontrada.");
    }
}