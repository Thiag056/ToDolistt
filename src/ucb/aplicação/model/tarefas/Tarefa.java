package ucb.aplicação.model.tarefas;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Tarefa {
    private int id;
    private String Titulo;
    private String descricao;
    private boolean completa;
    private LocalDateTime dataAgora;

    public Tarefa(int id, String titulo, String descricao) {

        this.id = id;
        this.Titulo = titulo;
        this.descricao = descricao;
        this.completa = false;
        this.dataAgora = LocalDateTime.now();
    }
    public int getId() {
        return id;
    }

    public String getTitulo() {
        return Titulo;
    }

    public String getDescricao() {
        return descricao;
    }

    public boolean isCompleta() {
        return completa;
    }

    public LocalDateTime get DataDeCriacao() {
        return DataDeCriacao;
    }

    // Setters
    public void setTitulo(String titulo) {
        this.Titulo = titulo;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public void setCompleta(boolean completa) {
        this.completa = completa;
    }

    @Override
    public String toString() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
        String dataFormatada = dataAgora.format(formatter);

        return "ID: " + id +
                " | Título: " + Titulo +
                " | Descrição: " + descricao +
                " | Concluída: " + (completa ? "Sim" : "Não") +
                " | Criada em: " + dataFormatada;
    }}
