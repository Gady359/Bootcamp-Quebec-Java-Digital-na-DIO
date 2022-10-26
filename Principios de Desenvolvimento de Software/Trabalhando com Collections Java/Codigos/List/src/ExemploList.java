import java.util.*;

public class ExemploList {

    public static void main(String[] args) {

        //List<Double> notas= new ArrayList<>();
        //List<Double> notas = new ArrayList<>(Arrays.asList(7d,8.5,9.3,5d,7d,0d,3.6));

        System.out.println("Crie uma lista e adicione as sete notas: ");
        List<Double> notas =new ArrayList<>();
        notas.add(7d);
        notas.add(8.5);
        notas.add(9.3);
        notas.add(5.0);
        notas.add(7.0);
        notas.add(0d);
        notas.add(3.6);

        System.out.println(notas.toString());

        System.out.println("Exiba a posicao da nota 5.0: " + notas.indexOf(5d));

        System.out.println("Adicone na lista a nota 8.0 na posicao 4: ");
        notas.add(4, 8d);
        System.out.println(notas);

        System.out.println("Substitua a nota 5.0 pela nota 6.0: ");
        notas.set(notas.indexOf(5d), 6.0 );
        System.out.println(notas);

        System.out.println("Confira se a nota 5.0 esta na lista: " + notas.contains(5d));

        /*System.out.println("Exiba todas as notas na ordem em que foram informados: ");
        for(double nota : notas) System.out.println(nota);*/

        System.out.println("Exiba a terceira nota adicionada: " +notas.get(2));
        System.out.println(notas);

        System.out.println("Exiba a menor nota "+ Collections.min(notas));

        System.out.println("Exiba a maior nota: "+ Collections.max(notas));


        Iterator<Double> iterator = notas.iterator();
        Double soma = 0d;
        while (iterator.hasNext()){
            Double next= iterator.next();
            soma+=next;
        }
        System.out.println("Exiba a soma dos valores: "+soma);

        System.out.println("Exiba a media das notas "+ (soma/notas.size()));

        System.out.println("Remova a nota 0: ");
        notas.remove(0d);
        System.out.println(notas);

        System.out.println("Remova a nota na posicao 0: ");
        notas.remove(0);
        System.out.println(notas);

        System.out.println("Remova as notas menores que 7  e exiba a lista: ");
        Iterator<Double> iterator1 = notas.iterator();
        while(iterator1.hasNext()){
            Double next= iterator1.next();
            if(next<7) iterator1.remove();
        }
        System.out.println(notas);

        /*System.out.println("Apague toda lista: ");
        notas.clear();
        System.out.println(notas);*/

        System.out.println("Confira se a lista esta vazia: "+ notas.isEmpty());

        System.out.println("Crie uma lista chamada notas2: ");
        List<Double> notas2 =new ArrayList<>();
        notas2.addAll(notas);
        System.out.println(notas2);

        System.out.println("Mostre a primeira nota da nova lista sem removelo: "+ notas2.get(0));

        System.out.println("Mostre a primeira nota da nova lista removendo-o: " + notas2.remove(0));
        System.out.println(notas2);


    }
}
