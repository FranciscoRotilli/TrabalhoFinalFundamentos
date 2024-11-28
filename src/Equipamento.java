import java.util.UUID;
public class Equipamento {
    private String codigo;
    private String nome;
    private String tipo;
    private double valor;
    private boolean statusAluguel;

    //constructors
    public Equipamento() {
        codigo = "";
        nome = "";
        tipo = "";
        valor = 0.0;
        statusAluguel = false;
    }
    public Equipamento(String nome, String tipo, double valor) {
        this.codigo = UUID.randomUUID().toString().substring(30, 36);
        if (nome != null && !nome.isEmpty()) this.nome = nome;
        if (tipo != null && !tipo.isEmpty()) this.tipo = tipo;
        if (valor > 0) this.valor = valor;
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
    public double getValor() {
        return valor;
    }
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
    public void setValor(double valor) {
        if (valor > 0) this.valor = valor;
    }
    public void setStatusAluguel(boolean statusAluguel) {
        this.statusAluguel = statusAluguel;
    }

    //toSstring
    public String toString() {
        return  "Código: " + codigo +
                "\nNome: " + nome +
                "\nTipo: " + tipo +
                "\nValor: R$" + valor + "/hora" +
                "\nStatus de Aluguel: " + (statusAluguel ? "Alugado" : "Disponível");
    }
}
