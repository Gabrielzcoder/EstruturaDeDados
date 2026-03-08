package estruturaDeDados;

public class PilhaSimples {
    String[] pilha;

    public PilhaSimples(int tamanho) {
        this.pilha = new String[tamanho];
    }

    public void empilhar(String elemento) {
        if (!estaCheia()) {
           for (int i = 0; i < pilha.length; i++) {
               if (pilha[i] == null) {
                   System.out.printf("Elemento %s adicionado com sucesso.\n", elemento);
                   pilha[i] = elemento;
                   return;
               }
           }
        }else {
            System.out.println("A pilha está cheia.");
        }
    }

    public void desempilhar() {
        if (!estaVazia()) {
            for (int i = pilha.length-1; i >= 0; i--) {
                if (pilha[i] != null) {
                    System.out.printf("Elemento %s removido com sucesso.\n", pilha[i]);
                    pilha[i] = null;
                    return;
                }
            }
        }else {
            System.out.println("A pilha está vazia.");
        }
    }

    public void exibirPilha() {
        for (int i = 0; i < pilha.length; i++) {
            System.out.println(pilha[i]);
        }
    }

    private boolean estaCheia() {
        for (int i = 0; i < pilha.length; i++) {
            if (pilha[i] == null) {
                return false;
            }
        }
        return true;
    }

    private boolean estaVazia() {
        if (pilha[0] == null) {
            return true;
        }
        return false;
    }
}
