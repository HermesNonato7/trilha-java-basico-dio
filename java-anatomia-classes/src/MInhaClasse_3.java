public class MInhaClasse_3 {

    public static void main (String [] args) {

        String primeiroNome = "Hermes";
        String segundoNome = "Nonato";

        String nomeCompleto = nomeCompleto (primeiroNome,segundoNome);
        System.out.println(nomeCompleto);
    }

    public static String nomeCompleto (String primeiroNome, String segundoNome) {
        return "Resultado do método: " + primeiroNome.concat(" ").concat(segundoNome);
    }

}
