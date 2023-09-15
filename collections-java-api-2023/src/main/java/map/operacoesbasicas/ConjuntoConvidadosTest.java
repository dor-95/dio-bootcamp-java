package main.java.map.operacoesbasicas;

import java.util.Random;

public class ConjuntoConvidadosTest {
    public static void main(String[] args) {
        ConjuntoConvidados conjuntoConvidados = new ConjuntoConvidados();
        System.out.println("Existem " + conjuntoConvidados.contarConvidados()
                + " convidado(s) dentro do Set de conjuntoConvidados");

        conjuntoConvidados.adicionarConvidado("Convidado 1", 1234);
        conjuntoConvidados.adicionarConvidado("Convidado 2", 1235);
        conjuntoConvidados.adicionarConvidado("Convidado 3", 1235);
        conjuntoConvidados.adicionarConvidado("Convidado 4", 1236);

        conjuntoConvidados.exibirConvidados();
        System.out.println("Existem " + conjuntoConvidados.contarConvidados()
                + " convidado(s) dentro do Set de conjuntoConvidados");

        conjuntoConvidados.removerConvidadoPorCodigoConvite(1234);
        conjuntoConvidados.exibirConvidados();
        System.out.println("Existem " + conjuntoConvidados.contarConvidados()
                + " convidado(s) dentro do Set de conjuntoConvidados");
    }
}
