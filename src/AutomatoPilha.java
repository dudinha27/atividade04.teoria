import java.util.Stack;

public class AutomatoPilha {
    private Stack<Character> pilha;

    public AutomatoPilha() {
        this.pilha = new Stack<>();
    }

    public boolean reconhecer(String palavra) {

        for (char c : palavra.toCharArray()) {
            if (c == '0') {
                // Empilhar '0' ao encontrar
                pilha.push('0');
            } else if (c == '1') {
                // Desempilhar ao encontrar '1'
                if (pilha.isEmpty()) {
                    return false; // Mais '1' do que '0'
                }
                pilha.pop();
            } else {
                // Caracter inválido
                return false;
            }
        }

        // Se a pilha estiver vazia, a palavra pertence à linguagem
        return pilha.isEmpty();
    }
}
