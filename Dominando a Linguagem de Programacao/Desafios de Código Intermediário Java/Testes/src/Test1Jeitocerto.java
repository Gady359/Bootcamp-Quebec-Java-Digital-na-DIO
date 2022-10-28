class Test1jeitocerto {

    public static void main(String[] args) {

        //variável de entrada

        int xi = 14;

        int etapas = 0;

        int x = xi;

        //Laço para calcular o número de etapas, de acordo com as regras

        while (x != 0) {

            if (x%2 ==0) { //par

                x = x/2;

                ++etapas;

            } else { //ímpar

                x = x - 1;

                ++etapas;

            }

        } //Imprime o número de entrada e o número de etapas

        System.out.println("O número de entrada é " + xi);

        System.out.println("O número de etapas é " + etapas);

    }

}