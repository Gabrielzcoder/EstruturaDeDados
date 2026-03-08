package estruturaDeDados;

public class FilaDinamica {
    NoInteiro inicio;

    public FilaDinamica() {
        this.inicio = new NoInteiro(null);
    }

    public void enfileirar(Integer numero) {
        if(estaVazio()) {
            inicio.setConteudo(numero);
        }else {
            NoInteiro aux = inicio;
            while (aux.getProx() != null) {
                aux = aux.getProx();
            }
            aux.setProx(new NoInteiro(numero));
        }
    }

    public void desenfileirar() {
        if (!estaVazio()) {
            if (this.inicio.getProx() ==  null) {
                this.inicio.setConteudo(null);
            }else {
                this.inicio = this.inicio.getProx();
            }
        }
    }

    public void exibirFila() {
        if(!estaVazio()) {
            NoInteiro aux = inicio;
            while (aux.getProx() != null) {
                System.out.println(aux.getConteudo());
                aux = aux.getProx();
            }
            System.out.println(aux.getConteudo());
        }else {
            System.out.println("A fila está vazia.");
        }

    }

    private boolean estaVazio() {
        if(inicio.getConteudo() == null) {
            return true;
        }
        return false;
    }

}
