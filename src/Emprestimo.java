import java.util.UUID;
public class Emprestimo {
    private String codigoEmprestimo;
    private Equipamento equipamento;
    private Cliente cliente;
    private boolean ativo, seguro;
    private int qtdHoras;
    private double valorInicial, valorFinal;

    public Emprestimo() {
        codigoEmprestimo = "";
        equipamento = null;
        cliente = null;
        ativo = false;
        seguro = false;
        qtdHoras = 0;
        valorInicial = 0;
        valorFinal = 0;
    }
    public Emprestimo(Equipamento equ, Cliente cliente, int qtdHoras, boolean seguro) {
        this.codigoEmprestimo = UUID.randomUUID().toString().substring(32, 36);
        double auxDesconto;
        if (equ != null) {
            this.equipamento = equ;
            equ.setStatusAluguel(true);
            if (cliente != null) {
                this.cliente = cliente;
                cliente.addQtdEquipamentos();
            }
            this.ativo = true;
            this.seguro = seguro;
            if (qtdHoras>=36) {
                this.qtdHoras = qtdHoras;
                auxDesconto = equ.getValor()*qtdHoras;
                auxDesconto *= 0.1;
                this.valorInicial = (equ.getValor()*qtdHoras)-auxDesconto;
            } else if (qtdHoras >= 24) {
                this.qtdHoras = qtdHoras;
                auxDesconto = equ.getValor()*qtdHoras;
                auxDesconto *= 0.05;
                this.valorInicial = (equ.getValor()*qtdHoras)-auxDesconto;
            } else if (qtdHoras > 3) {
                this.qtdHoras = qtdHoras;
                valorInicial = equ.getValor()*qtdHoras;
            } else System.out.println("Mínimo 3 horas.");
        }
    }

    //getters
    public String getCodigoEmprestimo() { return codigoEmprestimo; }
    public Equipamento getEquipamento() { return equipamento; }
    public Cliente getCliente() { return cliente; }
    public boolean getStatusEmprestimo() { return ativo; }
    public boolean getStatusSeguro() { return seguro; }
    public int getQtdHoras() { return qtdHoras; }
    public double getValorInicial() { return valorInicial; }
    public double getValorFinal() { return valorFinal; }

    //setters
    public void setCodigoEmprestimo() { if (this.codigoEmprestimo.isEmpty()) this.codigoEmprestimo = UUID.randomUUID().toString(); }
    public void setEquipamento(Equipamento equipamento) { if (equipamento != null) this.equipamento = equipamento; }
    public void setCliente(Cliente cliente) { if (cliente != null) this.cliente = cliente; }
    public void setStatusEmprestimo(boolean ativo) { this.ativo = ativo; }
    public void setStatusSeguro(boolean seguro) { this.seguro = seguro; }
    public void setQtdHoras(int qtdHoras) { if (qtdHoras>0) this.qtdHoras = qtdHoras; }
    public void setValorInicial(double valorInicial) { if (valorInicial >= 0) this.valorInicial = valorInicial; }
    public void setValorFinal(int horasAdicionais, double valorHora) {
        if (horasAdicionais > 0) this.valorFinal = valorInicial + horasAdicionais*valorHora;
        else if (horasAdicionais == 0) this.valorFinal = valorInicial;
    }

    //toString
    public String toString() {
        return "Código Empréstimo: " + codigoEmprestimo +
               "\nEquipamento-> Nome: " + equipamento.getNome() + " Código: " + equipamento.getCodigo() +
               "\nCliente-> Empresa: " + cliente.getEmpresa() + " Responsável: " + cliente.getResponsavel() +
               "\nStatus empréstimo: " + (ativo ? "Ativo" : "Devolvido") +
               "\nSeguro: " + (seguro ? "Sim" : "Nao") +
               "\nQtdHoras: " + qtdHoras +
               "\nValor Inicial: R$" + valorInicial +
               "\nValor Final: R$" + valorFinal;

    }
}
