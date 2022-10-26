/*Faça um programa que receba a temperatura média os 6 primeiros meses do ano e armazene-as em uma lista.
Após isto, calcule a média semestral das temperaturas e mostre todas as temperaturas acima desta média,
e em que mês elas ocorreram (mostrar o mês por extenso: 1 – Janeiro, 2 – Fevereiro e etc).
*/

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class ExerciciosList {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        List<Double> temperaturas= new ArrayList<Double>();

        //Add temp na lista
        int count=0;
        while(true){
            if(count==6)break;

            System.out.println("Digite a temperatura: ");
            double temp=scan.nextDouble();
            temperaturas.add(temp);
            count++;
        }
        System.out.println("//////////////////////////////////////////////////");


        //Exibir temps
        temperaturas.forEach(t->System.out.print(t+" "));

        //Media das temp
        double media =temperaturas.stream()
                .mapToDouble(Double::doubleValue)
                .average()
                .orElse(0d);
        System.out.printf("\nMedia das temperaturas: %.1f\n",media);

        //Exibindo temps acima da media
        System.out.printf("Temperaturas acima da media: ");
        temperaturas.stream()
                .filter(t->t>media)
                .forEach(t-> System.out.printf("%.1f ",t));

        //exibir mes com temp acima da media por ext
        System.out.println("\n\nMeses das temperaturas acima da media: ");
        Iterator<Double> iterator = temperaturas.iterator();

        count=0;
        while(iterator.hasNext()){
            Double temp =iterator.next();
            if (temp>media){
                switch (count){
                    case (0):
                        System.out.printf("1- janeiro: %.1f\n ",temp);
                        break;
                    case (1):
                        System.out.printf("1- fevereiro: %.1f\n ",temp);
                        break;
                    case (2):
                        System.out.printf("1- marco: %.1f\n ",temp);
                        break;
                    case (3):
                        System.out.printf("1- abril: %.1f\n ",temp);
                        break;
                    case (4):
                        System.out.printf("1- maio: %.1f\n ",temp);
                        break;
                    case (5):
                        System.out.printf("1- junho: %.1f\n ",temp);
                        break;
                    default:
                        System.out.println("Nao houve temperatura acima da media.");
                }
            }
            count++;
        }
    }
}
