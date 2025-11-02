package ajuda;
// Define um tipo de erro próprio para o projeto.

public class ErroDeLogica extends Exception {

    // Construtor recebe a mensagem de erro
    public ErroDeLogica(String mensagem) {
        
        // Passa a mensagem pra a classe original 'Exception'
        super(mensagem);
    }
}