import java.util.Scanner;
public class App {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        CadastroEquipa listaEquipa = new CadastroEquipa();
        int opcao;
        String nomeEquipa;
        do {
            menu();
            System.out.println("Digite a opção desejada ");
            opcao = in.nextInt();
            switch (opcao) {
                case 4:
                    if (incluiEquipamento(listaEquipa)) System.out.println("Equipamento cadastrado com sucesso!");
                    else System.out.println("Erro ao cadastrar equipamento!");
                break;
                case 5: mostraEquipamentos(listaEquipa);
                break;
                case 6:
                    System.out.println("Digite o nome do equipamento: ");
                    nomeEquipa = in.nextLine();
                    System.out.println(pesquisarEquipamentoPorNome(listaEquipa, nomeEquipa));
                break;
                case 7:
                    retirarEquipamento(listaEquipa);
                break;
                case 8:
                    devolverEquipamento(listaEquipa);
                break;
                case 9:
                    quantidadeTotalEquipamentos(listaEquipa);
                break;
            }
        } while (opcao != 11);
    }
    public static void menu(){
        System.out.println("1 – Incluir Cliente");
        System.out.println("2 – Mostrar clientes cadastrados");
        System.out.println("3 – Pesquisar cliente por nome");
        System.out.println("4 – Incluir equipamento");
        System.out.println("5 – Mostrar equipamentos");
        System.out.println("6 – Pesquisar equipamento por nome");
        System.out.println("7 – Retirar equipamento");
        System.out.println("8 – Devolver equipamento");
        System.out.println("9 – Quantidade total de equipamentos disponíveis no sistema de empréstimo");
        System.out.println("10 – Controle de caixa");
        System.out.println("11 - Sair do programa");
    }
    public static void menuCaixa(){
        System.out.println("1 – Consultar saldo em caixa");
        System.out.println("2 – Consultar saldo pendente");
        System.out.println("3 – Voltar para o menu principal");
    }
    public static boolean incluiEquipamento(CadastroEquipa listaEquipa) {
        Scanner in = new Scanner(System.in);
        String nome;
        String tipo;
        int quantidade;
        double valor;
        System.out.println("Digite o nome do equipamento: ");
        nome = in.nextLine();
        System.out.println("Digite o tipo do equipamento: ");
        tipo = in.nextLine();
        System.out.println("Digite o quantidade do equipamento: ");
        quantidade = in.nextInt();
        System.out.println("Digite o valor do equipamento: ");
        valor = in.nextDouble();
        Equipamento e = new Equipamento(nome, tipo, quantidade, valor);
        if (listaEquipa.adicionaEquipa(e)) {
            System.out.println("Equipamento adicionado com sucesso!");
            return true;
        } else {
            System.out.println("Erro ao adicionar equipamento, lista cheia.");
            return false;
        }
    }
    public static void mostraEquipamentos(CadastroEquipa listaEquipa) {
        System.out.println("Equipamentos cadastrados: \n");
        System.out.println(listaEquipa.mostraEquipamentos());
    }
    public static String pesquisarEquipamentoPorNome(CadastroEquipa listaEquipa, String nome) {
        Equipamento e = listaEquipa.buscaEquipaPeloNome(nome);
        if (e != null) {
            return e.toString();
        }
        return "Equipamento não encontrado";
    }
    public static void retirarEquipamento(CadastroEquipa listaEquipa) {
        Scanner in = new Scanner(System.in);
        String codigo;
        int opcao;
        String cliente;
        System.out.println("Digite o código do equipamento desejado: ");
        codigo = in.nextLine();
        Equipamento e = listaEquipa.buscaEquipaCodigo(codigo);
        if (e != null) {
            System.out.println("Equipamento encontrado!");
            System.out.println(e.toString());
            if (!e.getStatusAluguel()) {
                System.out.println("Deseja retirar o equipamento?");
                System.out.println("1 - Sim");
                System.out.println("2 - Nao");
                opcao = in.nextInt();
                if (opcao == 1) {
                    System.out.println("Digite o nome do cliente: ");
                    cliente = in.nextLine();
                    if (buscaClientePeloNome(cliente) != null) {
                        System.out.println("Cliente encontrado!");
                        if (e.retiraEquipamento()) System.out.println("Equipamento retirado com sucesso!");
                        else System.out.println("ERRO! Cliente já possui um equipamento desse tipo alugado.");
                    }
                } else if (opcao == 2) System.out.println("Retirada cancelada.");
                else System.out.println("ERRO! Opção inválida, tente novamente.");
            } else System.out.println("Equipamento alugado no momento, não é possível realizar retirada.");
        } else System.out.println("ERRO! Equipamento não encontrado.");

    }
    public static void devolverEquipamento(CadastroEquipa listaEquipa) {
        Scanner in = new Scanner(System.in);
        String codigo;
        int opcao;
        System.out.println("Digite o código do equipamento a ser devolvido: ");
        codigo = in.next();
        Equipamento e = listaEquipa.buscaEquipaCodigo(codigo);
        if (e != null) {
            if (e.devolveEquipamento()) System.out.println("Equipamento devolvido com sucesso!");
            else System.out.println("ERRO! Equipamento não está alugado.");
        } else System.out.println("ERRO! Equipamento não encontrado.");
    }
    public static void quantidadeTotalEquipamentos(CadastroEquipa listaEquipa) {
        System.out.println("Existem " + listaEquipa.totalEquipamentos() + " equipamentos cadastrados.");
    }

}