package bacci.banco;

public class InformacoesDono {

    public char nome;
    public char cpf;
    private char sexo;
    private int idade;
    private char estadoCivil;
    private char statusDono;

    public char getCpf() {
        return cpf;
    }

    public void setCpf(char cpf) {
        this.cpf = cpf;
    }

    public char getNome() {
        return nome;
    }

    public void setNome(char nome) {
        this.nome = nome;
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
