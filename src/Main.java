

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Tarefa T = new Tarefa(1, "Estudar Java", "Aprender POO", "03/09/2025");

        Tarefaservico serviso = new Tarefaservico();
        serviso.mostrarTarefa(T);
    }
}



