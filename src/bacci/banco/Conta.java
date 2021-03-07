package bacci.banco;

public class Conta {

     /**
     * @author diego
     * */

    private int numeroConta;
    private float saldoConta;
    private int tipoConta; // 1 = corrente e 2 = poupanca
    private boolean contaAberta;
    private float deposito;
    private float sacar;
    private float mensalidadeConta;
    private char statusConta;

    public Conta(boolean statusConta, float saldoConta) { // sempre que conta ser criada, tera esses valores de atributo
        this.setContaAberta(false);
        this.setSaldoConta(0);
    }

    public void abrirConta(int tipoConta) { // 1 = corrente e 2 = poupanca
        // devemos acrescentar valor bonus inicial de criacao de conta;
        this.setTipoConta(tipoConta);
        this.setContaAberta(true);

        if (getTipoConta() == 1) {
            this.saldoConta += 50; // this.setSaldoConta(50)
        }
        else if (getTipoConta() == 2) {
            this.saldoConta += 150; // this.setSaldoConta(150)
        }
    }

    public void fecharConta(float saldoConta) throws Exception {
        if (this.getSaldoConta() < 0) {
            System.err.println("Não é possivel fechar conta com saldo negativo...");

            // menu em interface perguntando:
            // System.out.println("Entre com a opção desejada: ");
            // System.out.println("\n[ 1 ] - Pagar todas suas dívidas (" + this.getSaldoConta() + ")");
            // System.out.println("\n[ 2 ] - Cancelar e sair
            throw new Exception ("Saldo negativo");
        }
        else if (this.getSaldoConta() > 0) {
            System.out.println("É necessário sacar os " + this.getSaldoConta() + " restantes para concluir.");

            throw new Exception ("Saldo negativo");
            // imprimir mensagem dizendo se usuario gostaria de sacar dinheiro ou cancelar operacao
            // se sim, zerar saldo
            // ******* Depois de implementacao, colocar como opcao mandar saldo para outra conta existente
        }
        else {
            System.out.println("Conta excluída com sucesso!");
            this.setContaAberta(false);
        }
    }

    public void depositar(float deposito) throws Exception {
        if (this.isContaAberta() == false) {
            System.err.println("É necessario criar uma conta para depositar.");
            throw new Exception ("Conta Inexistente");
        }
        else {
            setSaldoConta(getSaldoConta() + deposito);
        }
    }

    public void sacar(float sacar) throws Exception {

        // Interface em que pergunta: Deseje a quantidade a ser sacada de sua conta:
        // [ 1 ] - Personalizado
        // [ 2 ] - Saldo Total
        // [ 3 ] - Cancelar

        if (this.isContaAberta() == false) {
            System.err.println("Não foi encontrado nenhuma conta registrada.\nNecessário abrir uma nova conta!");
            throw new Exception ("Não ha conta aberta");

            // chama um menu menu perguntando se deseja criar conta nova
            // system("pause")
            // interface
            // this.sacar();
        }
        else {
            if (this.getSaldoConta() < this.getSacar()) {
                System.out.println("Seu saldo atual é de " + this.getSaldoConta());
                System.err.println("\nImpossivel sacar valor maior que seu saldo...");

                throw new Exception ("Saldo menor que saque");
            }
            else {
                setSaldoConta(this.getSaldoConta() - sacar);
                System.out.println("Saque realizado com sucesso!");
                System.out.println("\nAtualmente seu saldo atual é: " + this.getSaldoConta());
            }
        }
    }

    public void pagarMensalidadeConta() throws Exception {
        if (this.isContaAberta() == false) {
            throw new Exception ("Conta Inexistente");
        }
        else {
            if (this.getSaldoConta() <= this.//getMensalidadeConta)
        }
    }

    public int getNumeroConta() {
        return this.numeroConta;
    }

    public void setNumeroConta(int numeroConta) {
        this.numeroConta = numeroConta;
    }

    public float getSaldoConta() {
        return saldoConta;
    }

    public float setSaldoConta(float saldoConta) {
        return this.saldoConta = saldoConta;
    }

    public int getTipoConta() {
        /*System.out.println("Qual seu tipo de conta? ");
        System.out.println("\n[ 1 ] - Conta Corrente");
        System.out.println("[ 2 ] - Conta Poupança");
        System.out.println("\nResposta: " + this.tipoConta); // Receber o valor da resposta */
        return this.tipoConta;
    }

    public void setTipoConta(int tipoConta) {
        this.tipoConta = tipoConta;
    }

    public boolean isContaAberta() {
        if (isContaAberta() == true) {
            return true;
        }
        else {
            return false;
        }
    }

    /**
     * @param contaAberta the contaAberta to set
     */
    public void setContaAberta(boolean contaAberta) {
        this.contaAberta = contaAberta;
    }

    /**
     * @return the deposito
     */
    public double getDeposito() {
        return this.deposito;
    }

    /**
     * @param deposito the deposito to set
     */
    public void setDeposito(float deposito) {
        this.deposito = deposito;
    }

    /**
     * @return the sacar
     */
    public float getSacar() {
        return this.sacar;
    }

    /**
     * @param sacar the sacar to set
     */
    public void setSacar(float sacar) {
        this.sacar = sacar;
    }

    /**
     * @return the statusConta
     */
    public char getStatusConta() {
        return this.statusConta;
    }
}
