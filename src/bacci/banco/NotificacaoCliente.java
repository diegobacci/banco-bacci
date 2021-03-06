package bacci.banco;

public class NotificacaoCliente { // Classe destinada a criacao de metodos para notificar clientes de avisos/promocoes
    
    private char mensagem; // QUEM CRIA CONTA CORRENTE GANHA 50 R$ E QUEM CRIA POUPANCA 150 R$
    
    private char aviso() {
        return this.getMensagem();
    }

    private char getMensagem() {
        return mensagem;
    }
}
