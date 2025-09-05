package ucb.aplicacao.view.main;

import ucb.aplicaçao.service.tarefaservice.Tarefaservico;
import ucb.aplicação.model.tarefas.Tarefa;

public class Main {
    public static void main(String[] args) {


        Tarefaservico servico = new Tarefaservico();

        Tarefa T = servico.criar();

        System.out.println("Título: " + T.getTitulo());



    }

}
