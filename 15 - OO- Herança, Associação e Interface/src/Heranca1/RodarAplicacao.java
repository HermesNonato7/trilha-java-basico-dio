package Heranca1;

/**
 * Classe de resolução do exercício da Aula 3- Exercício 1 de 2
 * Herança: Upcast e Downcast
 * Herança: Polimorfismo e Sobrescrita
 */
class RodarAplicacao {
    
    public static void main(String[] args) {
        
        Funcionario funcionario = new Funcionario();

        //Upcast- Classe mãe: Funcionário | gerente, vendedor, faxineiro são classes filhos.
        Funcionario gerente = new Gerente();
        Funcionario vendedor = new Vendedor();
        Funcionario faxineiro = new Faxineiro();    


        //Dowcast
        //Gerente gerente_ = new Funcionario(); 
        //O Dewcast acima dá erro. É preciso deixar a classe Gerente explícita.

        // Vendedor vendedor_ = (Vendedor) new Funcionario(); //Deve ser evitado em Java o Dowcast.
    }
}
