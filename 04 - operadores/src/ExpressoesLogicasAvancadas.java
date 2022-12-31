public class ExpressoesLogicasAvancadas {
    public static void main(String[] args) {

        int numero1 = 1;
        int numero2 = 1;

        if (numero1 == 2 & numero2++ == 2)
            System.out.println("As 2 condições são verdadeiras");

        System.out.println("O numero 1 agora é " + numero1);
        System.out.println("O numero 2 agora é " + numero2);

        // Vamos mudar a linha 5 do código acima para: if(numero1== 2 && numero2 ++ == 2)

        //O mesmo acontece com o operador | e || , considerando que operador, agora representa que se uma das alternativas for verdadeira, a outra nem precisa ser avaliada.
       
        /* Aprendemos sobre os operadores lógico.
         if (condicao1 && condicao2) e if(condicao1 || condicao2) ?
         A duplicidade nos operadores lógicos é um recurso conhecido como Operador
         Abreviado, isso quer dizer que, se a condição1 atender aos critérios, não será
         necessário validar a condição2.
        */
    }
}
