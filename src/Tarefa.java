import java.time.LocalDateTime;

public class Tarefa {
    private int id;
    private String Titulo;
    private String descricao;
    private boolean completa;
    private String dataAgora;

    public Tarefa() {


    }
    public int getId() {
        return this.id;
    }
    public String getTitulo() {
        return this.Titulo;
    }
    public void setTitulo(String Titulo) {
        this.Titulo = Titulo;
    }
    public String getDescricao() {
        return this.descricao;
    }
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    public boolean isCompleta() {
        return this.completa;
    }
    public void setCompleta(boolean completa) {
        this.completa = completa;
    }
    public String getDataAgora() {
        return this.dataAgora;
    }
    public void setDataAgora(String dataAgora) {
        this.dataAgora = dataAgora;
    }
}
