import java.util.UUID;
public class Emprestimo {
    private String codigoEmprestimo;
    private Equipamento equipamento;
    private Cliente cliente;
    private boolean ativo;
    private boolean seguro;
    private int qtdHoras;

    public Emprestimo() {
        codigoEmprestimo = "";
        equipamento = null;
        cliente = null;
        ativo = false;
        seguro = false;
        qtdHoras = 0;
    }
    public Emprestimo(Equipamento equ, Cliente cliente, int qtdHoras, boolean seguro) {
        this.codigoEmprestimo = UUID.randomUUID().toString();
        if (equ != null) {
            this.equipamento = equ;
            equ.setStatusAluguel(true);
        }
        if (cliente != null) this.cliente = cliente;
        this.ativo = true;
        this.seguro = seguro;
        if (qtdHoras>0) this.qtdHoras = qtdHoras;
    }

    //getters
    public String getCodigoEmprestimo() { return codigoEmprestimo; }
    public Equipamento getEquipamento() { return equipamento; }
    public Cliente getCliente() { return cliente; }
    public boolean getStatusEmprestimo() { return ativo; }
    public boolean getStatusSeguro() { return seguro; }
    public int getQtdHoras() { return qtdHoras; }

    //setters
    public void setCodigoEmprestimo() { if (this.codigoEmprestimo.isEmpty()) this.codigoEmprestimo = UUID.randomUUID().toString(); }
    public void setEquipamento(Equipamento equipamento) { if (equipamento != null) this.equipamento = equipamento; }
    public void setCliente(Cliente cliente) { if (cliente != null) this.cliente = cliente; }
    public void setStatusEmprestimo(boolean ativo) { this.ativo = ativo; }
    public void setStatusSeguro(boolean seguro) { this.seguro = seguro; }
    public void setQtdHoras(int qtdHoras) { if (qtdHoras>0) this.qtdHoras = qtdHoras; }
}
