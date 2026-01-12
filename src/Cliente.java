import java.time.LocalDate;

public class Cliente {
    private String nome;
    private String email;
    private LocalDate nasc;

    public Cliente() {

    }

    public Cliente(String nome, String email, LocalDate nasc) {
        this.nome = nome;
        this.email = email;
        this.nasc = nasc;
    }

    public LocalDate getNasc() {
        return nasc;
    }

    public void setNasc(LocalDate nasc) {
        this.nasc = nasc;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
