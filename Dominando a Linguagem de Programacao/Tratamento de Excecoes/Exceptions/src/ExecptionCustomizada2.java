import javax.swing.*;

public class ExecptionCustomizada2 {
    public static void main(String[] args) {
        int[] numerador={4,5,8,10};
        int[] denominador={2,4,0,2,8};

        for(int i=0;i<denominador.length;i++){

            try{
                if(numerador[i] %2 != 0) throw new DivisaoNaoExataExeption("Divisao nao exata"
                        , numerador[i],denominador[i]);
                int resultado=numerador[i]/denominador[i];
                System.out.println(resultado);
            } catch (DivisaoNaoExataExeption e) {
                e.printStackTrace();
                JOptionPane.showMessageDialog(null,e.getMessage());
            }catch (ArithmeticException e){
                JOptionPane.showMessageDialog(null,"Nao e possivel realizar divisao por zero ");
            }catch (ArrayIndexOutOfBoundsException e){
                JOptionPane.showMessageDialog(null,"Algum numero na divisao esta tentando dividir o vazio/");
            }

        }
        System.out.println("O programa continua...");
    }
}


