public class ComparacoesAvancadas {
    public static void main(String[] args) {

        // Valor e referência: Precisamos entender que em Java tudo é objeto,
        // logo, objetos diferentes podem ter as mesmas características, mas lembrando,
        // são objetos diferentes.
        String nome1 = "JAVA";
        String nome2 = "JAVA";

            System.out.println(nome1 == nome2); // true

        String nome3 = new String("JAVA");

            System.out.println(nome1 == nome3); // false

        String nome4 = nome3;

            System.out.println(nome3 == nome4); // true

        // equals na parada
        System.out.println(nome1.equals(nome2)); // ??
        System.out.println(nome2.equals(nome3)); // ??
        System.out.println(nome3.equals(nome4)); // ??

        // == versus equals: Existe uma relevância forte, em realizar comparações
        // com == e equals na qual precisamos ter uma compreensão de quais as regras
        // seguidas pela linguagem **** , exemplo:
        int numero7 = 130;
        int numero8 = 130;
            System.out.println(numero7 == numero8); // true

        Integer numero5 = 130;
        Integer numero6 = 130;

            System.out.println(numero5 == numero6); // false

        // A razão pela qual o resultado é false, é devido o Java tratar os valores
        // Como objetos a partir de agora.
        // Qual a solução ?
        // Quando queremos comparar objetos, usamos o método equals

            System.out.println(numero5.equals(numero6));

    }
}
