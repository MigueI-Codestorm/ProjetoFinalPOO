package modelos;

//Importando classes de outras pastas + classes do java
import tipos.StatusUsuario;
import ajuda.Exibicao;
import java.util.Date;
import java.util.List;
import java.util.ArrayList;

public class Usuario implements Exibicao {

    private int idUsuario;
    private String nome;
    private String email;
    private String senha;
    private Date dataNascimento;
    private StatusUsuario status;
    private List<Projeto> projetos;

    public Usuario(int idUsuario, String nome, String email, String senha, Date dataNascimento) {
        this.idUsuario = idUsuario;
        this.nome = nome;
        this.email = email;
        this.senha = senha;
        this.dataNascimento = dataNascimento;

        this.status = StatusUsuario.ATIVO;
        this.projetos = new ArrayList<>();
    }

    public boolean login(String email, String senha) {

        if (this.email.equals(email) && this.senha.equals(senha)) {
            System.out.println("Login de " + this.nome + " realizado com sucesso.");
            return true;
        }
        System.out.println("Falha no login: email ou senha incorretos.");
        return false;
    }

    public void logout() {
        System.out.println("Saindo de " + this.nome + ".");
    }

    public void atribuirProjeto(Projeto projeto) {
        if (!this.projetos.contains(projeto)) {
            this.projetos.add(projeto);
        }
    }

    @Override
    public void exibirDetalhes() {
        System.out.println("Detalhes do Usuário");
        System.out.println("ID: " + this.idUsuario);
        System.out.println("Nome: " + this.nome);
        System.out.println("Email: " + this.email);
        System.out.println("Status: " + this.status);
        System.out.println("Nº de Projetos: " + this.projetos.size());
    }

    public int getIdUsuario() {
        return idUsuario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public Date getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(Date dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public StatusUsuario getStatus() {
        return status;
    }

    public void setStatus(StatusUsuario status) {
        this.status = status;
    }

    public List<Projeto> getProjetos() {
        return projetos;
    }
    
}