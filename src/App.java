import java.util.Scanner;
public class App {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        CadastroEquipa listaEquipa = new CadastroEquipa();
        CadastroCliente listaCliente = new CadastroCliente();
        CadastroEmprestimo listaEmprestimo = new CadastroEmprestimo();
        { //Pré-cadastro para testes
            Equipamento a = new Equipamento("Vega Laser Ibramed Aparelho de Laser de Alta Potência para Depilação", "Laser para Depilação", 259.89);
            listaEquipa.adicionaEquipa(a);
            Equipamento b = new Equipamento("Alfamed Eletrocardiógrafo 12 Canais Ritmus 600", "Eletrocardiógrafo", 51.66);
            listaEquipa.adicionaEquipa(b);
            Equipamento c = new Equipamento("Alfamed Ultrassom Portátil Invictus C5 Plus", "Ultrassom", 251.16);
            listaEquipa.adicionaEquipa(c);
            Equipamento d = new Equipamento("Criodermis Aparelho De Criolipólise de Placas da Medical San", "Criolipólise", 171.19);
            listaEquipa.adicionaEquipa(d);
            Equipamento e = new Equipamento("BeautiFill Sculpting Perfection", "Lipoaspiração", 396.19);
            listaEquipa.adicionaEquipa(e);
            Equipamento f = new Equipamento("Canfield Scientific HairMetrix", "Imagem", 86.19);
            listaEquipa.adicionaEquipa(f);

            Cliente g = new Cliente("Francisco Coimbra Rotilli", "DermoClínica Clínica de Embelezamento");
            listaCliente.adicionaCliente(g);
            Cliente h = new Cliente("José Francisco Da Silva", "LipoDerma Clínica de Lipoaspiração");
            listaCliente.adicionaCliente(h);
            Cliente i = new Cliente("Filipe Pedrozo Lopes", "DepiLaser Clínica de depilação à laser");
            listaCliente.adicionaCliente(i);

            Emprestimo j = new Emprestimo(f, g, 24, true);
            listaEmprestimo.registraEmprestimo(j);
            listaEmprestimo.devolveEmprestimo(j, 0);

            Emprestimo k = new Emprestimo(d, h, 36, false);
            listaEmprestimo.registraEmprestimo(k);
        }
        int opcao;
        String nomeEquipa, nomeCliente;
        System.out.println("Olá, bem vindo ao sistema integrado da Less is More");
        do {
            menu();
            opcao = in.nextInt();
            switch (opcao) {
                case 1:
                    in.nextLine();
                    if (incluiCliente(listaCliente)) System.out.println("Cliente cadastrado com sucesso!");
                    else System.out.println("Erro ao cadastrar cliente!");
                break;

                case 2:
                    in.nextLine();
                    mostrarClientes(listaCliente);
                break;

                case 3:
                    in.nextLine();
                    System.out.println("Digite o nome do Cliente: ");
                    nomeCliente = in.nextLine();
                    System.out.println(buscaClientePeloNomeDoResponsavel(listaCliente, nomeCliente));
                break;

                case 4:
                    in.nextLine();
                    if (incluiEquipamento(listaEquipa)) System.out.println("Equipamento cadastrado com sucesso!");
                    else System.out.println("Erro ao cadastrar equipamento!");
                break;

                case 5:
                    in.nextLine();
                    mostrarEquipamentos(listaEquipa);
                break;

                case 6:
                    in.nextLine();
                    System.out.println("Digite o nome do equipamento: ");
                    nomeEquipa = in.nextLine();
                    System.out.println(pesquisarEquipamentoPorNome(listaEquipa, nomeEquipa));
                break;

                case 7:
                    in.nextLine();
                    novoEmprestimo(listaEquipa, listaCliente, listaEmprestimo);
                break;

                case 8:
                    in.nextLine();
                    devolverEmprestimo(listaEmprestimo);
                break;

                case 9:
                    in.nextLine();
                    quantidadeTotalEquipamentosDisponeiveis(listaEquipa);
                break;

                case 10:
                    in.nextLine();
                    mostrarEmprestimos(listaEmprestimo);
                break;

                case 11:
                    in.nextLine();
                    buscarEmprestimoEmpresa(listaEmprestimo);
                break;

                case 12:
                    in.nextLine();
                    System.out.printf("\nSaldo disponível em caixa: R$%.2f\n", consultarSaldoCaixa(listaEmprestimo));
                break;

                case 13:
                    in.nextLine();
                    System.out.printf("\nSaldo pendente em empréstimos: R$%.2f\n", consultarSaldoPendente(listaEmprestimo));
                break;
                case 0: System.out.println("Saindo... Até mais!");
                break;
                default: System.out.println("Opção invalida.");
            }
        } while (opcao != 0);
    }
    public static void menu(){
        System.out.println("Digite a opção desejada: ");
        System.out.println("1 – Incluir Cliente");
        System.out.println("2 – Listar clientes cadastrados");
        System.out.println("3 – Pesquisar cliente por nome do responsável");
        System.out.println("4 – Incluir equipamento");
        System.out.println("5 – Listar equipamentos");
        System.out.println("6 – Pesquisar equipamento por nome");
        System.out.println("7 – Novo Empréstimo");
        System.out.println("8 – Devolver Empréstimo");
        System.out.println("9 – Quantidade total de equipamentos disponíveis");
        System.out.println("10 – Listar Empréstimos");
        System.out.println("11 – Buscar Empréstimos por empresa cliente");
        System.out.println("12 – Consultar saldo em caixa");
        System.out.println("13 – Consultar saldo pendente");
        System.out.println("0 - Sair do programa");
    }
    public static boolean incluiCliente(CadastroCliente listaCliente) {
        Scanner in = new Scanner(System.in);
        String responsavel;
        String empresa;
        System.out.println("Digite o nome do responsável: ");
        responsavel = in.nextLine();
        System.out.println("Digite o nome da empresa: ");
        empresa = in.nextLine();
        if (listaCliente.buscaClientePelaEmpresa(empresa) == null) {
            Cliente c = new Cliente(responsavel, empresa);
            return listaCliente.adicionaCliente(c);
        }
        return false;
    }
    public static void mostrarClientes(CadastroCliente listaCliente) {
        System.out.println("Clientes cadastrados: \n");
        System.out.println(listaCliente.mostraClientes());
    }
    public static String buscaClientePeloNomeDoResponsavel(CadastroCliente listaCliente, String nome) {
        Cliente c = listaCliente.buscaClientePeloResponsavel(nome);
        if (c != null) {
            return c.toString();
        }
        return "Cliente não encontrado";
    }
    public static boolean incluiEquipamento(CadastroEquipa listaEquipa) {
        Scanner in = new Scanner(System.in);
        String nome;
        String tipo;
        double valor;
        System.out.println("Digite o nome do equipamento: ");
        nome = in.nextLine();
        System.out.println("Digite o tipo do equipamento: ");
        tipo = in.nextLine();
        System.out.println("Digite o valor do equipamento: ");
        valor = in.nextDouble();
        in.nextLine();
        Equipamento e = new Equipamento(nome, tipo, valor);
        return listaEquipa.adicionaEquipa(e);
    }
    public static void mostrarEquipamentos(CadastroEquipa listaEquipa) {
        System.out.println("Equipamentos cadastrados: \n");
        System.out.println(listaEquipa.mostrarEquipamentos());
    }
    public static String pesquisarEquipamentoPorNome(CadastroEquipa listaEquipa, String nome) {
        Equipamento e = listaEquipa.buscaEquipaPeloNome(nome);
        if (e != null) {
            return e.toString();
        }
        return "Equipamento não encontrado";
    }
    public static void novoEmprestimo(CadastroEquipa listaEquipa, CadastroCliente listaCliente, CadastroEmprestimo listaEmprestimo) {
        Scanner in = new Scanner(System.in);
        String codigo;
        int opcao, horas;
        boolean seguro = false;
        String cliente;
        System.out.println("Digite o código do equipamento desejado: ");
        codigo = in.nextLine();
        Equipamento e = listaEquipa.buscaEquipaCodigo(codigo);
        if (e != null) {
            System.out.println("Equipamento encontrado!");
            System.out.println(e);
            if (!e.getStatusAluguel()) {
                System.out.println("Deseja retirar o equipamento?");
                System.out.println("1 - Sim");
                System.out.println("2 - Nao");
                opcao = in.nextInt();
                in.nextLine();
                if (opcao == 1) {
                    System.out.println("Digite a matricula do cliente: ");
                    cliente = in.next();
                    Cliente c = listaCliente.buscaClientePelaMatricula(cliente);
                    if (c != null) {
                        System.out.println("Cliente encontrado!");
                        boolean tipoJaAlugado = false;
                        for (int i=0; i<listaEmprestimo.getIndex(); i++) {
                            if (listaEmprestimo.buscaEmprestimosPeloNomeEmpresa(c.getEmpresa())[i] != null &&
                                    listaEmprestimo.buscaEmprestimosPeloNomeEmpresa(c.getEmpresa())[i].getStatusEmprestimo() &&
                                    listaEmprestimo.buscaEmprestimosPeloNomeEmpresa(c.getEmpresa())[i].getEquipamento().getTipo().equalsIgnoreCase(e.getTipo())) {
                                tipoJaAlugado = true;
                                break;
                            }
                        }
                        if (!tipoJaAlugado) {
                            System.out.println("Digite a quantidade de horas do empréstimo: ");
                            horas = in.nextInt();
                            in.nextLine();
                            if (horas > 3) {
                                System.out.println("Deseja contratar seguro? S/N");
                                seguro = in.next().equalsIgnoreCase("S");
                                in.nextLine();
                                Emprestimo emp = new Emprestimo(e, c, horas, seguro);
                                if (listaEmprestimo.registraEmprestimo(emp)) System.out.println("Equipamento retirado com sucesso!");
                                else System.out.println("ERRO!");
                            } else System.out.println("Erro! Mínimo de 3 horas de aluguel.");
                        } else System.out.println("Erro! O cliente já possui um equipamento deste tipo alugado.");
                    }
                } else if (opcao == 2) System.out.println("Retirada cancelada.");
                else System.out.println("ERRO! Opção inválida, tente novamente.");
            } else System.out.println("Equipamento alugado no momento, não é possível realizar retirada.");
        } else System.out.println("ERRO! Equipamento não encontrado.");
    }
    public static void devolverEmprestimo(CadastroEmprestimo listaEmprestimo) {
        Scanner in = new Scanner(System.in);
        String codigo;
        int opcao, horasAdicionais;
        System.out.println("Digite o código do empréstimo: ");
        codigo = in.next();
        in.nextLine();
        Emprestimo e = listaEmprestimo.buscaEmprestimoCodigo(codigo);
        if (e != null) {
            System.out.println(e);
            System.out.println("Empréstimo encontrado, deseja devolver? ");
            System.out.println("1 - Sim");
            System.out.println("2 - Nao");
            opcao = in.nextInt();
            in.nextLine();
            if (opcao == 1) {
                System.out.println("Digite a quantidade de horas adicionais: ");
                horasAdicionais = in.nextInt();
                in.nextLine();
                if (listaEmprestimo.devolveEmprestimo(e, horasAdicionais)) System.out.println("Empréstimo devolvido com sucesso!");
                else System.out.println("ERRO! Empréstimo já foi devolvido.");
            } else if (opcao == 2) System.out.println("Devolução cancelada.");
            else System.out.println("ERRO! Opção inválida, tente novamente.");
        } else System.out.println("ERRO! Empréstimo não encontrado.");
    }
    public static void quantidadeTotalEquipamentosDisponeiveis(CadastroEquipa listaEquipa) {
        System.out.println("Existem " + listaEquipa.totalEquipamentos() + " equipamentos cadastrados. " + listaEquipa.totalEquipamentosDisponiveis() + " estão disponíveis.");
    }
    public static void mostrarEmprestimos(CadastroEmprestimo listaEmprestimo) {
        System.out.println("Empréstimos registrados: \n");
        System.out.println(listaEmprestimo.mostrarEmprestimos());
    }
    public static void buscarEmprestimoEmpresa(CadastroEmprestimo listaEmprestimo) {
        Scanner in = new Scanner(System.in);
        String nome;
        System.out.println("Digite o nome da empresa cliente: ");
        nome = in.nextLine();
        if (listaEmprestimo.buscaEmprestimosPeloNomeEmpresa(nome)[0] != null && listaEmprestimo.buscaEmprestimosPeloNomeEmpresa(nome)[0].getCliente().getEmpresa().equalsIgnoreCase(nome)) {
            Emprestimo[] emp = listaEmprestimo.buscaEmprestimosPeloNomeEmpresa(nome);
            for (int i = 0; i < listaEmprestimo.buscaEmprestimosPeloNomeEmpresa(nome).length; i++) {
                if (emp[i] != null) {
                    System.out.println(emp[i].toString() + "\n\n");
                }
            }
        } else System.out.println("Empresa não encontrada ou sem empréstimos registrados.");
    }
    public static double consultarSaldoCaixa(CadastroEmprestimo listaEmprestimo) {
        double saldo = 0.0;
        for (int i = 0; i < listaEmprestimo.getIndex(); i++) {
            if(!listaEmprestimo.getLista()[i].getStatusEmprestimo()) saldo += listaEmprestimo.getLista()[i].getValorFinal();
        }
        return saldo;
    }
    public static double consultarSaldoPendente(CadastroEmprestimo listaEmprestimo) {
        double saldo = 0.0;
        for (int i = 0; i < listaEmprestimo.getIndex(); i++) {
            if(listaEmprestimo.getLista()[i].getStatusEmprestimo()) saldo += listaEmprestimo.getLista()[i].getValorInicial();
        }
        return saldo;
    }
}