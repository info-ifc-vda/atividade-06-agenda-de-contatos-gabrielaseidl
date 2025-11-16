public class Principal {
    public static void main(String[] args) {

        Agenda agenda = new Agenda();

        Contato c1 = new Contato("Gabriel");
        c1.adicionaTelefone("celular", "99999-9999");
        c1.adicionaEmail("pessoal", "gabriel@email.com");

        Contato c2 = new Contato("Mariana");
        c2.adicionaEmail("profissional"," mariana.mari@gmail.com");
        c2.adicionaTelefone("casa", "3333-3333");

        agenda.adicionarContato(c1);
        agenda.adicionarContato(c2);

        agenda.listarContatos();

        System.out.println("Removendo Gabriel...");
        agenda.removerContato("Gabriel");

        agenda.listarContatos();
    }
}