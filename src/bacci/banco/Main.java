package bacci.banco;

public class Main {

    public static void main(String[] args) {
        Conta p1 = new Conta();
        p1.setNumeroConta(1234);
        p1.abrirConta(1); // Abrimos conta corrente
        p1.setDono("Diego Barbosa");
        p1.estadoAtualConta();
    }
}
