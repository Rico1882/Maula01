package one.digitalinnovatinon.basecompany;

import one.digitalinnovatinon.basecompany.Calculadora;
import one.digitalinnovatinon.basecompany.Emprestimo;
import one.digitalinnovatinon.basecompany.Mensagem;

/**
 * Classe principal dos exercícios da Aula 1 de Métodos.
 */

public class Main {

    public static void main(String[] args) {

        //Calculadora
        System.out.println("Exercicio Calculadora");
        Calculadora.soma(3, 6);
        Calculadora.subtracao(9, 1.8);
        Calculadora.multiplicacao(7, 8);
        Calculadora.divisao(5, 2.5);

        //Mensagem

        System.out.println("Exercicio Mensagem");
        Mensagem.obterMensagem( 9);
        Mensagem.obterMensagem(14);
        Mensagem.obterMensagem( 1);

        //Empréstimo

<<<<<<< HEAD
        System.out.println("Exercicio emprétimo");
=======
        System.out.println("Exercicio empréstimo");
>>>>>>> b9590e9 (Initial commit)

        Emprestimo.calcular(1000, Emprestimo.getDuasParcelas());
        Emprestimo.calcular( 1000, Emprestimo.getTresParcelas());
        Emprestimo.calcular( 1000, 5);


    }
}
