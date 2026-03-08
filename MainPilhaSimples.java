package estruturaDeDados;

public class MainPilhaSimples {
    public static void main(String[] args) {
        PilhaSimples pilhaSimples = new PilhaSimples(5);
        pilhaSimples.empilhar("João");
        pilhaSimples.empilhar("Gabriel");
        pilhaSimples.empilhar("Sofia");
        pilhaSimples.empilhar("Duda");
        pilhaSimples.empilhar("Monique");
        pilhaSimples.empilhar("Gustavo");
        pilhaSimples.exibirPilha();
        pilhaSimples.desempilhar();
        pilhaSimples.exibirPilha();
    }
}
