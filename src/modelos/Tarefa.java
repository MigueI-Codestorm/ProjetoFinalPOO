package modelos;

import tipos.Prioridade;
import tipos.StatusTarefa;
import ajuda.Exibicao;
import java.util.Date;

public class Tarefa implements Exibicao {

    //Atributos
    private int idTarefa;
    private String titulo;
    private String descricao;
    private Date dataCriação;
    private Date dataConclusão;
    private Prioridade prioridade;
    private StatusTarefa status;
    private int idProjeto;

    //Construtor
    public Tarefa(int idTarefa, String titulo, String descricao, int idProjeto) {
        this.idTarefa = idTarefa;
        this.titulo = titulo;
        this.descricao = descricao;
        this.idProjeto = idProjeto;
        this.dataCriação = new Date();
        this.status = StatusTarefa.PENDENTE;
        this.prioridade = Prioridade.MEDIA;
    }

    public void atualizarStatus(StatusTarefa novoStatus) {
        this.status = novoStatus;
        System.out.println("Status da tarefa '" + this.titulo + "' atualizado para: " + novoStatus);
    }

    public void definirPrazo(Date dataConclusao) {
        this.dataConclusão = dataConclusao;
        System.out.println("Prazo da tarefa '" + this.titulo + "' definido para: " + dataConclusao);
    }

    @Override
    public void exibirDetalhes() {
        System.out.println("    Tarefa: " + this.titulo + "");
        System.out.println("    ID: " + this.idTarefa);
        System.out.println("    Status: " + this.status);
        System.out.println("    Prioridade: " + this.prioridade);
        System.out.println("    Descrição: " + this.descricao);
    }

    //Getters e Setters

    public int getIdTarefa() {
        return idTarefa;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public StatusTarefa getStatus() {
        return status;
    }

    public void setPrioridade(Prioridade prioridade) {
        this.prioridade = prioridade;
    }
}