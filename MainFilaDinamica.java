package estruturaDeDados;

public class MainFilaDinamica {
    public static void main(String[] args) {
        FilaDinamica filaDinamica = new FilaDinamica();
        filaDinamica.enfileirar(1);
        filaDinamica.enfileirar(2);
        filaDinamica.enfileirar(3);
        filaDinamica.enfileirar(4);
        filaDinamica.exibirFila();
        filaDinamica.desenfileirar();
        filaDinamica.exibirFila();
    }
}
