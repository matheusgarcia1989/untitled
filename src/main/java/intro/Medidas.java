//1 - Pacote
package intro;

// 2 - referência as bibliotecas


import java.util.Scanner;

// 3 - Classe
public class Medidas {
    // 3.1 - Aributos - caracteristicas

    // 3.2 - Métodos e Funções
    public static void main(String[] args) {

        // Conditional = verify a condition - check a ask a person, a hardware or softeware

        // Utilizar a classe Scanner do Java para ler a escolha do usuário no console
        Scanner scanner = new Scanner(System.in);
        System.out.println("M E N U   D E   O P Ç Õ E S");
        System.out.println("c - Calcular Area Modo Curto");
        System.out.println("e - Calcular Area Modo Extenso");
        System.out.println("i - If Simples");
        System.out.println("d - Contar Ate Dez");
        System.out.println("r - Contagem Regressiva");
        System.out.println("Qual a opção desejada: ");
        String opcao = scanner.next();

        // switch = selecionar o comportamento do programa conforme a escolha da pessoa ou do software

        switch (opcao) {
            case "c":
            case "C":
                System.out.println("Você escolheu executar o método calcularAreaModoCurto");
                calcularAreaModoCurto();
                break;
            case "e":
            case "E":
                System.out.println("Você escolheu executar o método calcularAreaModoExtenso");
                calcularAreaModoExtenso();
                break;
            case "d":
            case "D":
                System.out.println("Você escolheu executar o método contarAteDez");
                contarAteDez();
                break;
            case "i":
            case "I":
                System.out.println("Você escolheu executar o método ifSimples");
                ifSimples();
                break;
            case "r":
            case "R":
                System.out.println("Você escolheu executar o método Contagem regressiva");
                contagemRegressiva();
                break;
            default:
                System.out.println("Você escolheu outro valor que não tem uma ação associada");
                break;
        }

    }

    public static void ifSimples() {

        // Conditional = verify a condition - check a ask a person, a hardware or softeware
        // if = se
        // else = senão

        String modo = "curto";

        if (modo == "curto") {
            calcularAreaModoCurto();
        } else {
            calcularAreaModoExtenso();
        }


    }

    public static void calcularAreaModoCurto() {
        System.out.println("Cálculo de áreas modo curto");

        int largura = 4;
        int comprimento = 3;

        System.out.println("Para largura de " + largura + "m" + " e comprimento de " + comprimento + "m" + " a área do tapete é de " + largura * comprimento + "m²");


    }

    public static void calcularAreaModoExtenso() {
        System.out.println("Cálculo de áreas modo extenso");

        // Calculo de área - Exemplo: o tamanho do tapete ou do piso
        int largura;
        int comprimento;
        int resultado;

        largura = 5; // largura recebe 4 unidades
        comprimento = 6; // comprimento recebe 3 unidades

        resultado = largura * comprimento;
        System.out.println("Para largura de " + largura + "m" + " e comprimento de " + comprimento + "m" + " a área do tapete é de " + resultado + "m²");
    }

    public static void contarAteDez() {
        // Loops ou Repetições
        //
        System.out.println("Contagem crescente: ");
        for (int numero = 1; numero <= 10; numero++) {
            System.out.println(numero);
        }
    }

    public static void contagemRegressiva() {
        System.out.println("Contagem regressiva: ");

        for (int numero = 10; numero > -1; numero--) {
            System.out.println(numero);
        }
    }
}