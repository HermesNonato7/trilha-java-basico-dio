package Ex2_sobrecargaMetodos;

public class Main {
    public static void main(String[] args) {

        // Quadril�tero
        System.out.println("Exerc��cio quadril�tero");
        Quadrilatero.area(3);
        Quadrilatero.area(5d, 5d);
        Quadrilatero.area(7, 8, 9);
        Quadrilatero.area(5f, 5f);
        System.out.println();
        
    }
}
