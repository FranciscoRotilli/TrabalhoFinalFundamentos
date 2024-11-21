import java.util.Scanner;
public class Emprestimo {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int opcao;

        do {
            menu();
            System.out.print("Digite a opção desejada ");
            opcao = in.nextInt();
            switch (opcao) {

                case 1:

            } while (opcao != 0);
        }
    }
    public static void menu(){
    System.out.println("1 – Incluir Cliente")
    System.out.println("2 – Mostrar clientes cadastrados")
    System.out.println("3 – Pesquisar cliente por nome")
    System.out.println("4 – Incluir equipamento")
    System.out.println("5 – Mostrar equipamentos")
    System.out.println("6 – Pesquisar equipamento por nome")
    System.out.println("7 – Retirar equipamento")
    System.out.println("8 – Devolver equipamento")
    System.out.println("9 – Quantidade total de equipamento disponíveis no sistema de empréstimo")
    System.out.println("10 - Sair do programa")
    }
}