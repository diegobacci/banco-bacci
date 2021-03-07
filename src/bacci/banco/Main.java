package bacci.banco;

public class Main {

    public static void main(String[] args) throws Exception {
        Conta p1 = new Conta();
        p1.setNumeroConta(1234);
        p1.abrirConta(1); // Abrimos conta corrente
        p1.setDono("Diego Barbosa");

        Conta p2 = new Conta();
        p2.abrirConta(2);
        p2.setNumeroConta(2222);
        p2.setDono("Jeniffer Ferrari");

        p1.depositar(23);
        p2.sacar(12);

        p1.estadoAtualConta();
        p2.estadoAtualConta();
    }
}
