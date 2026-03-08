package estruturaDeDados;

public class MainFilaSimples {
    public static void main(String[] args) {
        FilaSimples filaSimples = new FilaSimples(5);
        filaSimples.exibirFila();
        filaSimples.enfileirar(1);
        filaSimples.enfileirar(2);
        filaSimples.enfileirar(3);
        filaSimples.enfileirar(4);
        filaSimples.enfileirar(5);
        filaSimples.exibirFila();
        filaSimples.desenfileirar();
        filaSimples.exibirFila();
    }
}
