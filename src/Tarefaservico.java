public class Tarefaservico {
    public void visualizar(Tarefa tarefa) {
        System.out.println("ID: " + tarefa.getId());
        System.out.println("Título: " + tarefa.getTitulo());
        System.out.println("Descrição: " + tarefa.getDescricao());
        System.out.println("Completa: " + tarefa.isCompleta());
        System.out.println("Data: " + tarefa.getDataAgora());
    }
}