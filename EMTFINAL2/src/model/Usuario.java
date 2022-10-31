package model;
public class Usuario {
    private int id;
    private String nome;
    private String email;
    private String senha;
    private String cre;

    public Usuario(String nome, String email, String senha, String cre) {
        this.nome = nome;
        this.email = email;
        this.senha = senha;
        this.cre = cre;
    }

    public Usuario(String email, String senha) {
        this.email = email;
        this.senha = senha;
    }
    
    
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public String getCre() {
        return cre;
    }

    public void setCre(String cre) {
        this.cre = cre;
    }

    
}
