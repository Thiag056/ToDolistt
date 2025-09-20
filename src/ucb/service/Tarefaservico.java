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


}