package Ex3_sobrecargaReturn;

public class Main {
    public static void main(String[] args) {
        
        // Retorno
        System.out.println("Exercício Retornos");

        double areaQuadrado = Quadrilatero2.area(3);
        System.out.println("Área do quadrado: " + areaQuadrado);

        double areaRetangulo = Quadrilatero2.area(5,5);
        System.out.println("Área do retângulo: " + areaRetangulo);

        double areaTrapezio = Quadrilatero2.area(7,8,9);
        System.out.println("Área trapézio: " + areaTrapezio);

    }
}
