public class fist {


        // Abaixo segue um exemplo de código que você pode ou não utilizar:


            public static void main(String[] args){

// TODO: Crie um Array de números inteiros:
                int[] numeros= new int[] {2, 3, 5, 7, 11, 13, 18, 34};
                int[] numerosPar= new int[numeros.length];
                int n=0;

// TODO: Implemente um laço de repetição que verifique APENAS seus números Pares:
                for (int i=0; i < numeros.length; i++){
                    if ((numeros[i]%2)==0){
                        numerosPar[n]=numeros[i];
                        n++;




                    }
                }
                for(int i=0;i<n;i++){
                    System.out.println(numerosPar[i]);
                }
            }



}
