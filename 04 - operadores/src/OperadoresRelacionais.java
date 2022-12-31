public class OperadoresRelacionais {
    public static void main(String[] args) {

        int numero1 = 1;
        int numero2 = 2;

        if (numero1 > numero2)
            System.out.print("Numero 1 maior que numero 2\n");

        if (numero1 < numero2)
            System.out.print("Numero 1 menor que numero 2\n");

        if (numero1 >= numero2)
            System.out.print("Numero 1 maior ou igual que numero 2\n");

        if (numero1 <= numero2)
            System.out.print("Numero 1 menor ou igual que numero 2\n");

        if (numero1 != numero2)
            System.out.print("Numero 1 é diferente de numero 2\n");

        // Utilizando o método "EQUALS" é possível comparar conteúdos, inclusive de objetos.
        String nomeUm = "Hermes";
        String nomeDois = new String("Hermes");

        System.out.println(nomeUm.equals(nomeDois));
    }
}
