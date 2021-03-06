package bacci.banco;

public class NotificacaoCliente { // Classe destinada a criacao de metodos para notificar clientes de avisos/promocoes
    
    private char mensagem; 
    
    private char aviso() {
        return this.getMensagem();
    }

    private char getMensagem() {
        return mensagem;
    }
}
