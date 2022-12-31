public class OperadoresUnarios {
    public static void main(String[] args) {
        
        // para tornar o numero negativo, deve ser negado (-) a variável

        int numero = 5;

        numero = - numero;

        System.out.println(numero);

        // numero = + numero;

        // System.out.println(numero); // retorna -5

        numero = numero * -1;

        System.out.println(numero); // retorna 5 

        numero = numero * -1;

        System.out.println(numero);

        // Imprimindo o numero negativo

        // incrementando numero em mais 1 numero, imprime 6
        numero++;
        System.out.println(numero);

        // incrementando numero em mais 1 numero, imprime 7
        System.out.println(numero++);// ops algo de errado não está certo

        System.out.println(numero);// agora sim, numero virou 7

        // ordem de precedencia conta aqui
        System.out.println(++numero);

        // inverter o boolean
        boolean verdadeiro = true;

        System.out.println(!verdadeiro); // não altera a variável

        // maneiro correta de inverter um boolean
        verdadeiro = !verdadeiro;

        System.out.println("Inverteu " + verdadeiro);
    }
}
