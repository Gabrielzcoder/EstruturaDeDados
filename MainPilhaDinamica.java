package estruturaDeDados;

public class MainPilhaDinamica {
    public static void main(String[] args) {
        PilhaDinamica pilhaDinamica = new PilhaDinamica();

        pilhaDinamica.empilhar("João");
        pilhaDinamica.empilhar("Gabriel");
        pilhaDinamica.empilhar("Sofia");
        pilhaDinamica.empilhar("João");
        pilhaDinamica.empilhar("Gabriel");
        pilhaDinamica.empilhar("Sofia");
        pilhaDinamica.exibirPilha();
        pilhaDinamica.desempilhar();
        pilhaDinamica.exibirPilha();
    }
}
