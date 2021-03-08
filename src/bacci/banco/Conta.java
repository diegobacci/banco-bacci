package bacci.banco;

public class Conta {

     /**
     * @author diego
     * */

    private int numeroConta;
    private String dono;
    private float saldoConta;
    private int tipoConta; // 1 = corrente e 2 = poupanca
    private boolean contaAberta;
    private float deposito;
    private float sacar;
    private float mensalidadeConta;

    public Conta() { // sempre que conta ser criada, tera esses valores de atributo
        this.setContaAberta(false);
        this.setSaldoConta(0);
    }

    public void abrirConta(int tipoConta) { // 1 = corrente e 2 = poupanca
        // devemos acrescentar valor bonus inicial de criacao de conta;
        // Verificacao se a mesma pessoa ja nao tem uma conta criada.

        this.setTipoConta(tipoConta);
        this.setContaAberta(true);
        System.out.println("Conta criada com sucesso!");

        if (tipoConta == 1) { // conta corrente
            this.setSaldoConta(getSaldoConta() + 50);
        }
        else if (tipoConta == 2) { // conta poupanca
            this.setSaldoConta(getSaldoConta() + 150);
        }
    }

    public void fecharConta(float saldoConta) throws Exception {
        if (this.isContaAberta() == false) {
            throw new Exception ("Não há conta aberta");
        }
        else {
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
                System.out.println("Conta fechada com sucesso!");
                this.setContaAberta(false);
            }
        }
    }

    // NECESSARIO COLOCAR TRY/CATCH

    public void depositar(float deposito) throws Exception {
        try {
            if (this.isContaAberta() == false) {
                System.err.println("Impossivel depositar em conta inexistente ou fechada.");
                throw new Exception("Conta Inexistente");
            } else {
                setSaldoConta(getSaldoConta() + deposito); //this.setSaldoConta(getSaldoConta() + deposito);
                System.out.println("Deposito realizado na conta de "); // CPF, mas trocar para nome
            }
        }
        catch (Exception exception) {
            throw new Exception("Excessao atingida");
        }
    }

    public void sacar(float sacar) throws Exception {

        // Interface em que pergunta: Deseje a quantidade a ser sacada de sua conta:
        // [ 1 ] - Personalizado
        // [ 2 ] - Saldo Total
        // [ 3 ] - Cancelar

        try {
            if (this.isContaAberta() == false) {
                System.err.println("Não foi encontrado nenhuma conta registrada.\nNecessário abrir uma nova conta!");
                throw new Exception("Não ha conta aberta, impossivel sacar");

                // chama um menu menu perguntando se deseja criar conta nova
                // system("pause")
                // interface
                // this.sacar();
            } else {
                if (this.getSaldoConta() < this.getSacar()) {
                    System.out.println("Seu saldo atual é de " + this.getSaldoConta());
                    System.err.println("\nImpossivel sacar valor maior que saldo atual.");

                    throw new Exception("Saldo menor que saque");
                } else {
                    setSaldoConta(this.getSaldoConta() - sacar);
                    System.out.println("Saque realizado com sucesso!");
                    System.out.println("\nAtualmente seu saldo atual é: " + this.getSaldoConta());
                }
            }
        }
        catch (Exception exception){
            throw new Exception ("Excessao atingida");
        }
    }

    public void pagarMensalidadeConta() throws Exception {
        float valor_mensalidade;

        if (this.isContaAberta() == false) {
            System.err.println("Impossivel pagar mensalidade. Conta bancária inexistente.");
            throw new Exception ("Conta Inexistente");
        }
        else {
            if (getTipoConta() == 1) {
                valor_mensalidade = 11.99f;

                if (this.getSaldoConta() > valor_mensalidade) {
                    setSaldoConta(getSaldoConta() - valor_mensalidade);
                }
                else {
                    throw new Exception ("Saldo inferior a mensalidade");
                }
            }
            else if (getTipoConta() == 2) {
                valor_mensalidade = 19.99f;

                if (this.getSaldoConta() > valor_mensalidade) {
                    setSaldoConta(getSaldoConta() - valor_mensalidade);
                }
                else {
                    throw new Exception ("Saldo inferior a mensalidade");
                }
            }
            else {
                throw new Exception ("Tipo de conta inválida");
            }
        }
    }

    public void estadoAtualConta() {
        System.out.println("---------------------------------");
        System.out.println("Conta: " + this.getNumeroConta());
        System.out.println("Dono: " + this.getDono());
        if (this.isContaAberta() == false) {
            System.out.println("Status: Fechada");
        }
        else {
            System.out.println("Status: Aberta");
            if (getTipoConta() == 1) {
                System.out.println("Tipo: Conta Corrente");
            }
            else if (getTipoConta() == 2) {
                System.out.println("Tipo: Conta Poupança");
            }
            System.out.println("Saldo: " + this.getSaldoConta());
        }
    }

    // METODOS ESPECIAIS

    public int getNumeroConta() {
        return this.numeroConta;
    }

    public void setNumeroConta(int numeroConta) {
        this.numeroConta = numeroConta;
    }

    public String getDono() {
        return dono;
    }

    public void setDono(String dono) {
        this.dono = dono;
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
        return contaAberta;
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

    public float getMensalidadeConta() {
        return mensalidadeConta;
    }

    public void setMensalidadeConta(float mensalidadeConta) {
        this.mensalidadeConta = mensalidadeConta;
    }
}
