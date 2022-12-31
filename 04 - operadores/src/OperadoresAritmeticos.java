public class OperadoresAritmeticos {
    
    public static void main(String[] args) throws Exception {

        // Aritméticos

        double soma = 10.5 + 15.7;
        int subtração = 113 - 25;
        int multiplicacao = 20 * 7;
        int divisao = 15 / 3;
        int modulo = 18 % 3;
        double resultado = (10 * 7) + (20 / 4);

        System.out.println(soma);
        System.out.println(subtração);
        System.out.println(multiplicacao);
        System.out.println(divisao);
        System.out.println(modulo);
        System.out.println(resultado);

        // ATENÇÃO! O operador de adição (+), quando utilizado em variáveis do tipo
        // texto, realizará a “concatenação de textos”.

        // Atribuição

        String nome = "Hermes";
        int idade = 36;
        double peso = 68.5;
        char sexo = 'M';
        boolean doadorOrgao = false;
        // Date dataNascimento = new Date();

        System.out.println(nome);
        System.out.println(idade);
        System.out.println(peso);
        System.out.println(sexo);
        System.out.println(doadorOrgao);
    }
}
