import java.util.Scanner;

public class Tarefaservico {
    int id;

    public void criar(){
        Scanner sc = new Scanner(System.in);

        Tarefa T = new Tarefa();

        System.out.print("Digite o título da tarefa: ");
        T.setTitulo(sc.nextLine());



    }


}