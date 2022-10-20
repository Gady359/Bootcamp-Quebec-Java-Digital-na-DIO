import java.io.IOException;
import java.text.DecimalFormat;
import java.util.Scanner;

public class second {
    public static void main(String[] args) throws IOException {

        Scanner input = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.00");
        int CODIGO1, PECAS1;
        int CODIGO2, PECAS2;
        double VALOR1, VALOR2, VALOR;

        CODIGO1 = input.nextInt();
        PECAS1 = input.nextInt();
        VALOR1 = input.nextDouble();
        CODIGO2 = input.nextInt();
        PECAS2 = input.nextInt();
        VALOR2 = input.nextDouble();

        VALOR = PECAS1 * VALOR1 + PECAS2 * VALOR2;

        System.out.println("VALOR A PAGAR: R$ " + df.format(VALOR));

    }
}