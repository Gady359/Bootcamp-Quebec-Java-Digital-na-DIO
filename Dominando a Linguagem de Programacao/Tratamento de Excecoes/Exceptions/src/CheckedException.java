import javax.swing.*;
import java.io.*;
import java.lang.reflect.Field;

public class CheckedException {
    public static void main(String[] args){

        String nomeArquivo ="ArtistasTrap.txt";

        try {
            imprimirArquivoNoConsole(nomeArquivo);
        }catch (FileNotFoundException e){
            JOptionPane.showMessageDialog(null,
                    "Revise o nome do arquivo que voce deseja imprimir! "+e.getCause());
        }catch (IOException e) {
            JOptionPane.showMessageDialog(null,
                    "Ocorreu um erro inesperado, entre em contato com o suporte "+e.getCause());
            e.printStackTrace();
        }finally {
            System.out.println("Chegou ao finally");
        }

        System.out.println("Apesar da exeption ou nao, o programa continua...");

    }
    public static void imprimirArquivoNoConsole(String nomeArquivo) throws IOException {
        File file =new File(nomeArquivo);

        BufferedReader br = new BufferedReader(new FileReader(file.getName()));
        String line=br.readLine();

        BufferedWriter bw=new BufferedWriter(new OutputStreamWriter((System.out)));

        do{
            bw.write(line);
            bw.newLine();
            line=br.readLine();
        }while (line!=null);
        bw.flush();
        br.close();
    }
}
