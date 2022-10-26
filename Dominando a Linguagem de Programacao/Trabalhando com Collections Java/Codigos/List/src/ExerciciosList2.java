import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class ExerciciosList2 {
    public static void main(String[] args) {
        List<String> respostas = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Perguntas: ");
        System.out.printf("Telefonou para vitima? ");
        String resposta =scanner.next();
        respostas.add(resposta.toLowerCase());
        System.out.printf("Esteve no local do crime?  ");
        resposta =scanner.next();
        respostas.add(resposta.toLowerCase());
        System.out.printf("Mora perto da vitima? ");
        resposta =scanner.next();
        respostas.add(resposta.toLowerCase());
        System.out.printf("Devia para vitima? ");
        resposta =scanner.next();
        respostas.add(resposta.toLowerCase());
        System.out.printf("Ja trabalhou com a vitima? ");
        resposta =scanner.next();
        respostas.add(resposta.toLowerCase());

        System.out.println(respostas);

        int count=0;
        Iterator<String> contador =respostas.iterator();
        while (contador.hasNext()){
            String resp = contador.next();
            if(resp.contains("s")){
                count++;
            }
        }

        switch (count){
            case 2:
                System.out.println(">>Suspeita<<");break;
            case 3:
            case 4:
                System.out.println(">>Cumplice<<");break;
            case 5:
                System.out.println(">>Assasino<<");break;
            default:
                System.out.println(">>Inocente<<");break;
        }
    }
}
