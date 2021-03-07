package bacci.banco;

public class NotificacaoCliente { // Classe destinada a criacao de metodos para notificar clientes de avisos/promocoes
    
    public char mensagem; // QUEM CRIA CONTA CORRENTE GANHA 50 R$ E QUEM CRIA POUPANCA 150 R$
    public float mensalidadeConta;

    private float promocao() {
        //if (this.)
        return 0;
    }

    public char aviso() {
        return this.getMensagem();
    }

    public float getMensalidadeConta() {
        this.mensalidadeConta = 13;
        return this.mensalidadeConta;
    }

    public void setMensalidadeConta(float mensalidadeConta) {
        this.mensalidadeConta = mensalidadeConta;
    }

    public char getMensagem() {
        return mensagem;
    }

    public char setMensagem(char mensagem) {
        return this.mensagem = mensagem;
    }
}
