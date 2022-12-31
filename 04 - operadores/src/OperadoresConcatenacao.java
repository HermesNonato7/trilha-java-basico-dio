public class OperadoresConcatenacao {
    public static void main(String[] args) {

        String nomeCompleto = "LINGUAGEM" + "JAVA";

            System.out.println(nomeCompleto);

        // qual o resultado das expressoes abaixo?
        // Imprimir utilizando o Debug

        String concatenacao = "?";

            System.out.println(concatenacao);

        concatenacao = 1 + 1 + 1 + "1";

            System.out.println(concatenacao);

        concatenacao = 1 + "1" + 1 + 1;

            System.out.println(concatenacao);

        concatenacao = 1 + "1" + 1 + "1";

            System.out.println(concatenacao);

        concatenacao = "1" + 1 + 1 + 1;

            System.out.println(concatenacao);

        concatenacao = "1" + (1 + 1 + 1);

            System.out.println(concatenacao);
    }
}
