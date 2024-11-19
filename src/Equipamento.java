public class Equipamento {
    private int codigo;
    private String nome;
    private int tipo;
    private int quantidade;
    private double valor;
    private boolean seguro;
    private boolean statusAluguel;
    public Equipamento() {
        codigo = 0;
        nome = "";
        tipo = 0;
        quantidade = 0;
        valor = 0.0;
        seguro = false;
        statusAluguel = false;
    }
    public Equipamento(int codigo, String nome, int tipo, int quantidade, double valor, boolean seguro) {
        if (codigo > 0) this.codigo = 0;
        if (nome != null && !nome.isEmpty()) this.nome = nome;
        if (tipo > 0) this.tipo = 0;
        if (quantidade > 0) this.quantidade = 0;
        if (valor > 0) this.valor = 0;
        this.seguro = seguro;
        this.statusAluguel = false;
    }
    //getters
    public int getCodigo() {
        return codigo;
    }
    public String getNome() {
        return nome;
    }
    public int getTipo() {
        return tipo;
    }
    public int getQuantidade() {
        return quantidade;
    }
    public double getValor() {
        return valor;
    }
    public boolean getSeguro() {
        return seguro;
    }
    pubic boolean getStatusAluguel() {
        return statusAluguel;
    }

    //setters
    public void setCodigo(int codigo) {
        if (codigo > 0) this.codigo = codigo;
    }
    public void setNome(String nome) {
        if (nome != null && !nome.isEmpty()) this.nome = nome;
    }
    public void setTipo(int tipo) {
        if (tipo > 0) this.tipo = tipo;
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
