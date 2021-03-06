package bacci.banco;

public class ContaCorrente {

     /**
     * @author diego
     * */

    private int numeroConta;
    private float saldoConta;
    private int tipoConta;
    private boolean contaAberta;
    private double deposito;
    private double sacar;
    private float mensalidadeConta;
    private char statusConta;

    public ContaCorrente(boolean statusConta, float saldoConta) {
        this.setContaAberta(false);
        this.setSaldoConta(0);
    }

    public void abrirConta() {
        // devemos acrescentar valor bonus inicial de criacao de conta;
        this.setContaAberta(true);
    }

    public void fecharConta() {
        if (this.getSaldoConta() < 0) {
            System.out.println();
            // Cancelar operacao, negando o fechamento de conta, por saldo negativo
        }
        else if (this.getSaldoConta() > 0) {
            System.out.println("É necessário sacar os " + this.getSaldoConta() + " restantes para concluir.");
            // imprimir mensagem dizendo se usuario gostaria de sacar dinheiro ou cancelar operacao
            // se sim, zerar saldo
            // ******* Depois de implementacao, colocar como opcao mandar saldo para outra conta existente

        }
        else {
            this.setContaAberta(false);
        }
    }

    public double depositar() {
        if (contaAberta == true) {
            // Deposito pode acontecer
        }

        return this.getDeposito();
    }

    public double sacar() {
        if (contaAberta == true) {
            if (this.getSaldoConta() >= this.getSacar()) {
                // pode acontecer saque
            }
            else {
                // nao pode acontecer saque
            }
        }

        return this.getSacar();
    }

    public void pagarMensalidadeConta() {
        if (contaAberta == true) {
            //this.setSaldoConta(); // passar o valor da mensalidade aqui
        }
    }

    public int getNumeroConta() {
        return numeroConta;
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
        System.out.println("Qual seu tipo de conta? ");
        System.out.println("\n[ 1 ] - Conta Corrente");
        System.out.println("[ 2 ] - Conta Poupança");
        System.out.println("\nResposta: " + this.tipoConta); // Receber o valor da resposta
        return tipoConta;
    }

    public void setTipoConta(int tipoConta) { this.tipoConta = tipoConta; }

    public boolean isContaAberta() { return contaAberta; }

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
        return deposito;
    }

    /**
     * @param deposito the deposito to set
     */
    public void setDeposito(double deposito) {
        this.deposito = deposito;
    }

    /**
     * @return the sacar
     */
    public double getSacar() {
        return sacar;
    }

    /**
     * @param sacar the sacar to set
     */
    public void setSacar(double sacar) {
        this.sacar = sacar;
    }

    /**
     * @return the mensalidadeConta
     */
    public double getMensalidadeConta() {
        return mensalidadeConta;
    }

    /**
     * @param mensalidadeConta the mensalidadeConta to set
     */
    public void setMensalidadeConta(double mensalidadeConta) {
        this.mensalidadeConta -= mensalidadeConta;
    }

    /**
     * @return the statusConta
     */
    public char getStatusConta() {
        return statusConta;
    }
}
