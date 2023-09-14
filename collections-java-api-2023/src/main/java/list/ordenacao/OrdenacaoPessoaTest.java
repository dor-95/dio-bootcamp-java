package main.java.list.ordenacao;

import java.util.Collections;
import java.util.List;

public class OrdenacaoPessoaTest {
    public static void main(String[] args) {
        OrdenacaoPessoa or = new OrdenacaoPessoa();
        or.adicionarPessoa("Pessoa 1", 28, 1.69);
        or.adicionarPessoa("Pessoa 2", 25, 1.59);
        or.adicionarPessoa("Pessoa 3", 46, 1.58);
        or.adicionarPessoa("Pessoa 4", 32, 1.79);

        System.out.println(or.ordenarPorIdade());
        System.out.println(or.ordenarPorAltura());
    }
}
