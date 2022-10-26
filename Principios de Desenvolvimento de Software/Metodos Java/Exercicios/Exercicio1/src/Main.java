public class Main {
    public static void main(String[] args) {

        //calculadora
        System.out.println("Exercicio calculadora");
        Calculadora.soma(3, 6);
        Calculadora.subtrai(9, 1.8);
        Calculadora.multiplica(7, 8);
        Calculadora.divide(5, 2.5);

        //Mensagem
        System.out.println("Exercicio mengagem");
        Mensagem.obterMensagem(9);
        Mensagem.obterMensagem(14);
        Mensagem.obterMensagem(1);

        //Emprestimo
        Emprestimo.calcular(1000,Emprestimo.getDuasParcelas());
        Emprestimo.calcular(1000,Emprestimo.getTresParcelas());
        Emprestimo.calcular(1000,5);

    }
}