import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;


public class Tarefa {
    private int id;
    private String Titulo;
    private String descricao;
    private boolean completa;
    private String dataAgora;

    public Tarefa(int id, String Titulo, String descricao,){
        this.id = id;
        this.Titulo = Titulo;
        this.descricao = descricao;
        this.completa = false;
        this.dataAgora = new date();
    }

}
