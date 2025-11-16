import java.util.ArrayList;

public class Contato {
    private String nome;
    private ArrayList<Telefone> telefones;
    private ArrayList<Email> emails;

    public Contato(String nome) {
        this.nome = nome;
        this.telefones = new ArrayList<>();
        this.emails = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public void adicionaTelefone(String rotulo, String numero) {
        telefones.add(new Telefone(rotulo, numero));
    }

    public void adicionaEmail(String rotulo, String endereco) {
        emails.add(new Email(rotulo, endereco));
    }

    public ArrayList<Telefone> getTelefones() {
        return telefones;
    }

    public ArrayList<Email> getEmails() {
        return emails;
    }

    @Override
    public String toString() {
        return "\nNome: " + nome +
               "\nTelefones: " + telefones +
               "\nEmails: " + emails + "\n";
    }
}