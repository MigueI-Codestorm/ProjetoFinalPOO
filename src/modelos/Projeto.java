package modelos;

import tipos.StatusProjeto;
import ajuda.Exibicao;
import ajuda.ErroDeLogica;
import java.util.Date;
import java.util.List;
import java.util.ArrayList;

public class Projeto implements Exibicao {

    private int idProjeto;
    private String nome;
    private String descricao;
    private Date dataInicio;
    private Date dataConclusao;
    private StatusProjeto status;
    private Usuario responsavel;
    private List<Usuario> participantes;
    private List<Tarefa> tarefas; 

    //Construtor
    public Projeto(int idProjeto, String nome, String descricao, Date dataInicio, Usuario responsavel) {
        this.idProjeto = idProjeto;
        this.nome = nome;
        this.descricao = descricao;
        this.dataInicio = dataInicio;
        this.responsavel = responsavel;
        this.status = StatusProjeto.ATIVO;
        this.tarefas = new ArrayList<>();
        this.participantes = new ArrayList<>();
        this.participantes.add(responsavel);
        responsavel.atribuirProjeto(this); 
    }

    public void adicionarParticipante(Usuario novoParticipante) throws ErroDeLogica {

        if (this.participantes.contains(novoParticipante)) {
            throw new ErroDeLogica("O usuário " + novoParticipante.getNome() + " já é participante deste projeto.");
        }
        
        this.participantes.add(novoParticipante);
        novoParticipante.atribuirProjeto(this);
        System.out.println(novoParticipante.getNome() + " foi adicionado ao projeto.");
    }

    public void adicionarTarefa(Tarefa novaTarefa) {
        if (!this.tarefas.contains(novaTarefa)) {
            this.tarefas.add(novaTarefa);
            System.out.println("Tarefa '" + novaTarefa.getTitulo() + "' adicionada ao projeto.");
        }
    }

    public void removerTarefa(Tarefa tarefa) {
        this.tarefas.remove(tarefa);
        System.out.println("Tarefa '" + tarefa.getTitulo() + "' removida.");
    }

    @Override
    public void exibirDetalhes() {
        System.out.println("Detalhes do Projeto");
        System.out.println("ID: " + this.idProjeto);
        System.out.println("Projeto: " + this.nome);
        System.out.println("Responsável: " + this.responsavel.getNome());
        System.out.println("Status: " + this.status);
        System.out.println("Nº de Participantes: " + this.participantes.size());
        System.out.println("Nº de Tarefas: " + this.tarefas.size());
    }

    //Getters e Setters

    public int getIdProjeto() {
        return idProjeto;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public List<Usuario> getParticipantes() {
        return participantes;
    }

    public List<Tarefa> getTarefas() {
        return tarefas;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Usuario getResponsavel() {
        return responsavel;
    }

    public void setResponsavel(Usuario responsavel) {
        this.responsavel = responsavel;
    }
}