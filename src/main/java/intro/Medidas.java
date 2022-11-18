//1 - Pacote
package intro;

// 2 - referência as bibliotecas



// 3 - Classe
public class Medidas {
        // 3.1 - Aributos - caracteristicas

        // 3.2 - Métodos e Funções
        public static void main (String[] args){

            // Conditional = verify a condition - check a ask a person, a hardware or softeware

            // switch = selecionar o comportamento do programa conforme a escolha da pessoa ou do software

            String opcao = "melancia";

            switch (opcao){
                case "ifSimples":
                    System.out.println("Você escolheu executar o método ifSimples");
                    ifSimples();
                    break;
                case "curto":
                    System.out.println("Você escolheu executar o método calcularAreaModoCurto");
                    calcularAreaModoCurto();
                    break;
                case "extenso":
                    System.out.println("Você escolheu executar o método calcularAreaModoExtenso");
                    calcularAreaModoExtenso();
                    break;
                default:
                    System.out.println("Você escolheu outro valor que não tem uma ação associada");
                    break;
            }

        }
        public static void ifSimples(){

            // Conditional = verify a condition - check a ask a person, a hardware or softeware
            // if = se
            // else = senão

            String modo = "curto";

            if (modo == "curto"){
                calcularAreaModoCurto();
            }

            else {
                calcularAreaModoExtenso();
            }


        }
        public static void calcularAreaModoCurto(){
            System.out.println("Cálculo de áreas modo curto");

            int largura = 4;
            int comprimento = 3;

            System.out.println("Para largura de " + largura + "m" + " e comprimento de " + comprimento + "m" + " a área do tapete é de " + largura * comprimento + "m²");


        }
        public static void calcularAreaModoExtenso(){
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


}
