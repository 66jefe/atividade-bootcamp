package br.com.digitalinnovationone.aula1;

public class Main {
    public static void main(String[] args) {

        System.out.println("Calculadora");
        Calculadora.adicao(4,9.3);
        Calculadora.subtracao(7,7.1);
        Calculadora.multiplicacao(3.7,7);
        Calculadora.divisao(7,3.7);

        System.out.println("Mensagens");
        Mensagem.obterMesangem(8);
        Mensagem.obterMesangem(14);
        Mensagem.obterMesangem(22);

        System.out.println("Empréstimo");
        Emprestimo.calcular(5000, Emprestimo.getTresParcelas());
        Emprestimo.calcular(200, Emprestimo.getDuasParcelas());
        Emprestimo.calcular(1000, 5);

    }
}
