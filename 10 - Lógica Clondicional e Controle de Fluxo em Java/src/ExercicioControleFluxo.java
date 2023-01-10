/**
 * Classe para exercitar a utilização do Switch e boas práticas no controle de fluxo do If Else
 */

public class ExercicioControleFluxo {
public static void main(String[] args) {
        ifFlecha();
        ifSemFlecha();
        ifFerias();
        ifMenor();

        switchSemana();
        switchNumero();
        switchFerias();
    }

private static void ifFlecha() {

        int mes = 9;
        if (mes == 1) {
            System.out.println("Janeiro");
        } else {
            if (mes == 2) {
                System.out.println("Fevereiro");
            } else {
                if (mes == 3) {
                    System.out.println("Março");
                } else {
                    if (mes == 4) {
                        System.out.println("Abril");
                    } else {
                        if (mes == 5) {
                            System.out.println("Maio");
                        } else {
                            if (mes == 6) {
                                System.out.println("Junho");
                            } else {
                                if (mes == 7) {
                                    System.out.println("Julho");
                                } else {
                                    if (mes == 8) {
                                        System.out.println("Agosto");
                                    } else {
                                        if (mes == 9) {
                                            System.out.println("Setembro");
                                        } else {
                                            if (mes == 10) {
                                                System.out.println("Outubro");
                                            } else {
                                                if (mes == 11) {
                                                    System.out.println("Novembro");
                                                } else {
                                                    if (mes == 12) {
                                                        System.out.println("Dezembro");
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }

private static void  ifSemFlecha() {

    int mes = 9;
    if (mes == 1) {
        System.out.println("Janeiro");
    } else if (mes == 2) {
        System.out.println("Fevereiro");
    } else if (mes == 3) {
        System.out.println("Março");
    } else if (mes == 4) {
        System.out.println("Abril");
    } else if (mes == 5) {
        System.out.println("Maio");
    } else if (mes == 6) {
        System.out.println("Junho");
    } else if (mes == 7) {
        System.out.println("Julho");
    } else if (mes == 8) {
        System.out.println("Agosto");
    } else if (mes == 9) {
        System.out.println("Setembro");
    } else if (mes == 10) {
        System.out.println("Outubro");
    } else if (mes == 11) {
        System.out.println("Novembro");
    } else if (mes == 12) {
        System.out.println("Dezembro");
    }
}

 /**
 * O código abaixo é uma má prática, o if não deve ser utilizado para analisar apenas 
 * 1 variável
 * Neste caso deve ser utilizado o Switch.
 */

private static void ifFerias() {
    String mes = "Julho";
    if (mes == "Julho" || mes == "Dezembro" || mes == "Janeiro") {
        System.out.println("Férias");
    }
}

private static void ifMenor() {
    double salarioMensal = 11893.58d;
    double mediaSalario = 10500d;

    int quantidadeDependentes = 4;
    int mediaDependentes = 2;

    if ((salarioMensal < mediaSalario) && (quantidadeDependentes >= mediaDependentes)) {
        System.out.println("Funcionário deve receber auxílio.");
    }

    boolean salarioBaixo = salarioMensal < mediaSalario;
    boolean muitosDependentes = quantidadeDependentes >= mediaDependentes;

    if ((salarioBaixo) && (muitosDependentes)) {
        System.out.println("Funcionário deve receber auxílio.");
    } // Deve ser evitada. Os códigos abaixo são melhores.

    boolean recebeAuxilio = (salarioBaixo) && (muitosDependentes);
    if (recebeAuxilio) {
        System.out.println("Funcionário deve receber auxílio.");
    } else {
        System.out.println("Funcinário não deve receber auxílio.");
    }
}

public static void switchSemana() {
    String dia = "Terça";
    switch (dia){
        case "Segunda":
            System.out.println(2);
            break;
        case "Terça":
            System.out.println(3);
            break;
        case "Quarta":
            System.out.println(4);
            break;
        case "Quinta":
            System.out.println(5);
            break;
        case "Sexta":
            System.out.println(6);
            break;
        case "Sabado":
            System.out.println(7);
            break;
        case "Domingo":
            System.out.println(1);
            break;
        default:
            System.out.println(1);
                System.out.println("Dia inválido.");
            break;
    }
}

private static void switchNumero() {

    int numero = 4;
    switch (numero){
        case 1:
        case 2:
        case 3:
            System.out.println("Certo");
            break;
        case 4:
            System.out.println("Errado");
            break;
        case 5:
            System.out.println("Talvez");
            break;
        default:
            System.out.println("Valor indevido.");
            break;
    }
}

private static void switchFerias() {

    String mes = "Dezembro";
    switch (mes) {
        case "Dezembro":
        case "Julho":
        case "Janeiro":
            System.out.println("Férias.");
            break;
        default:
            System.out.println("Mês Indevido.");
            break;
    }
}

}

