package controlador;

public class Contato {
    private int id;
    private String nome;
    private String email;
    private String telefone;

    public Contato(int id, String nome, String email, String telefone) {
        this.id = id;
        this.nome = nome;
        this.email = email;
        this.telefone = telefone;
    }

    @Override
    public String toString() {
        return id + " | " + nome + " | " + telefone + " | " + email;
    }

    public static Contato criarContato(int id, String nome, String email, String telefone) {
        return new Contato(id, nome, email, telefone);
    }

    public int getId() {
        return id;
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

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
}
