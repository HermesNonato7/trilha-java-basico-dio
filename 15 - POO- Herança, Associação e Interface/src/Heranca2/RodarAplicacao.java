package Heranca2;
/**
 * Classe do exercício 2 da Aula 3- Orientação a Objetos
 * Comportamentos Polimorficos
 */
class RodarAplicacao {
    
    public static void main(String[] args) {
        
        ClasseMae[] classes = new ClasseMae[]{new ClasseFilha1(), new ClasseFilha2(), new ClasseMae()};

        for (ClasseMae classe: classes) {
            classe.metodo1();
        }

        System.out.println("");

        for (ClasseMae classe: classes) {
            classe.metodo2();
        }

        System.out.println("");

        // Somente Sobiscrita
        ClasseFilha2 classeFilha2 = new ClasseFilha2();
        classeFilha2.metodo2();
    }

}
