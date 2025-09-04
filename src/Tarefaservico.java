import java.util.Scanner;

public class Tarefaservico {


    public Tarefa criar(){
        Scanner sc = new Scanner(System.in);

        Tarefa T = new Tarefa();

        System.out.print("Digite o título da tarefa: ");
        T.setTitulo(sc.nextLine());

        System.out.print("Digite o descrição da tarefa: ");
        T.setDescricao(sc.nextLine());


        return T;
    }


}