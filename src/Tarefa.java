import java.time.LocalDateTime;



public class Tarefa {
    private int id;
    private String Titulo;
    private String descricao;
    private boolean completa;
    private String dataAgora;

    public Tarefa(int id, String Titulo, String descricao, String dataAgora, boolean completa){
        this.id = id;
        this.Titulo = Titulo;
        this.descricao = descricao;
        this.completa = completa;
        this.dataAgora = dataAgora;

    }

    public int getId(){return id;}
    public String getTitulo(){return Titulo;}
    public void setTitulo(String Titulo){this.Titulo = Titulo;}
    public String getDescricao(){return descricao;}
    public void setDescricao(String descricao){this.descricao = descricao;}
    public boolean isCompleta(){return completa;}
    public void setCompleta(boolean completa){this.completa = completa;}
    public String getDataAgora() {return dataAgora;}
    public void setDataAgora(String dataAgora) {this.dataAgora = dataAgora;}
}
