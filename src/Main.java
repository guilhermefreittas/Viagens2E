import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        // Classe Objeto    Construtor
        Turista mochileiro = new Turista("Maia");
        // Definir formato do objeto
        mochileiro.setNome("Agnes");
        mochileiro.setCpf("123");
        Turista mochileira = new Turista();
        mochileira.setNome("Tomas");
        // Atribuição indireta
        String nome = JOptionPane.showInputDialog("Entre com o nome:");
        mochileira.setNome(nome);
        System.out.println("O nome do objeto é: " + mochileira.getNome());
        //Fazer o mesmo para capturara o CPF deste objeto
        String cpf = JOptionPane.showInputDialog("Digite o seu CPF:");
        mochileira.setCpf(cpf);
        System.out.println("O CPF do objeto é: " + mochileira.getCpf());

        //novo objeto
        nome = JOptionPane.showInputDialog("Qual seu nome: ");
        //Criando objeto com construtor recebendo nome
        Turista outroTurista = new Turista(nome);
        System.out.println("O nome deste turista é: " + outroTurista.getNome()) ;
        //Fazer o recebimeno do cpf para este turista
        cpf = JOptionPane.showInputDialog("Digite seu cpf");
        if(Validacao.cpf(cpf))
            outroTurista.setCpf(cpf);
        else
            System.out.println("CPF inválido");

        System.out.println("o cpf digitado foi: "+cpf);
    }
}
