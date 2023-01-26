package EstruturasBasicas;
/*
 * Classe para exemplo da Aula 3-  Orientação a Objetos
 * 1- Crie uma classe chamada carro
 * 2- Crie para a classe os seguintes atributos: cor, modelo e capacidade do tanque.
 * 3- Crie métodos get e set, que calcule o valor para encher o tanque e
 * crie uma sobrecarga com o construtor.
 */

public class Carro {
        String cor;
        String modelo;
        int capacidadeTanque;

        // Contrautor aqui

        Carro() {

        } // abaixo segue a sobrecarga deste construtor vazio.

        Carro(String cor, String modelo, int capacidadeTanque) {
            this.cor = cor;
            this.modelo = modelo;
            this.capacidadeTanque = capacidadeTanque;
        }

        // get e set

        void setCor(String cor) {
            this.cor = cor;
        }

        String getCor() {
            return cor;
        }

        void setModelo(String modelo) {
            this.modelo = modelo;
        }

        String getModelo() {
            return modelo;
        }

        // get e set capacidade do Tanque

        void setCapacidadeTanque(int capacidadeTanque) {
            this.capacidadeTanque = capacidadeTanque;
        }

        int getCapacidadeTanque() {
            return capacidadeTanque;
        }

        // método do total para encher o tanque

        double totalValorTanque(double valorCombustivel) {
            return capacidadeTanque * valorCombustivel;
        }
    }