import java.util.UUID;
public class Equipamento {
    private String codigo;
    private String nome;
    private String tipo;
    private int quantidade;
    private double valor;
    private boolean seguro;
    private boolean statusAluguel;
    public Equipamento() {
        codigo = "";
        nome = "";
        tipo = "";
        quantidade = 0;
        valor = 0.0;
        seguro = false;
        statusAluguel = false;
    }
    public Equipamento(String nome, String tipo, int quantidade, double valor) {
        this.codigo = UUID.randomUUID().toString();
        if (nome != null && !nome.isEmpty()) this.nome = nome;
        if (tipo != null && !tipo.isEmpty()) this.tipo = tipo;
        if (quantidade > 0) this.quantidade = 0;
        if (valor > 0) this.valor = 0;
        this.seguro = false;
        this.statusAluguel = false;
    }
    //getters
    public String getCodigo() {
        return codigo;
    }
    public String getNome() {
        return nome;
    }
    public String getTipo() {
        return tipo;
    }
    public int getQuantidade() {
        return quantidade;
    }
    public double getValor() {
        return valor;
    }
    public boolean getSeguro() { return seguro; }
    public boolean getStatusAluguel() {
        return statusAluguel;
    }

    //setters
    public void setCodigo() { if (this.codigo.isEmpty()) this.codigo = UUID.randomUUID().toString(); }
    public void setNome(String nome) {
        if (nome != null && !nome.isEmpty()) this.nome = nome;
    }
    public void setTipo(String tipo) {
        if (tipo != null && !tipo.isEmpty()) this.tipo = tipo;
    }
    public void setQuantidade(int quantidade) {
        if (quantidade > 0) this.quantidade = quantidade;
    }
    public void setValor(double valor) {
        if (valor > 0) this.valor = valor;
    }
    public void setSeguro(boolean seguro) {
        this.seguro = seguro;
    }
    public void setStatusAluguel(boolean statusAluguel) {
        this.statusAluguel = statusAluguel;
    }

    //to string
    public String toString() {
        return  "Código: " + codigo +
                "\nNome: " + nome +
                "\nTipo: " + tipo +
                "\nQuantidade: " + quantidade +
                "\nValor: " + valor +
                "\nSeguro: " + (seguro ? "Sim" : "Não") +
                "\nStatus de Aluguel: " + (statusAluguel ? "Alugado" : "Disponível");
    }
}
