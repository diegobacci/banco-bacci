package bacci.banco;

public class InformacoesDono {

    public char nome;
    public char cpf;
    private char sexo;
    private int idade;
    private char estadoCivil;
    private char statusDono;

    public char getNome() {
        return nome;
    }

    public void setNome(char nome) {
        this.nome = nome;
    }

    public char getCpf() {
        return cpf;
    }

    public void setCpf(char cpf) {
        this.cpf = cpf;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public char getEstadoCivil() {
        return estadoCivil;
    }

    public void setEstadoCivil(char estadoCivil) {
        this.estadoCivil = estadoCivil;
    }

    public char getStatusDono() {
        return statusDono;
    }

    public void setStatusDono(char statusDono) {
        this.statusDono = statusDono;
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
