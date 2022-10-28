import java.util.Random;

public class ChavePix {
    public static void main(String[] args) {


        int leftLimit = 97; // letra 'a'
        int rightLimit = 122; // letra 'z'
        int tamamhoChave = 100;
        Random random = new Random();

        String chaveAleatoria = random.ints(leftLimit, rightLimit + 1)
                .limit(tamamhoChave)
                .collect(StringBuilder::new, StringBuilder::appendCodePoint, StringBuilder::append)
                .toString();

        System.out.println(chaveAleatoria);


    }

}