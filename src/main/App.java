package main;

import modelos.Projeto;
import modelos.Tarefa;
import modelos.Usuario;
import tipos.StatusTarefa;
import ajuda.ErroDeLogica;
import ajuda.Exibicao;

import java.util.Date;
import java.util.List;
import java.util.ArrayList;

public class App {

    public static void main(String[] args) {
        
        //Criando Objetos
        Usuario user1 = new Usuario(1, "Ana Silva", "ana@email.com", "senha123", new Date());
        Usuario user2 = new Usuario(2, "Bruno Costa", "bruno@email.com", "senha456", new Date());

        Projeto projetoJava = new Projeto(101, "Sistema de E-commerce", "Plataforma de vendas online", new Date(), user1);

        Tarefa tarefa1 = new Tarefa(1001, "Modelagem do Banco de Dados", "Definir tabelas", projetoJava.getIdProjeto());
        Tarefa tarefa2 = new Tarefa(1002, "Criação da API de Login", "Endpoint de autenticação", projetoJava.getIdProjeto());

        projetoJava.adicionarTarefa(tarefa1);
        projetoJava.adicionarTarefa(tarefa2);
        tarefa1.atualizarStatus(StatusTarefa.FAZENDO);

        List<Exibicao> listaDeItens = new ArrayList<>();
        listaDeItens.add(user1);
        listaDeItens.add(projetoJava);
        listaDeItens.add(tarefa1);
        
        for (Exibicao item : listaDeItens) {
            item.exibirDetalhes();
        }

        try {

            projetoJava.adicionarParticipante(user2); 
            projetoJava.adicionarParticipante(user1); 

        } catch (ErroDeLogica e) {

            System.out.println("Erro capturado: " + e.getMessage());
        } finally {

        }
        
        projetoJava.exibirDetalhes();
    }
}