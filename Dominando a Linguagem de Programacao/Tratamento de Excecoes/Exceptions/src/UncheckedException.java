import javax.swing.*;

public class UncheckedException {
    public static void main(String[] args) {

        boolean contLoop=true;
        do {
            String a = JOptionPane.showInputDialog("Numerador: ");
            String b = JOptionPane.showInputDialog("Denominador: ");

            try {
                int resultado = dividir(Integer.parseInt(a), Integer.parseInt(b));
                System.out.println("Resultado: " + resultado);
                contLoop=false;
            } catch (NumberFormatException e) {
                //e.printStackTrace();
                JOptionPane.showMessageDialog(null,
                        "Entrada invalida, informe um numero inteiro!  " + e.getMessage());
            } catch (ArithmeticException e) {
                JOptionPane.showMessageDialog(null,
                        "Impossivel dividir um numero por zero / 0 ");
            } finally {
                System.out.println("Chegou no finally!!!g");
            }
        }while (contLoop);
        System.out.println("O Codigo Continua..........");

    }

    public static int dividir(int a,int b){
        return a/b;
    }
}
