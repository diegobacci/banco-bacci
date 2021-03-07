package bacci.banco;

public class InformacoesDono {

    private char nome;
    private char sexo;
    private int idade;
    private char cpf;
    private char estadoCivil;
    private char statusDono;

    public char getNome() {
        return nome;
    }

    public void setNome(char nome) {
        this.nome = nome;
    }

    private void alterarInformacao() {

    }

    private char nome() {
        return nome;
    }

    public char statusDono() {
        System.out.println("Nome: " + this.nome);
        System.out.println("Sexo: " + this.sexo);
        System.out.println("CPF: " + this.cpf);
        System.out.println("Estado Civil: " + this.estadoCivil);

        return this.statusDono;
    }
}
