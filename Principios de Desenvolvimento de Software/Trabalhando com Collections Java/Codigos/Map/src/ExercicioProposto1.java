import java.util.*;

/*
Dada a população estimada de alguns estados do nordeste brasileiro, faça:
 Estado = PE - população = 9.616.621
 Estado = AL - população = 3.351.543
 Estado = CE - população  = 9.187.103
 Estado = RN - população = 3.534.265
 */
public class ExercicioProposto1 {
    public static void main(String[] args) {
        System.out.println("Crie um dicionário que relacione os estados e suas respectivas populações: ");
        Map<String,Integer> EstadosPop = new HashMap<>(){{
            put("PE", 9616621);
            put("AL", 3351543);
            put("CE", 9187103);
            put("RN", 3534265);
        }};
        System.out.println(EstadosPop);

        System.out.println("Substitua a população do estado RN por : 3.534.165");
        EstadosPop.put("RN",3534165);
        System.out.println(EstadosPop);

        System.out.println("Confira se o estado da Paraíba (PB) está no dicionário, " +EstadosPop.containsKey("PB")+
                ", caso não, adicione ");
        EstadosPop.put("PB", 4039277);
        System.out.println(EstadosPop);

        System.out.println("Exiba a população do estado PE: "+ EstadosPop.get("PE"));

        System.out.println("Exiba todos os estados e suas populaçãos na ordem em que foram informados: ");
        Map<String,Integer> EstadoPop1 =new LinkedHashMap<>(){{
            put("PE", 9616621);
            put("AL", 3351543);
            put("CE", 9187103);
            put("RN", 3534265);
            put("PB", 4039277);
        }};
        System.out.println(EstadoPop1);

        System.out.println("Exiba todos os estados e suas populações na ordem alfabética: ");
        Map<String,Integer> EstadosPop2=new TreeMap<>(EstadosPop);
        System.out.println(EstadosPop2);

        Collection<Integer> populacao =EstadosPop.values();
        String estadoMaiorPop="";
        String estadoMenorPop="";
        for (Map.Entry<String,Integer>entry: EstadosPop.entrySet()){
            if (entry.getValue().equals(Collections.max(populacao)))estadoMaiorPop=entry.getKey();
            if (entry.getValue().equals(Collections.min(populacao)))estadoMenorPop=entry.getKey();
        }

        System.out.printf("Exiba o estado com o menor população (%s) e seu respectivo valor (%d)\n",
                estadoMenorPop, Collections.min(populacao));
        System.out.printf("Exiba o estado com a maior população (%s) e seu respectivo valor (%d)\n",
                estadoMaiorPop, Collections.max(populacao));

        int soma=0;
        Iterator<Integer> iterator=EstadosPop.values().iterator();
        while ((iterator.hasNext())){
            soma+=iterator.next();
        }
        System.out.println("Exiba a soma da população desses estados: " + soma);

        System.out.println("Exiba a média da população deste dicionário de estados: " + (soma / EstadosPop.size()));

        System.out.println("Remova os estados com a população menor que 4.000.000: ");
        Iterator< Integer> iterator1= EstadosPop.values().iterator();
        while(iterator1.hasNext()){
            if (iterator1.next()<=4000000)iterator1.remove();
        }
        System.out.println(EstadosPop);

        System.out.println("Apague o dicionario de estados com suas respectivas populações estimadas: ");
        EstadosPop.clear();
        System.out.println(EstadosPop);

        System.out.println("Confira se a lista está vazia: " + EstadosPop.isEmpty());


    }
}
