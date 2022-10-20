public class FormatadorCepExemplo {
    public static void main(String[] args) {
        try {
            String cepFormatado =formatarCep("237650");
            System.out.println(cepFormatado);
        } catch (CepInvalidoException e) {
            System.out.println("O cep nao corresponde com as regras de negocio");
        }

    }
    static String formatarCep(String cep) throws  CepInvalidoException{
        if(cep.length()!=8)
            throw new CepInvalidoException();

            return "23.765-064";
    }
}
